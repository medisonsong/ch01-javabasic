package kr.s12.object.overloading;

public class OverloadingMain02 {
	//전달되는 인자의 타입을 모두 String으로 변환해서 문자열의 길이를 // 3.14->"3.14" > length:4
	//구하는 메서드 만들기
	public void getLength(int n) {
		String s = String.valueOf(n); //(n값)int를 string으로 변환
		getLength(s); // 이러면 맨 밑 메서드로 가서 출력됨. 하나하나 출력하는 것보다 재사용성이 높은 코드구문임..!!!!
	}
	public void getLength(float n) {
		String s = String.valueOf(n); // float -> String
		getLength(s);
	}
	public void getLength(String s) { //문자열이라 변환할 필요 없어서 그냥 받기만 함
		System.out.println(s + "의 길이 : " + s.length());
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(10000); // class에서 print까지 해서 결과값이 출력됨
		om.getLength(3.14f);
		om.getLength("Hello");
	}
}
