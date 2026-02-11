package Dongguk;

interface Eatable02 {
	//추상 or 디폴트 메소드 사용가능
	public abstract void eat(); //추상메소드
	
	public default void printEatable() { //디폴트메소드, default 는 접근지정자가 아님.
		System.out.println("interface Eatable ");
	}
}
