package inheritance;

class Student extends Person {
	//field
	String university;
	
	//method
	void study() {
		System.out.println(" 공부하기 ");
	}
		
	//generator
	Student() {
		super();
		System.out.println(" Student() Generator call ");
		university = "동국대학교";
	}
		
	Student(String university) {
		super("김현");
		this.university = university;
		System.out.println(" Student(String university) Generator call ");
	}
		
		
}
