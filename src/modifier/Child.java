package modifier;

public class Child extends Parent {
	public String hobby;
	//같은 패키지 내에서는 디폴트, protected, public의 기능이 전부 똑같다.
	
	public void superPrint() {
		System.out.println("super.default_Name = "+ default_Name);
		System.out.println("super.public_Country = "+ public_Country);
		//System.out.println("super.private_Number = "+ private_Number);
		System.out.println("super.protected_Addr = "+protected_Addr);
	}
	
}
