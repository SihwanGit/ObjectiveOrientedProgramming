package Dongguk;

interface AiEatable {
	//추상 매소드 만들기
	public abstract void printAiEatable();
	
	//default method
	public default void printDefault() {
		System.out.println("interface AiEatable");
	}
}
