package exception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눗수
		
		while(true) {
			System.out.print("나뉨수를 입력하시오:"); 
			
			try {
				dividend = scanner.nextInt(); // 나뉨수 입력
			}
			catch(InputMismatchException m) {
				scanner.nextLine(); //버퍼 클린
				System.out.println("정수를 입력해 주세요");
				continue; //다시 위로 올라가기 위해서
			}
			
			System.out.print("나눗수를 입력하시오:"); 
			divisor = scanner.nextInt(); // 나눗수 입력
			
			//여기에도 dividend같은 예외처리문을 만들어주면 된다.
			//귀찮으니 생략
			
			try {
				System.out.println(dividend+"를 "+ divisor + "로 나누면 몫은 " + 
			dividend/divisor + "입니다.");
			}
			catch(ArithmeticException e ) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		
	}
}
