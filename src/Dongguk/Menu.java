package Dongguk;
import java.util.Scanner;

class Menu {
	Scanner key;
	
	private int getMenu() {
		key = new Scanner(System.in);
		System.out.println("==============================");
		System.out.println("[1] Food");
		System.out.println("[2] Pizza");
		System.out.println("[3] Salad");
		System.out.println("[4] 종료");
		System.out.print(">>>>>>>>>>메뉴 선택 : ");
		int i = key.nextInt();
		return i;
	}
	
	public void run(String user) {
		System.out.println("==============================");
		System.out.println(user);
		while(true) {
			int menu = getMenu();
			switch(menu) {
			case 1:
				Scanner scan = new Scanner(System.in);
				System.out.println("Food로 선언: up 캐스팅, down 캐스팅 사용 >> ");
				System.out.print("1: Pizza, 2:Salad >> ");
				int i = scan.nextInt();
				if(i == 1) {
					Food food = new Pizza("고르곤졸라 Pizza", 300, 
							"고르곤졸라 치즈를 기본으로 하고 꿀을 곁들여 달콤하면서 짭조름한 맛을 내는 피자.");
					food.displayInfo();
					Pizza piz = (Pizza)food;
					piz.prepare();
					piz.eat();
					System.out.println();
				} else if(i==2) {
					Food food = new Salad("Green Salad", 100, 
							"오이, 토마토, 양파같은 신선한 야채");
					food.displayInfo();
					Salad sal = (Salad)food;
					sal.prepare();
					sal.eat();
					System.out.println();
				} else {
					System.out.println("잘못된 입력입니다.");
					System.out.println();
				}
				break;
			case 2: //Pizza
				Pizza pizza = new Pizza("마르게리타 Pizza", 300, 
						"토마토 소스, 신선한 모차랠라 치즈, 바질, 올리브 오일로 \n간단하면서도 전통적인 맛을 내는 피자.");
				pizza.displayInfo(); //음식 정보 출력
				pizza.prepare(); //피자 준비
				pizza.eat(); //피자 먹기
				System.out.println();
				break;		
			case 3:
				Salad salad = new Salad("Caesar Salad", 150, 
						"로메인 상추, 크루통, 파마산 치즈");
				salad.displayInfo();
				salad.prepare();
				salad.eat();
				System.out.println();
				break;
			case 4:
				System.out.println(user + "\n오늘 하루 행복하세요. 고맙습니다.^^");
				return;
			}
		}
	}
	
}
