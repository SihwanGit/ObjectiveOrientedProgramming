package homeWork;

public class HomeworkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("동국대학교 컴퓨터공학전공 2021111935 김시환\n");
		
		Person[] per = new Person[2];
		Student[] std = new Student[3];
		StudentWorker[] stdwor = new StudentWorker[2];
		
		
		//Person 초기화
		for(int i = 0; i < per.length; i++) {
			per[i] = new Person("사람_"+i);
		}
		
		//Student 초기화
		for(int i = 0; i < std.length; i++) {
			std[i] = new Student("학생_" + i, "동국대학교", "2021111935_"+i);
		}
		
		//StudentWorker 초기화
		for(int i = 0; i < stdwor.length; i++) {
			stdwor[i] = new StudentWorker("조교_" + i, "동국대학교", "2021111935_"+i,"조교+"+i);
		}
		
		
		System.out.println();
		for(int i = 0; i < per.length; i++) {
			System.out.print("Person per[" + i + "].name = " + per[i].name+ " ");
			per[i].eat();
			per[i].speak();
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0; i < std.length; i++) {
			System.out.print("Student std[" + i + "].name = " + std[i].name + " ");
			System.out.print("Student std[" + i + "].university = " + std[i].university+ " ");
			System.out.print("Student std[" + i + "].id = " + std[i].id+ " ");
			std[i].eat();
			std[i].speak();
			std[i].study();
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0; i < stdwor.length; i++) {
			System.out.print("StudentWorker stdwor[" + i + "].name = " + stdwor[i].name+ " ");
			System.out.print("StudentWorker stdwor[" + i + "].university = " + stdwor[i].university+ " ");
			System.out.print("StudentWorker stdwor[" + i + "].id = " + stdwor[i].id+ " ");
			System.out.print("StudentWorker stdwor[" + i + "].jobRole = " + stdwor[i].jobRole+ " ");
			stdwor[i].eat();
			stdwor[i].speak();
			stdwor[i].study();
			stdwor[i].work();
			System.out.println();
		}
		
		
	}

}
