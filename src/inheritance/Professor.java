package inheritance;

class Professor extends Researcher {
	//field
	String country;
	
	//method
	void teach() {
		System.out.println(" 가르치기 ");
	}
	
	Professor() {
		super("AI");
		country = "대한민국";
		System.out.println(" Professor() Generator call ");
	}
	
	Professor(String country) {
		super();
		this.country = country;
		System.out.println(" Professor(String country) Generator call ");
	}

}
