package Dongguk;

class AllFood extends Food implements AllEatable {
	//추상 클래스 3개
	public void eat() {
		System.out.println("Meat를 먹었습니다. ");
	}
	
	public void printAiEatable() {
		System.out.println("AI가 Meat를 좋아합니다.");
	}
	
	public void printAllEatable() {
		System.out.println("AiiEatable을 먹었습니다.");
	}
}
