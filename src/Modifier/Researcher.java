package Modifier;

class Researcher extends Person{
	
	//field
	private String researchPart; //연구분야
	
	//method
	void research() {
		System.out.print("연구하기 ");
	}
	
	String getResearchPart() {
		return researchPart;
	}
	
	void setResearchPart(String researchPart) {
		this.researchPart = researchPart;
	}
	
	//generator
	Researcher() {
		super();
		researchPart = "디폴트 연구분야";
		System.out.println("Researcher() Generator call ");
	}
	
	Researcher(String researchPart) {
		super();
		this.researchPart = researchPart;
		System.out.println("Researcher(String researchPart) Generator call ");
	}

}
