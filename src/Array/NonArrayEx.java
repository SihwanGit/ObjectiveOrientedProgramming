package Array;
import java.util.Scanner;

public class NonArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		System.out.print("col: ");
		int col = key.nextInt();
		
		String[][] str = new String[col][];
		//이렇게 되면 행만 있고 열이 없다.
		int row;
		for(int i = 0; i< str.length; i++) { //행의 길이
			System.out.print("str["+i+"]= ");
			row = key.nextInt(); //row 를 각각 입력
			str[i] = new String[row]; //각각의 행에 열 크기 지정
		}
		
		System.out.println("행열 초기화");
		for(int i = 0; i<str.length; i++) {
			for(int j=0; j < str[i].length; j++) {
				str[i][j] = "Dongguk_"+i+j;
			}
		}
		System.out.println("\n각 행 출력");
		for(int i = 0; i<str.length; i++) {
			for(int j=0; j < str[i].length; j++) {
				System.out.println("str["+i+"]["+j+"]:  "+str[i][j] );
			}
			System.out.println("");
		}
		key.close();
	}

}
