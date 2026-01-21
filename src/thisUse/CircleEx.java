package thisUse;

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main 프로그램은 public, main 메소드가 존재
		//자바는 OOP
		//클래스로 오브젝트 생성
		
		Circle kim = new Circle(); //생성자 메소드를 콜
		System.out.print("kim.radius = " + kim.radius);
		System.out.println(", kim.color = " + kim.color + '\n');
		
		Circle si = new Circle(10);
		System.out.print("si.radius = " + si.radius);
		System.out.println(", si.color = " + si.color + '\n');
		
		Circle hwan = new Circle(10, "Black");
		System.out.print("hwan.radius = " + hwan.radius);
		System.out.println(", hwan.color = " + hwan.color + '\n');
		
	}

}
