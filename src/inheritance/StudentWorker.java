package inheritance;

class StudentWorker extends Student {
	//field
	String jobRole;
	
	//method
	void work() {
		System.out.println(" 일하기 ");
	}
	
	//generator
	StudentWorker() {
		super();
		jobRole = "조교";
		System.out.println(" StudentWorker() Generator call ");
	}
	
	StudentWorker(String jobRole) {
		super("한국대학교");
		this.jobRole = jobRole;
		System.out.println(" StudentWorker(String jobRole) Generator call ");
	}
	
}
