package modifier222;
import modifier.Parent;

class Little extends Parent{
	
	Little() {
		protected_Addr = "한국";	//타 패키지의 Parent의 protected 맴버에 접근 가능.
	}
	
	
}
