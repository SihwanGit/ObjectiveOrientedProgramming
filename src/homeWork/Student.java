package homeWork;

class Student {
	String name;
	String id;
	String university;
	//필드는 초기화 안하면 NULL값이 들어간다고 함.
	
	//Generator method
	Student() {
		name = "동국인";
		id  = "2021111935";
		university = "동국대학교";
	}
	
	Student(String name) {
		this(); //Student()를 호출해 id, university를 초기화
		this.name = name;
	}
	
	Student(String name, String university) {
		this();
		this.name = name;
		this.university = university;
	}
	
	Student(String name, String university, String id) {
		this.name = name;
		this.id = id;
		this.university = university;
	}
	
	void eat() {
		System.out.print(" 먹는다 ");
	}
	
	void speak() {
		System.out.print(" 말한다 ");
		
	}
	
	void study() {
		System.out.print(" 공부한다 ");
	}
}
