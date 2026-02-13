package exception;
import java.util.*;
import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader readFile;
		
		try {
			readFile("c:/Temp/example.txt");
		} catch (IOException e) {
			System.out.println("An error occurred: "+ e.getMessage());
		}
		
		public static void readFile(String fileName) throws IOException {
			FileReader frs = null;
			
			try {
				frs = new FIleReader(fileName);
			}
			catch(FileNotFountException e) {
				System.out.println("파일이 존재하지 않습니다.");
			}
			
			BufferedReader reader = new BufferedReader(frs);
			String line;
			
			while(true) {
				try {
					line = reader.readLine();
				}
				catch(IOException e) {
					System.out.println("reader.readLine()을 할 수 없습니다.");
				}
				if (line != null) break;
				System.out.println(line);
				
			}
			reader.close();
		}
	}
}
