package Fashion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Menu {
	Scanner key;
	
	private HashMap<String, String> styleMap = new HashMap<> ();
	private boolean flag = false;
	void menuPrint() {
		if(!flag) {
			initializeStyles();
			flag = true;
		}
		System.out.println("\n---2024년 패션 추천 ---");
		System.out.println("1. Spring");
		System.out.println("2. Summer");
		System.out.println("3. Fall");
		System.out.println("4. Winter");
		System.out.println("----------");
		System.out.println("5. File Read");
		System.out.println("6. File Save");
		System.out.println("7. Search");
		System.out.println("8. Exit");
		System.out.print("Choose an option: ");
	}
	
	//추천 스타일 초기화
	private void initializeStyles() {
		styleMap.put("Spring_Warm", "가벼운 청바지와 블라우스");
		styleMap.put("Spring_Cool", "얇은 니트와 스커트");
		styleMap.put("Summer_Hot", "반바지와 민소매 티셔츠");
		styleMap.put("Summer_Cool", "얇은 가디건과 원피스");
		styleMap.put("Fall_Warm", "트렌치코드와 슬랙스");
		styleMap.put("Fall_Cool", "니트와 체크무늬 스커트");
		styleMap.put("Winter_Cold", "패딩과 목도리");
		styleMap.put("Winter_Cool", "울 코트와 부츠");
		
		System.out.println("기본 스타일 추천");
		System.out.println("Spring_Warm"+"="+"가벼운 청바지와 블라우스");
		System.out.println("Spring_Cool"+"="+"얇은 니트와 스커트");
		System.out.println("Summer_Hot"+"="+"반바지와 민소매 티셔츠");
		System.out.println("Summer_Cool"+"="+"얇은 가디건과 원피스");
		System.out.println("Fall_Warm"+"="+"트렌치코트와 슬랙스");
		System.out.println("Fall_Cool"+"="+"니트와 체크무늬 스커트");
		System.out.println("Winter_Cold"+"="+"패딩과 목도리");
		System.out.println("Winter_Cool"+"="+"울 코트와 부츠");
	}
	
	//스타일 추천 메서드
	public String getRecommendedStyle(String season, String weather) {
		String key = season + "_" + weather;
		return styleMap.getOrDefault(key, "추천할 스타일이 없습니다. 다른 조합을 입력해 주세요.");
		//getOrDefault() 매서드는 중요하니까 메모장 꼭 보샘.
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
		System.out.println("==============================");
		System.out.println("["+user+"]");
		System.out.println("==============================");
		
		while(true) {
			int choice = getMenu();
			
			switch(choice) {
			case 1:
				spring(key);
				break;
			case 2:
				summer(key);
				break;
			case 3:
				fall(key);
				break;
			case 4:
				winter(key);
				break;
			case 5:
				readFashion(key);
				break;
			case 6:
				saveFashion(key);
				break;
			case 7:
				search(key);
				break;
			case 8:
				System.out.println(user);
				System.out.println("2024년 계절을 마음껏 누리세요^^");
				return;
			}
		}
	}
	
	private void spring(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1: Spring_Warm	2: Spring_Cool: ");
				number = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				key.nextLine(); //버퍼 한번 비워줘야함.
				System.out.print("1: Spring_Warm	2: Spring_Cool: ");
				number = scanner.nextInt();
			}
			//여기에 정수만 입력하도록 예외처리
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Spring", "Warm");
				System.out.println("추천 스타일: "+ result);
				return;
			case 2:
				result = getRecommendedStyle("Spring", "Cool");
				System.out.println("추천 스타일: "+ result);
				return;
			}
		}
	}
	
	//summer
	public void summer(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1: Summer_Hot	2: Summer_Cool: ");
				number = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				key.nextLine();
				System.out.print("1: Summer_Hot	2: Summer_Cool: ");
				number = scanner.nextInt();
			}
			//여기에 정수만 입력하도록 예외처리
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Summer", "Hot");
				System.out.println("추천 스타일: "+ result);
				return;
			case 2:
				result = getRecommendedStyle("Summer", "Cool");
				System.out.println("추천 스타일: "+ result);
				return;
			}
		}
	}
	
	//fall
	public void fall(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1: Fall_Warm	2: Fall_Cool: ");
				number = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				key.nextLine();
				System.out.print("1: Fall_Warm	2: Fall_Cool: ");
				number = scanner.nextInt();
			}
			//여기에 정수만 입력하도록 예외처리
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Fall", "Warm");
				System.out.println("추천 스타일: "+ result);
				return;
			case 2:
				result = getRecommendedStyle("Fall", "Cool");
				System.out.println("추천 스타일: "+ result);
				return;
			}
		}
	}
	
	//winter
	public void winter(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1: Winter_Cold	2: Winter_Cool: ");
				number = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				key.nextLine();
				System.out.print("1: Winter_Cold	2: Winter_Cool: ");
				number = scanner.nextInt();
			}
			//여기에 정수만 입력하도록 예외처리
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Winter", "Warm");
				System.out.println("추천 스타일: "+ result);
				return;
			case 2:
				result = getRecommendedStyle("Winter", "Cool");
				System.out.println("추천 스타일: "+ result);
				return;
			}
		}
	}
	
	
	private void search(Scanner scanner) {
		String season;
		String weather;
		System.out.print("계절 입력: ");
		season = key.next();
		System.out.print("날씨 입력: ");
		weather = key.next();
		
		String resultKey = season + "_" + weather; //_로 계절_날씨 형태로 전환
		key.nextLine(); //버퍼 한번 비우기
		String resultSearch = styleMap.get(resultKey); //키를 입력하고 값을 얻는 함수 get, 없으면 null 반환
		if(resultSearch == null) { //없으면 새로 삽입
			System.out.println("찾으시는 패션이 없습니다.");
			System.out.print("해당 키에 새로운 패션을 입력해주세요: ");
			String newFashion = key.nextLine(); //새로운 패션 입력
			styleMap.put(resultKey, newFashion); //삽입	
		} else { //있으면 그대로 출력
			System.out.println("찾으시는 패션은 "+ resultSearch +"입니다.");
		}
	}
	
	
	private void saveFashion(Scanner scanner) {
		System.out.print("파일 이름을 작성하세요: ");
		String filename = scanner.next();
		
		FileWriter writer = null;
		BufferedWriter bwr = null;
		
		try {
			writer = new FileWriter(filename);
			bwr = new BufferedWriter(writer);
			
			for(Map.Entry<String, String> entry : styleMap.entrySet()) {
				System.out.println(entry.getKey()+ "=" + entry.getValue());
				bwr.write(entry.getKey() + "=" + entry.getValue());
				bwr.newLine();
			}
		} catch(IOException e) {
			System.out.println("파일 닫기 오류: " + e.getMessage());
		} finally {
			//FileWriter 닫기
			try {
				if (bwr != null) bwr.close(); //save
				System.out.println("파일 저장 완료: "+ filename);
			} catch(IOException e) {
				System.out.println("파일 닫기 오류: "+ e.getMessage());
			}
		}
	}
	
	
	private void readFashion(Scanner scanner) {
		
		System.out.print("파일 이름을 작성하세요: ");
		String filename = scanner.next();
		FileReader reader = null;
		BufferedReader br;
		try {
			reader = new FileReader(filename);
			
			br = new BufferedReader(reader);
			String line;
			
			while((line = br.readLine()) != null) {
				String[] fashionData = line.split("="); //구분자
				if(fashionData.length == 2) {
					String season = fashionData[0];
					String style = fashionData[1];
					System.out.println(season+ "=" + style);
					styleMap.put(season, style);
				}
			} //end while
			
			System.out.println(filename + " 파일에서 패션 정보를 불러왔습니다.");
			
		} catch(IOException e) {
			System.out.println("파일 읽기 오류: "+ e.getMessage());
		} finally {
			try {
				if(reader != null) reader.close();
			} catch (IOException e) {
				System.out.println("파일 닫기 오류: "+ e.getMessage());
			}
		}
	}
}
