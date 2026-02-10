package OverRiding;

class Salad extends Fruit{
	//이름, 칼로리, 맛 + 드레싱
	private String dressing;
	
	//generator
	Salad() {
		super();
		dressing = "";
	}
	
	Salad(String name, int calories, String taste, String dressing) {
		super(name, calories, taste); //당연히 fruit에 3개짜리 생성자가 있어야만 가능.
		this.dressing = dressing;
	}
	
	public void showInfo() {
		//super.showInfo();
		System.out.println("음식 정보: " + getName());
		System.out.println("칼로리: " + getCalories());
		//System.out.println("드레싱 : "+dressing);
	}
}
