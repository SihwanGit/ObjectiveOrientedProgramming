package OverRiding;

public class OverRidingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vegetable veg1= new Vegetable("시금치", 20, true); //prarmeter 3개짜리 생성자 호출
		veg1.showInfo(); //얘는 정적 바인딩???
		
		System.out.println();
		Food f1 = new Vegetable("콩나물", 30, false); //업 캐스팅
		f1.showInfo();
		
		Vegetable veg2 = (Vegetable)f1; //down casting
		veg2.showInfo();
		
		//Vegetable veg3 = new Food(); // down casting
		//이런 사례는 문법은 맞는데 쓰진 않음. 그래서 컴파일러가 막아놓은 거임.
		
		
		
	}

}
