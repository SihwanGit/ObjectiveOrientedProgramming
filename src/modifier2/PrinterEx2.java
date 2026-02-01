package modifier2;
import modifier.*;
//class가 public인 경우만 가능. 
//import 패키지명.클래스명;
//패키지 내 모든 클래스를 받고 싶다면 패키지명.*;

public class PrinterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer pri = new Printer();
		//pri.defaultData = "default동국대학교"; error
		pri.publicData = "public동국대학교";
		//pri.protectedData = "protected동국대학교"; error
		//pri.privateData = "private동국대학교"; error
		
		LazerPrinter lpri = new LazerPrinter();
		//lpri.defaultData = "default동국대학교"; error
		lpri.publicData = "public동국대학교";
		//lpri.protectedData = "protected동국대학교";
		//이거 원래는 되야되는데 왜 안돼는지 몰겄음. 추가로 공지한다고 함.
		
		lpri.getProtected();
		//lpri.privateData = "private동국대학교"; error
		
	}
}
