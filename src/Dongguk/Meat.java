package Dongguk;

class Meat implements Eatable02, AiEatable { //다중 상속
	//red line 이 발생한 이유
	//클래스가 인터페이스를 상속받으면 추상메소드를 반드시 오버라이딩 해야함.
	
	public void eat() {
		System.out.println("Meat를 먹었습니다. ");
	}
	
	public void printAiEatable() {
		System.out.println("AI가 Meat를 좋아합니다.");
	}
	
}
