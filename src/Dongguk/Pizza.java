package Dongguk;

class Pizza extends Food implements Eatable {
	private String toppings;
	
	public Pizza() {
		super();
		toppings = "디폴트 토핑";
	}
	
	public Pizza(String name, int calories, String toppings) {
		super(name, calories);
		this.toppings = toppings;
	}
	
	public void prepare() {
		System.out.println(getName()+"를(을) "
				+toppings+" 토핑으로 준비 중입니다.");
	}
	
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	
	public String getTopping() {
		return toppings;
	}
	
	public void eat() {
		System.out.println(getName() +"을 먹습니다. 맛있게 드세요.");
	}
}
