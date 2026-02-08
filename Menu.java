package Ex02;
import java.util.Scanner;

class Menu {
	
	//default 생성자 메소드
	// Menu() {};  필드 초기화 
		
		private int getMenu() {
			Scanner key = new Scanner(System.in);
			System.out.println("=========================================");		
			System.out.println("[1] Food");
			System.out.println("[2] Fruit");
			System.out.println("[3] Vegetable");
			System.out.println("[4] 종료");
			
			System.out.print(">>>>>>>>>>메뉴 선택 : ");	
			int menu = key.nextInt();
			return menu;
		}
		
	
		
		public void run(String user) {
			System.out.println("=========================================");	
			System.out.print("[ " + user + " ]");

			System.out.println();
			while(true) {
				int menu = getMenu();
				switch(menu) {
					case 1 : // 1. Food
						 Food pizza = new Food("피자", 95);
					     System.out.println("음식 정보:");
					     pizza.showInfo();
					     System.out.println();
					     break;
					case 2 : // 2. Fruit
						 Fruit apple = new Fruit("사과", 95, "달콤함");
					     System.out.println("과일 정보:");
					     apple.showInfo();
					     System.out.println();
					     break;
					case 3 : // 3. Vegetable
						 Vegetable spinach = new Vegetable("시금치", 23, true);
					     System.out.println("채소 정보:");
					     spinach.showInfo();
					     break;				
					case 4 : // 종료 메뉴
						System.out.println(user);
						System.out.println("오늘 하루 행복하세요. 고맙습니다.^^"); 
						return;						
					default:
						System.out.println("다시 입력하세요!"); 
						continue;
				}
				
			}		
		}
}