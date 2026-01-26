package homeWork;

//자바 클래스
class Person {
	String	name;
	
	//Generator
	Person() {
		//this("김시환"); //Person(String name) call
		//Person(String name)에도 this()를 작성하면 무한루프가 발생하므로 에러
		name = "동국인";
		System.out.println("Person() 생성자 메소드 콜");
	}
	
	Person(String name) {
		//주석이 있어도 안되나?
		this(); //Person() call
		this.name = name;
		System.out.println("Person(String name) 생성자 메소드 콜");
	}
	
	//method
	void eat() {
		System.out.print(" 먹는다 ");
	}
	
	void speak() {
		System.out.print(" 말한다 ");
	}
	
	
}
