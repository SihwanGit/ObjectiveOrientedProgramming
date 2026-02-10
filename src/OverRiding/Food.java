package OverRiding;

//부모 클래스: Food (음식)
abstract class Food {
	 private String name;       // 음식 이름
	 private int calories;      // 칼로리 정보
	
	 //추상 매소드
	 //public abstract void printAbstract();
	 //이런 경우 상속받는 클래스가 반드시 이 매소드를 오버라이딩 해야한다.
	 
	 // 생성자
	 public Food(String name, int calories) {
	     this.name = name;
	     this.calories = calories;
	 }
	
	// (문제1) 디폴트 생성자, 필드 초기화
		 public Food() {  
		     this("음식", 100);
		     //this("", 0);
		 }
		
	 
	 
	 // (문제2) getter와 setter
	 public String getName() {
	     return name;
	 }
	
	 public void setName(String name) {
	     this.name = name;
	 }
	
	 public int getCalories() {
	     return calories;
	 }
	
	 public void setCalories(int calories) {
	     this.calories = calories;
	 }
	
	 // (문제3) 음식 정보 출력
	 //추상 매소드로 변경
	 public abstract void showInfo(); 
	 /*{
	     System.out.println("음식 이름: " + name);
	     System.out.println("칼로리: " + calories + " kcal");
	 }*/
}