package modifier;

public class ParentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent kim = new Parent(); //생성자는 디폴트
		
		kim.default_Name = "Kim Si Hwan";
		kim.public_Country = "대한민국";
		//kim.private_Number; 얘는 접근 불가능. set, get 필요
		kim.setPrivate_Number("백이십삼");
		kim.getPrivate_Number();
		kim.protected_Addr = "성남";
		
		kim.default_Print();
		
		Child cl = new Child();
		cl.default_Name = "김시환";
		//cl.private_Number;
		cl.protected_Addr = "성남";
		cl.public_Country = "미국";
		
		
		
	}
}
