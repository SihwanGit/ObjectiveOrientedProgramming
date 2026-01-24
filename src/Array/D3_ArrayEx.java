package Array;
import java.util.Scanner;

public class D3_ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][][] str = new String[1][2][3];
		
		System.out.println("str.length = " + str.length);
		System.out.println("str[0].length = " + str[0].length);
		System.out.println("str[0][0].length = " + str[0][0].length);
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[0].length; j++) {
				for(int k = 0; k < str[0][0].length; k++) {
					str[i][j][k] = "Dongguk_"+i+j+k;
				}
			}
		}
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[0].length; j++) {
				for(int k = 0; k < str[0][0].length; k++) {
					System.out.println("str["+i+"]["+j+"]["+k+"]: "+str[i][j][k]);
				}
			}
		}
	}
	

}
