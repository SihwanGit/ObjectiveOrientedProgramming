package Modifier;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//연구자 초기화
		Researcher[][] res = new Researcher[2][3];
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[i].length; j++) {
				res[i][j] = new Researcher();
				System.out.println();
			}
		}
		
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[i].length; j++) {
				System.out.print("res["+i+"]["+j+"]'s name: "+res[i][j].getName()+"_"+i+j+", researchPart: "+ res[i][j].getResearchPart()+"_"+i+j+", ");
				res[i][j].eat();
				res[i][j].speak();
				res[i][j].sleep();
				res[i][j].walk();
				res[i][j].research();
				System.out.println();
			}
		}
		
		//조교 초기화
		StudentWorker[] stw = new StudentWorker[5];
		
		System.out.println();
		for(int i =0; i<stw.length; i++) {
			stw[i] = new StudentWorker("조교_"+(i+1));
			System.out.println();
		}
		
		for(int i =0; i<stw.length; i++) {
			System.out.print("stw["+i+"]s name: "+stw[i].getName()+"_"+(i+1)+", university: "+stw[i].getUniversity()+"_"+(i+1)+", jobRole: "+ stw[i].getJobRole()+", ");
			stw[i].eat();
			stw[i].speak();
			stw[i].walk();
			stw[i].sleep();
			stw[i].work();
			stw[i].study();
			System.out.println();
		}
		
	}

}
