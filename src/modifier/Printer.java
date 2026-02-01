package modifier;

public class Printer {
	
				String defaultData;
	//default는 지정자 안써야 됨.
	private		String privateData;
	public		String publicData;
	protected	String protectedData;
	
	void setPrivateData(String privateData) {
		this.privateData = privateData;
	}
	
	String getPrivateData() {
		return privateData;
	}
	
	//기본 생성자
	//Printer()
	//문자열의 경우 ""으로 자동 초기화
	
}
