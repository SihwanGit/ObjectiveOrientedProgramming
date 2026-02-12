import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Menu {
	Scanner key;
	
	private int getMenu() {
		key = new Scanner(System.in);
		System.out.println("=============== 문자 스트림 I/O ===============");
		System.out.println("[1] 파일 읽기");
		System.out.println("[2] 파일 쓰기");
		System.out.println("[3] 종료");
		System.out.print(">>>>>>>>>> 메뉴 선택 : ");
		int menu = key.nextInt();
		key.nextLine(); //Enter 처리
		return menu;
	}
	
	public void run(String user) {
		System.out.println("=======================================");
		System.out.println("[ "+user+" ]");
		
		while(true) {
			int menu = getMenu();
			switch(menu) {
			case 1:
				readFile();
				break;
			case 2:
				writeFile();
				break;
			case 3:
				System.out.println(user);
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		}
	}
	
	void readFile() {
		System.out.println("읽을 파일의 이름을 입력하세요");
		String fileName = key.nextLine();
		
		FileReader fis = null;
		
        try {
            // 읽을 파일의 경로를 지정합니다.
            fis = new FileReader(fileName);  //에러 발생 가능

            int data;
            // 파일에서 데이터를 하나씩 읽어옵니다. -1은 파일의 끝을 의미합니다.
            while ((data = fis.read()) != -1) {
                // 읽은 데이터를 문자로 변환하여 출력합니다.
                System.out.print((char)data);
            }
        } catch (IOException e) {
            // 파일 입출력 예외를 처리합니다.
        	System.out.println(fileName+" (지정된 파일을 찾을 수 없습니다)");
            e.printStackTrace();
        } finally {
            try { //닫기
                if (fis != null) {
                    // 파일 스트림을 닫습니다.
                	System.out.println("파일 읽기 완료: "+fileName);
                    fis.close();  // 저장
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	}
	
	void writeFile() {
		System.out.println("저장할 파일 이름을 입력하세요: ");
		String fileName = key.nextLine();
		
		System.out.println("파일에 쓸 내용을 입력하세요:(quit 종료) ");
		FileWriter fos = null;
		
		try {
            // 파일을 열거나 새로 생성하여 FileOutputStream 객체를 생성합니다.
            fos = new FileWriter(fileName);  //에러 발생 가능
    
            while(true) {
            	String data = key.nextLine();  //빈칸 포함
            	
            	if( data.equals("quit")) break;
                // 문자열 데이터를 바이트 배열로 변환하여 파일에 씁니다.
            	fos.write(data+"\n");  //메모리에 write, Enter 키 입력       	            	
            }
        } catch (IOException e) {
            // 파일 입출력 예외를 처리합니다.
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    // 파일 스트림을 닫습니다.
                    fos.close();  //저장 , 에러 발생 가능
                    System.out.println("파일 작성 완료: "+ fileName);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	}
}






