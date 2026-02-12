import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
    	 String fileName = "c:/Temp/outputByteStream";
    	 FileInputStream fis = null;
        try {
            // 읽을 파일의 경로를 지정합니다.
            fis = new FileInputStream(fileName);  //에러 발생 가능

            int data;
            // 파일에서 데이터를 하나씩 읽어옵니다. -1은 파일의 끝을 의미합니다.
            while ((data = fis.read()) != -1) {
                // 읽은 데이터를 문자로 변환하여 출력합니다.
                System.out.println(data);
            }
        } catch (IOException e) {
            // 파일 입출력 예외를 처리합니다.
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    // 파일 스트림을 닫습니다.
                    fis.close();  // 저장
                    System.out.println(fileName + "읽고 메모리에서 내립니다.");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
