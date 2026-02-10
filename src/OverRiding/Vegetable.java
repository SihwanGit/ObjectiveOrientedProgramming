package OverRiding;

//자식 클래스: Vegetable (채소)
class Vegetable extends Food {
	private boolean isLeafy;  // 잎 채소인지 여부
	
	// 생성자
	public Vegetable(String name, int calories, boolean isLeafy) {
	   super(name, calories);  // 부모 클래스 생성자 호출
	   this.isLeafy = isLeafy;
	}
	
	// (문제) 디폴트 생성자, 필드 초기화 3개
		public Vegetable() {
		   super("", 0);  // 부모 클래스 생성자 호출
		   this.isLeafy = true;
		}

	// Vegetable 정보 출력 (Food의 showInfo를 오버라이딩)
	@Override
	public void showInfo() {
		//super.showInfo();  // 부모 클래스의 showInfo 호출
		System.out.println("음식 정보: " + getName());
		System.out.println("칼로리: " + getCalories());
		System.out.println("잎 채소 여부: " + (isLeafy ? "예" : "아니오"));
	}
		
		
	// (문제5) getter와 setter
	public boolean getLeafy() {
	   return isLeafy;
	}
	
	public void setLeafy(boolean leafy) {
	   isLeafy = leafy;
	}
	
	
}
