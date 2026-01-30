package Modifier;

class Person { //default 접근지정자 생략
	//클래스는 오브젝트를 만들기 위해서 선언
	
	private String name;
	
	//generator
	Person() {
		this("디폴트 이름");
		name = "디폴트 이름";
		System.out.println("Person() Generator call");
	}
	
	Person(String name) {
		this.name = name;
		System.out.println("Person(String name) Generator call");
	}
	
	//여기있는 애들은 전부 default 접근지정자가 생략되었다.
	void speak() {
		System.out.print("말하기 ");
	}
	
	void eat() {
		System.out.print("먹기 ");
	}
	
	void walk() {
		System.out.print("걷기 ");
	}
	
	void sleep() {
		System.out.print("자기 ");
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}

}
