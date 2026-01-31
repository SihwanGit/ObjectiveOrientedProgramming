package modifier222;
import modifier.Parent;
//Parent가 public이야만 import 가능. default, private는 import 못씀.

class MainEx extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent si = new Parent(); 
		si.public_Country = "대한민국";
		//si.protected_Addr = "성남"; //error
		
		
	}

}
