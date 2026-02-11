package Dongguk;

interface AllEatable extends Eatable02, AiEatable { //
	//추상 2개, 오버라이딩은 하지 않아도 된다.
	//디폴트 2개
	
	public abstract void printAllEatable();
}
