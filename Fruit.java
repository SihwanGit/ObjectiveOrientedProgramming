package Ex02;

//자식 클래스: Fruit (과일)
class Fruit extends Food {
	private String taste;   // 과일 맛 (달콤한지 신지 등)
	
	// 생성자
	public Fruit(String name, int calories, String taste) {
	   super(name, calories);  // 부모 클래스 생성자 호출
	   this.taste = taste;
	}
	
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
	   super.showInfo();  // 부모 클래스의 showInfo 호출
	   System.out.println("맛: " + taste);
	}
}
