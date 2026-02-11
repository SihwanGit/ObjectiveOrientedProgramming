package Dongguk;

public class interfaceEx {

	public static void main(String[] args) {
		//Eatable kim = new Eatable(); interface 로는 객체 생성 불가능 error
		Eatable02 kim = new Meat(); //오버라이딩은 가능하다.
		kim.eat();
		kim.printEatable();
		//얘는 Eatable 로 업캐스팅해서 AiEatable의 맴버는 사용 불가능
		System.out.println();
		
		Meat si = new Meat();
		// Eatable
		si.eat();
		si.printEatable();
		// AiEatable
		si.printAiEatable();
		si.printDefault();
		
		AllFood blueberry = new AllFood(); //오브젝트 생성
		blueberry.eat();
		blueberry.printAllEatable();
		blueberry.printEatable();
		blueberry.printDefault();
		// 등등이 전부 가능
		
	}	
}
