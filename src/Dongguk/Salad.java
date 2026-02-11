package Dongguk;

class Salad extends Food implements Eatable {
	private String dressing;
	
	public Salad() {
		super();
		this.dressing = "디폴트 드레싱";
	}
	
	public Salad(String name,int calories, String dressing) {
		super(name, calories);
		this.dressing = dressing;
	}
	
	public void prepare() {
		System.out.println(getName()+"를(을) "
				+dressing+" 드레싱과 함께 섞고 있습니다.");
	}
	
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	
	public String getDressing() {
		return dressing;
	}
	
	public void eat() {
		System.out.println(getName() +"을 먹습니다. 맛있게 드세요.");
	}
	
}
