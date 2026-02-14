package vector;
import java.io.*;
import java.util.*;

class Menu {
	Scanner key;
	
	private Vector<Pizza> pizzaVector = new Vector<>();
	
	private int getMenu() {
		key = new Scanner(System.in);
		
		System.out.println("\n--- Pizza Menu ---");
		System.out.println("1. Add			(피자를 추가)");
		System.out.println("2. View			(특정 인덱스의 피자를 조회)");
		System.out.println("3. Modify		(특정 인덱스의 피자를 수정)");
		System.out.println("4. Delete		(특정 인덱스의 피자를 삭제)");
		System.out.println("5. List All		(모든 피자를 출력)");
		System.out.println("-------------------");
		System.out.println("6. File Save	(모든 피자를 파일에 저장)");
		System.out.println("7. File Read	(파일에서 읽어서 Vector에 추가)");
		System.out.println("8. Exit");
		
		System.out.print("\nChoose an option: ");
		int n = key.nextInt();
		return n;
	}
	
	private void addPizza(Scanner scanner) { //1
		System.out.print("피자 이름: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.print("칼로리: ");
		int calories = scanner.nextInt();
		scanner.nextLine(); //consume newline
		System.out.print("토핑: ");
		String toppings = scanner.nextLine();
		
		Pizza pizza = new Pizza(name, calories, toppings);
		pizzaVector.add(pizza);
		System.out.println("Pizza 추가: " + pizza.getPizzaInfo());
	}
	
	private void viewPizza(Scanner scanner) { //2
		int i;
		System.out.print("index: ");
		i = scanner.nextInt();
		System.out.println("Pizza 정보: " + pizzaVector.get(i).getPizzaInfo());
	}
	
	private void modifyPizza(Scanner scanner) { //3
		int i;
		System.out.print("수정할 index: ");
		i = scanner.nextInt();
		scanner.nextLine(); //버퍼 처리
		
		System.out.print("new name (현재: "+pizzaVector.get(i).getName() +"): ");
		String name = scanner.nextLine();
		System.out.print("new calories (현재: "+pizzaVector.get(i).getCalories() +"): ");
		int calories = scanner.nextInt();
		scanner.nextLine(); //consume newline
		System.out.print("new toppings (현재: "+pizzaVector.get(i).getToppings() +"): ");
		String toppings = scanner.nextLine();
		
		pizzaVector.remove(i); //삭제 후
		Pizza pizza = new Pizza(name, calories, toppings);
		pizzaVector.add(i, pizza); //다시 삽입
		System.out.println("Pizza 수정: " + pizzaVector.get(i).getPizzaInfo());
	}
	
	private void deletePizza(Scanner scanner) { //4
		int i;
		System.out.print("삭제할 index: ");
		i = scanner.nextInt();
		
		System.out.println("Pizza 삭제: " + pizzaVector.get(i).getPizzaInfo());
		pizzaVector.remove(i);
	}
	
	private void listAllPizzas() { //5
		System.out.println("피자 전체 리스트");
		for(int i = 0; i < pizzaVector.size(); i++) {
			System.out.println(i + ": " + pizzaVector.get(i).getPizzaInfo());
		}
	}
	
	private void fileSave(Scanner scanner) { //6
		System.out.print("파일 이름을 작성하세요: ");
		String filename = scanner.next();
		FileWriter writer = null;
		BufferedWriter bwr = null;
		try {
			writer = new FileWriter(filename);
			bwr = new BufferedWriter(writer);
			String temp;
			for(int i = 0; i < pizzaVector.size(); i++) {
				System.out.println(pizzaVector.get(i).savePizzaInfo());
				temp = pizzaVector.get(i).savePizzaInfo();
				bwr.write(temp);
				bwr.newLine();
			}
		}
		catch(IOException e) {
			System.out.print("파일 닫기 오류: " + e.getMessage());
		}finally {
			try {
				if(bwr != null) bwr.close();
				System.out.println("파일 저장 완료: " + filename);		
			}
			catch(IOException e) {
				System.out.println("파일 닫기 오류: "+ e.getMessage());
			}
		}
	}
	
	private void fileRead(Scanner scanner) { //7
		System.out.print("파일 이름을 작성하세요: ");
		String filename = scanner.next();
		FileReader reader = null;
		BufferedReader br = null;
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			String line;
			while((line = br.readLine()) != null) {
				String[] readData = line.split(",");
				if(readData.length == 3) {
					String name = readData[0];
					int calories = Integer.parseInt(readData[1]);
					String toppings = readData[2];
					
					Pizza pizza = new Pizza(name, calories, toppings);
					pizzaVector.add(pizza);
					System.out.println("Pizza 추가: "+ pizza.getPizzaInfo());
				}
			} //end while
			System.out.println(filename + "파일에서 피자 정보를 불러왔습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 읽기 오류: " + e.getMessage());
		} finally {
			try {
				if (br!= null) br.close();
			} catch (IOException e) {
				System.out.println("파일 닫기 오류: " + e.getMessage());
			}
		}
	}
	
	
	public void run(String user) {
		System.out.println("===============================");
		System.out.println(user);
		System.out.println("===============================");
		
		while(true) {
			int choice = getMenu();
			
			switch(choice) {
			case 1:
				addPizza(key);
				break;
			case 2:
				viewPizza(key);
				break;
			case 3:
				modifyPizza(key);
				break;
			case 4:
				deletePizza(key);
				break;
			case 5:
				listAllPizzas();
				break;
			case 6:
				fileSave(key);
				break;
			case 7:
				fileRead(key);
				break;
			case 8:
				System.out.println(user + "\n24년 동국대 정원을 마음껏 누리세요^^");
				return;
			default:
				System.out.println("Invalid choice. Please try again");
					
			}
		}
	}

}
