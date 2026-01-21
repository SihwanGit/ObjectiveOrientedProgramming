package thisUse;

public class CircleThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle kim = new Circle(); //생성자 메소드를 콜
		System.out.print("kim.radius = " + kim.radius);
		System.out.println(", kim.color = " + kim.color + '\n');
		
		Circle si = new Circle(10);
		System.out.print("si.radius = " + si.radius);
		System.out.println(", si.color = " + si.color + '\n');
		//Circle() 메소드를 콜했다는 문자가 출력된다는 것을 알 수 있다.
		
		Circle hwan = new Circle(10, "Black");
		System.out.print("hwan.radius = " + hwan.radius);
		System.out.println(", hwan.color = " + hwan.color + '\n');
		
	}

}
