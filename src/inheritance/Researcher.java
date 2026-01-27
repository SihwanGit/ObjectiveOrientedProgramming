package inheritance;

class Researcher extends Person {
	
	//field
	String researchPart; //연구분야
	
	//method
	void research() {
		System.out.println(" 연구하기 ");
	}
	
	//generator
	Researcher() {
		super();
		researchPart = "컴퓨터";
		System.out.println(" Researcher() Generator call ");
	}
	
	Researcher(String researchPart) {
		super();
		this.researchPart = researchPart;
		System.out.println(" Researcher(String researchPart) Generator call ");
	}
	
}
