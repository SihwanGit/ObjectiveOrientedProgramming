package thisUse;

class Circle {
	//클래스는 필드와 메소드로 이루어진다.
	public int radius;
	public String color;
	
	//생성자
	Circle() {
		radius = 1;
		color = "White";
		System.out.println("Circle() 생성자 메소드 콜");
	}
	
	Circle(int radius) {
		this(5, "SkyBlue"); 
		//클래스 안에 있는 다른 생성자 메소드 콜 Circle(int r, String c)를 콜
		//반드시 객체의 첫 줄에 작성해야한다.
		this.radius = radius;
		System.out.println("Circle(int radius) 생성자 메소드 콜");
	}
	
	/*Circle(int radius) {
		this(); //클래스 안에 있는 다른 생성자 메소드 콜 Circle()를 콜
		//반드시 객체의 첫 줄에 작성해야한다.
		this.radius = radius;
		System.out.println("Circle(int radius) 생성자 메소드 콜");
	}*/
	
	/*Circle(int radius) {
		this.radius = radius;
		color = "Red";
		System.out.println("Circle(int radius) 생성자 메소드 콜");
	}*/
	
	Circle(int radius, String color) {
		this.radius = radius;
		this.color = color;
		System.out.println("Circle(int radius, String color) 생성자 메소드 콜");
	}
}
