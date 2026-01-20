package Keyboard;
//키보드 입력을 위한 1번
import java.util.Scanner;

public class KeyboardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//키보드로 학교, 학과, 이름, 나이, 이메일, 전화번호, 성별
		//자료형 문자열, 문자열, 문자열, 정수, 문자열, 문자열, 불리안
		
		//키보드 입력을 위한 2번
		Scanner	input = new Scanner(System.in);	//이거 동적할당임.
		
		String	school;		//학교
		String	department; //학과
		String	이름; 		//이름
		int	age; 			//나이
		String	email;		//이메일
		String phoneNo;		//전화번호
		boolean gender;		//성별 true:남성, false:여성
		//사실 String은 클래스고, String 객체 email 등등은 오브젝트라고 부른다.
		
		//키보드 입력 받기
		System.out.print("학교: ");
		school = input.next(); 		//빈칸은 입력할 수 없다.
		input.nextLine(); 			//Enter키를 버퍼에서 비우기 위해 사용했다.
		System.out.println("학교는 "+ school + "입니다.\n");
		
		System.out.print("학과: ");
		department = input.nextLine(); 	//빈칸을 입력할 수 있다.
		//이걸 버퍼를 안비우고 사용하면 엔터가 남아있어서 입력을 받을 수 없다.
		System.out.println("학과는 "+ department + "입니다.\n");
		
		System.out.print("이름: "); 	//자바는 변수/객체의 이름을 한글로 해도 가능하다.
		이름 = input.next(); 			//빈칸은 입력할 수 없다.
		System.out.println("이름은 "+ 이름 + "입니다.\n");
		
		System.out.print("나이: ");
		age = input.nextInt();
		System.out.println("나이는 "+ age + "세 입니다.\n");
		
		System.out.print("성별: ");
		gender = input.nextBoolean(); //true나 false로 입력해야한다. 1/0 이런거 안된다.
		if(gender) System.out.println("성별은 남성입니다.\n");
		else System.out.println("성별은 여성입니다.\n");
		
		input.close();	//입력이 끝날 떈 이렇게 닫아준다.
	}

}
