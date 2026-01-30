package Modifier;

class Student extends Person{
	private String university;
	
	String getUniversity() {
		return university;
	}
	
	void setUniversity(String university) {
		this.university = university;
	}
	
	//generator
	Student() {
		//super() 메소드 생략
		university = "디폴트 대학교";
		System.out.println("Student() Generator call");
	}
	
	Student(String university) {
		super("동국인");
		this.university = university;
		System.out.println("Student(String university) Generator call");
	}
	
	void study() {
		System.out.print("공부하기 ");
	}

}
