package Array;

public class ClassArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		//얘는 객체
		double dNum;
		//얘는 객체가 아니라 변수(=필드)
		
		String[] sArray;
		String[][] sTwoArray;
		String[][][] sThreeArray;
		//이런 애들이 전부 객체 배열이다.
		//얘네들은 아직 동적할당 받지 않았으므로 레퍼런스 상태다.
		
		sArray = new String[3];
		sTwoArray = new String[2][3];
		sThreeArray = new String[2][3][4];
		//이렇게 할당받으면 객체 배열이 된다.
		
		//나중에 이런 배열들을 한번에 편하게 다루기 위해 '콜랙트'라는 기법도 나온다고 합니다.
	}

}
