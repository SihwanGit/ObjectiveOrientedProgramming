package OverRiding;

public class SaladEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food f1 = new Salad("토마토", 50, "신맛", "시저드레싱"); //업캐스팅
		f1.showInfo();
		//이 sohwInfo()는 Salad의 것이므로 오버라이딩
		
		Food f2 = f1;
		System.out.println();
		System.out.println("Food f2 = f1: ");
		f2.showInfo();
		//애는 그냥 평범한 캐스팅이지만 Salad의 것이 실행된다.
		
		//Food f3 = new Food();
		System.out.println();
		//f3.showInfo();
		//얘는 그냥 Food거
		
	}

}
