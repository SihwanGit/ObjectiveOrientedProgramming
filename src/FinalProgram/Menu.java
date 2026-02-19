package FinalProgram;
import java.util.*;
import java.io.*;

class Menu {
	Scanner key;
	
	private HashMap<String, MyStudent> studentMap = new HashMap<String,MyStudent>();
	
	void menuPrint() {
		System.out.println("\n---2024년 학생 정보 ---");
		System.out.println("1. 입력 (학생 정보)");
		System.out.println("2. 검색 (학생 이름)");
		System.out.println("3. 장학생 선정 (성적)");
		System.out.println("4. 출력 (젠체 학생");
		System.out.println("5. 파일 읽기 (c:/Temp/Student.txt");
		System.out.println("6. Exit (c:/Temp/Student.txt)");
		System.out.println("----------");
		System.out.print("Choose an option: ");
	}
	
	private int getMenu() {
		key = new Scanner(System.in);
		menuPrint();
		int menu;
		while(true) {
			try {
				menu = key.nextInt();
				return menu;
			}
			catch (InputMismatchException e) { //int가 아닐떄 에러처리
				System.out.println("정수만 입력하세요");
				key.nextLine();
				menuPrint();
			}
		}
	}
	
	public void run(String user) {
		System.out.println("====================");
		System.out.println(" [ " + user + " ] ");
		System.out.println("====================");
		
		while(true) {
			int choice = getMenu();
			
			switch(choice) {
			case 1:
				inputStudent(key);
				break;
			case 2:
				searchStudent(key);
				break;
			case 3:
				SelectScholarShipStudent();
				break;
			case 4:
				printStudent(); //전체 출력
				break;
			case 5:
				readStudent();
				break;
			case 6:
				printStudent();
				//file save
				System.out.println(user);
				System.out.println("기말고사 종료합니다.");
				return;
			}
		}
	}
	
	//1번
	private void inputStudent(Scanner scanner) {
		String name;
		String track;
		int id;
		double grade;
		
		scanner.nextLine();
		System.out.print("이름>>");
		name = scanner.nextLine();
		
		System.out.print("전공>>");
		track = scanner.nextLine();
		
		System.out.print("학번>>");
		id = scanner.nextInt();
		
		System.out.print("학점>>");
		grade = scanner.nextDouble();
		MyStudent ms = new MyStudent(name, track, id, grade); //학생 생성
		studentMap.put(name, ms);
		System.out.print("--- studentMap에 put 하였습니다 ---\n");
	}
	
	//2번
	private void searchStudent(Scanner scanner) {
		String name;
		
		System.out.print("학생 이름 >>");
		name = scanner.nextLine();
		MyStudent ms = studentMap.get(name); //이름 검색해 반환
		ms.toString(); //정보 출력
	}
	
	// 3번
	private void SelectScholarShipStudent() {
		System.out.print("장학생 최하 학점 입력: ");
		double credits = key.nextDouble();
		
		Vector<MyStudent> scholarVec = new Vector<>();
		
		Set<String> keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			MyStudent s = studentMap.get(name);
			System.out.print("이름: "+ name);
			System.out.print("	전공: " + s.getTrack());
			System.out.print("	학번: "+ s.getId());
			System.out.println("	학점:"+ s.getGrade());
		//credit 이상의 성적이면 장학생 벡터에 저장
			if(s.getGrade() > credits) {
				scholarVec.add(s);
			}
		}
		System.out.println("--------------------");
		for(int i = 0; i < scholarVec.size(); i++) {
			System.out.println("장학생: " + scholarVec.get(i));
		}
		System.out.println("--------------------");
	}
	
	//4번
	private void printStudent() {
		Set<String> keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			MyStudent s = studentMap.get(name);
			System.out.print("이름: "+ name);
			System.out.print("	전공: " + s.getTrack());
			System.out.print("	학번: "+ s.getId());
			System.out.println("	학점:"+ s.getGrade());
		}	
	}
	
	//5번
	private void readStudent() {
		String filename = "c:/Temp/Student.txt";
		System.out.print(filename + "을 읽어 올까요? (y/n) ");
		String yes = key.next();
		if(yes.charAt(0) != 'y') return;
		
		FileReader reader = null;
		BufferedReader br = null;
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			String line;
			while((line = br.readLine()) != null) {
				String[] studentData = line.split("=");
				if(studentData.length == 2) {
					String name = studentData[0];
					String temp = studentData[1];
					String[] myStudentData = temp.split(",");
					
					String track = myStudentData[1];
					int id = Integer.parseInt(myStudentData[2]);
					double grade = Double.parseDouble(myStudentData[3]);
					
					studentMap.put(name, new MyStudent(name, track, id, grade));
					
				}
			}
			System.out.println("--- studentMap에 put 하였습니다 ---");
			System.out.println(filename+ " 파일에서 학생 정보를 불러왔습니다.");
			
		} catch(IOException e) {
			System.out.println("파일 읽기 오류: " + e.getMessage());
		} finally {
			try {
				if (br != null) br.close();
			} catch(IOException e) {
				System.out.println("파일 닫기 오류: "+e.getMessage());
			}
		}
		printStudent();
	}
}
