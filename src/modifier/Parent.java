package modifier;

//This class is default.
public class Parent {
	//접근지정자.
	//public, private, protected, default가 있다.
	
	//field
				String default_Name;
	public 		String public_Country;
	private		String private_Number;
	protected	String protected_Addr; //주소
	//tap 눌러서 보기 편하게 정렬한 거임.
	
	
	//method
				void default_Print() {System.out.println("default_Print() Method Call"); }
	public 		void public_Print() {System.out.println("public_Print() Method Call"); }
	private 	void private_Print() {System.out.println("private_Print() Method Call"); }
	protected 	void protected_Print() {System.out.println("protected_Print() Method Call"); }
	
	String getPrivate_Number() {
		return private_Number; 
	}
	
	void setPrivate_Number(String pN) {
		private_Number = pN;
	}
	
	
}
