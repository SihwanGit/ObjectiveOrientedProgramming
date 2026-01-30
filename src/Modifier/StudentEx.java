package Modifier;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] std = new Student[3];
		for(int i =0; i < std.length; i++) {
			std[i] = new Student("동국대학교"+(i+1));
			System.out.println();
		}
		
		for(int i =0; i < std.length; i++) {
			System.out.println("std["+i+"].name = "+ std[i].getName());
		}
		
		System.out.println();
		for(int i =0; i < std.length; i++) {
			System.out.println("std["+i+"].university = "+ std[i].getUniversity());
		}
		
		System.out.println();
		for(int i =0; i < std.length; i++) {
			std[i].eat();
			std[i].walk();
			std[i].sleep();
			std[i].speak();
			std[i].study();
			System.out.println();
		}	
	}
}


