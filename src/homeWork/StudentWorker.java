package homeWork;

class StudentWorker {
	String name;
	String university;
	String id;
	String jobRole;
	
	//기본 생성자
	StudentWorker() {
		name = "동국인";
		university = "동국대학교";
		id = "2021111935";
		jobRole = "학생";
		System.out.println("StudentWorker() 콜");
	}
	
	StudentWorker(String name) {
		this();
		this.name = name;
		System.out.println("StudentWorker(String name) 콜");
	}
	
	StudentWorker(String name, String university) {
		this();
		this.name = name;
		this.university = university;
		System.out.println("StudentWorker(String name, String university) 콜");
		
	}
	
	StudentWorker(String name, String university, String id) {
		this();
		this.name = name;
		this.university = university;
		this.id = id;
		System.out.println("StudentWorker(String name, String university"
							+ ", String id) 콜");
	}
	
	StudentWorker(String name, String university, String id, String jobRole) {
		this();
		this.name = name;
		this.university = university;
		this.id = id;
		this.jobRole = jobRole;
		System.out.println("StudentWorker(String name, String university"
							+ ", String id, String jobRole) 콜");
	}
	
	//method
	void eat() {
		System.out.print(" 먹는다 ");
	}
	
	void speak() {
		System.out.print(" 말한다 ");
	}
	
	void study() {
		System.out.print(" 공부하다 ");
	}
	
	void work() {
		System.out.print(" 일하다 ");
	}

}
