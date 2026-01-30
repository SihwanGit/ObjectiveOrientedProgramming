package Modifier;

class StudentWorker extends Student{
	private String jobRole;
	
	//method
	void work() {
		System.out.print("일하기 ");
	}
	
	String getJobRole() {
		return jobRole;
	}
	
	void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
		
	//generator
	StudentWorker() {
		super();
		jobRole = "디폴트 직업";
		System.out.println("StudentWorker() Generator call ");
	}
		
	StudentWorker(String jobRole) {
		super();
		this.jobRole = jobRole;
		System.out.println("StudentWorker(String jobRole) Generator call ");
	}	
}
