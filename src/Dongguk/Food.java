package Dongguk;

abstract class Food {
	private String name;
	private int calories;
	
	public Food() {
		name = "디폴트 피자";
		calories = 100;
	}
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void displayInfo() {
		System.out.println("음식 이름: "+ name);
		System.out.println("칼로리: "+ calories + " kcal");
	}
}
