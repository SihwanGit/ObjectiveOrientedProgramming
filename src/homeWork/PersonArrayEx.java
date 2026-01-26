package homeWork;

public class PersonArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("동국대학교 컴퓨터공학전공 2021111935 김시환\n");
		
		Person[] dong = new Person[2];
		//자바도 C++처럼 객체배열을 동적할당 시 기본 생성자가 반드시 필요
		
		for(int i = 0; i < dong.length; i++) {
			dong[i] = new Person("동국인_" + i);
		}
		
		System.out.println();
		for(int i = 0; i < dong.length; i++) {
			System.out.println("Person dong[" + i + "] = " + dong[i].name);
			dong[i].eat();
			dong[i].speak();
			System.out.println();
		}
		
	}

}
