package OverRiding;

//자식 클래스: Fruit (과일)
//Food의 추상 매소드를 오버라이딩 하지 않으면 오류
class Fruit extends Food {
	private String taste;   // 과일 맛 (달콤한지 신지 등)
	
	// 생성자
	public Fruit(String name, int calories, String taste) {
	   super(name, calories);  // 부모 클래스 생성자 호출
	   //얘는 추상클래스야도 가능
	   this.taste = taste;
	}
	
	//Food의 오버라이딩
	
	
	// (문제) 디폴트 생성자, 필드 3개 초기화
		public Fruit() {
		   super("", 0);  // 부모 클래스 생성자 호출
		   this.taste = "";
		}
	
	
	// (문제) getter와 setter
	public String getTaste() {
	   return taste;
	}
	
	public void setTaste(String taste) {
	   this.taste = taste;
	}
	
	// (문제) Fruit 정보 출력 (Food의 showInfo를 오버라이딩)
	@Override
	public void showInfo() {
		//super.showInfo();  // 부모 클래스의 showInfo 호출
		//추상 매소드기 때문에 super메소드 사용 X
		System.out.println("음식 정보: " + getName());
		System.out.println("칼로리: " + getCalories());
		System.out.println("맛: " + taste);
	}
}
