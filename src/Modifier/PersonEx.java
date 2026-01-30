package Modifier;
import java.util.Scanner;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person per1 = new Person();
		//System.out.println("per1.name = "+ per1.name);
		//private 맴버라서 접근할 수 없었다.
		
		System.out.println("per1.name = "+ per1.getName());
		
		Scanner sca = new Scanner(System.in);
		System.out.print("바꾸고 싶은 이름을 입력하세요: ");
		String name = sca.nextLine();
		per1.setName(name);
		System.out.println("per1.name = "+ per1.getName());
		
		per1.speak();
		per1.eat();
		per1.walk();
		per1.sleep();
		
		sca.close();
		
	}

}
