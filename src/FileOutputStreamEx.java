import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamEx {
    public static void main(String[] args) {
    	Scanner key = new Scanner(System.in);
        //String data = "Hello, FileOutputStream!"; // 파일에 쓸 데이터
        String fileName = "c:/Temp/outputByteStream";
        FileOutputStream fos = null;

        try {
            // 파일을 열거나 새로 생성하여 FileOutputStream 객체를 생성합니다.
            fos = new FileOutputStream(fileName);  //에러 발생 가능

    
            while(true) {
            	/*System.out.print("data (quit) :");
            	String data = key.nextLine();  //빈칸 포함
            	
            	if( data.equals("quit")) break;
                // 문자열 데이터를 바이트 배열로 변환하여 파일에 씁니다.
            	fos.write(data.getBytes());  //메모리에 write
            	*/
            	
            	System.out.print("data (0:exit) :");
            	int data = key.nextInt();  //빈칸 포함
            	if( data == 0) break;
            	fos.write(data);  //메모리에 write
            	
            }
        } catch (IOException e) {
            // 파일 입출력 예외를 처리합니다.
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    // 파일 스트림을 닫습니다.
                    fos.close();  //저장 , 에러 발생 가능
                    System.out.println(fileName +"  데이터가 파일에 성공적으로 저장되었습니다.");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}



