package Array;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바 프로그램의 룰
		//접근지정자가 public 이면서 동시에 main 메소드가 있어야한다.
		
		//자바 Data Type
		//byte, short, int, long
		//float, double
		//char
		
		int[] iNum = new int[5];
		for(int i = 0; i<5; i++) {
			iNum[i] = i+1;
		}
		for(int i = 0; i< 5; i++) {
			System.out.println(iNum[i]);
		}
		
		System.out.println("");
		double [] dNum=  new double[3];
		for(int i = 0; i < 3; i++) dNum[i] = i+3.14;
		for(int i = 0; i < 3; i++) System.out.println(dNum[i]);
		
		System.out.println("");
		char [] cData = new char[3];
		cData[0] = '동';
		cData[1] = '국';
		cData[2] = '대';
		for(int i = 0; i < 3; i++) System.out.print(cData[i] + " ");
		
		System.out.println("");
		System.out.println("");
		//불리안은 1bit만 가능. true OR false 만 가능
		boolean[] bData = new boolean[2];
		bData[0] = true;
		bData[1] = false;
		for(int i = 0; i < 2; i++) System.out.println(bData[i]);
		
		System.out.println("");
		String[] sData = new String[3];
		sData[0] = "동국대";
		sData[1] = "객체지향 프로그래밍";
		sData[2] = "김시환";
		for(int i = 0; i < 3; i++) System.out.println(sData[i]);
		System.out.println("");
		
		//이번에는 동적할당을 사용해 배열의 크기를 능동적으로 지정해보겠다.
		System.out.print("배열의 크기를 입력하세요: ");
		Scanner sca = new Scanner(System.in);
		int index = sca.nextInt();
		int[] dainamicInt = new int [index];
		System.out.println("배열의 크기 : " + index);
		for(int i = 0; i < index; i++) {
			dainamicInt[i] = i+1;
			System.out.println(dainamicInt[i]);
		}
		
		//이렇게 하나의 배열을 공유하는 것도 가능하다.
		int [] kim;
		kim = iNum;
		System.out.println("");
		for(int i = 0; i < 3; i++) System.out.println(kim[i]);
		
		//이차원 배열
		String[][] str;
		str = new String[2][3]; //2행 3열
		//이거 크기 입력해서 행과 열을 각각 입력할 수 있다.
		
		System.out.println("");
		System.out.println("str.length = " + str.length);
		//얘는 행의 수만 나온다.
		System.out.println("str[0].length = " + str[0].length);
		//이렇게 해야 열의 수가 나온다.
		
		for(int i = 0; i < 2; i++) {
			for(int  j = 0; j < 3; j++) {
				str[i][j] = "Dongguk"+ i + j;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int  j = 0; j < 3; j++) {
				System.out.print("문자열 [i][j] : ");
				System.out.println("["+ i +"]["+ j +"]: "+ str[i][j]);
			}
		}
		
		sca.close();
	
	}

}
