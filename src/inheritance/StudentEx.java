package inheritance;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//학생 2명
		Student[] std = new Student[2];
		
		for(int i = 0; i< std.length; i++) {
			std[i] = new Student("서울대학교");
			//std[i] = new Student();
			System.out.println();
		}
		
		for(int i = 0; i< std.length; i++) {
			System.out.println("std["+i+"]'s university is "+std[i].university);
			System.out.println("std["+i+"]'s name is "+std[i].name);
			System.out.println();
		}
		//Student() -> Person(String name) -> Person()이므로
		//위의 역순으로 생성자가 실행된다.
		
		StudentWorker stw = new StudentWorker("과제 체점");
		System.out.println();
		System.out.println("stw's name is "+stw.name);
		System.out.println("stw's jobRole is "+stw.jobRole);
		System.out.println("stw's university is "+stw.university);
		System.out.println();
		//이걸 타고 들어가면 Stw -> Std -> Per(String name) -> Per()가 된다.
		//따라서 생성자는 위 순서의 역으로 호출된다.
		
		Researcher res = new Researcher("화학");
		System.out.println("res's name is "+res.name);
		System.out.println("res's name is "+res.researchPart);
		res.walk();
		res.sleep();
		System.out.println();
		
	}

}
