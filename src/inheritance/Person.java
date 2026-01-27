package inheritance;

class Person {
	//field
	String name;
	
	//method
	void speak() {
		System.out.println(" 말하기 ");
	}
	
	void eat() {
		System.out.println(" 먹기 ");
	}
	
	void sleep() {
		System.out.println(" 잠자기 ");
	}
	
	void walk() {
		System.out.println(" 걷기 ");
	}

	//Generator
	Person() {
		name = "김시환";
		System.out.println(" Person() Generator call ");
	}
	
	Person(String name) {
		this(); //this() method
		this.name = name; //this reference
		System.out.println(" Person(String name) Generator call ");
	}

}
