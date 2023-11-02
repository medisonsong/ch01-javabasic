package kr.s29.lang.wrapper;

public class WrapperMain01 {
	public static void main(String[] args) {
		//예전 방식으로 wrapper 클래스 쓰는 방법
		boolean b = true; //기본자료형 데이터
		Boolean wrap_b = new Boolean(b); //기본자료형 데이터 -> 참조자료형 데이터
										 // 을 boxing이라고 부름
		//deprecated / 중간에 선이 그어져있는건 사용하지말라는 경고성 문구임..! 예전엔 정상적으로 썼는데 버전업 되면서 바뀜
		Boolean b2 = wrap_b.booleanValue(); //참조자료형 데이터 -> 기본자료형 데이터
											// unboxing 이라고 부름
		System.out.println(b2);
		
		System.out.println("--------------------------------");
		//요즘 방법
		//Character 객체 생성
		Character wrap_c = 'A'; //위처럼 돌리지 않고 그냥 직접 대입 -> auto boxing
		System.out.println(wrap_c); // auto unboxing
		
	}
}
