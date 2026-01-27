package inheritance;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사람 2명
		Person[] per = new Person[2];
		for(int i = 0; i<per.length; i++) {
			//per[i] = new Person("김현"+(i+1));
			per[i] = new Person(); //얘는 this가 없어서 생성자가 2개 출력
		}
		System.out.println();
		
		for(int i = 0; i<per.length; i++) {
			System.out.println("per["+i+"]'s naem is "+per[i].name);
			per[i].eat();
			per[i].speak();
			per[i].walk();
			per[i].sleep();
			System.out.println();
		}
		
	}

}
