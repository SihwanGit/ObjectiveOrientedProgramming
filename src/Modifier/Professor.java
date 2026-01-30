package Modifier;

class Professor extends Researcher{
	//field
	private String country;
	
	//method
	void teach() {
		System.out.print("가르치기 ");
	}
	
	String getCountry() {
		return country;
	}
	
	void setCountry(String country) {
		this.country = country;
	}
	
	//Genarator
	Professor() {
		super();
		country = "디폴트 국가";
		System.out.println("Professor() Generator call ");
	}
	
	Professor(String country) {
		super();
		this.country = country;
		System.out.println("Professor(String country) Generator call ");
	}
}
