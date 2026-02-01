package modifier;

public class PrinterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer dong;
		dong = new Printer(); //오브젝트 생성. 반드시 동적할당 받아야함.
		
		dong.defaultData = "default동국대학교";
		dong.publicData = "public동국대학교";
		dong.protectedData = "protected동국대학교";
		//dong.privateData = "private동국대학교"; error
		
	}
	
}
