package kr.s18.object.statictest;

public class StaticMain03 {
	//인스턴스 변수 (앞에 static이 없기 때문에 인스턴스임)
	String s1 = "여름";
	//static(클래스) 변수
	static String s2 = "겨울";
	
	//static 메서드
	public static String getString() {
		return s2;
				//s1은 인스턴스 변수기 때문에 객체가 생성된 후에 사용 가능함. (메모리에 없기 때문에 에러남)
	}
	
	public static void main(String[] args) {
		System.out.println(getString()); //같은 클래스명을 공유하기 때문에 객체 생성도, 클래스명을 쓸 필요가 없음
	}
}
