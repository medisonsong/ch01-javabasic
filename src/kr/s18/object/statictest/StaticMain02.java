package kr.s18.object.statictest;

public class StaticMain02 {
	
	//인스턴스 변수
	int a;
	//static(클래스)변수
	static String s;
	
	public static void main(String[] args) { //얘도 그렇고 static이 있으면 단독으로 사용 가능함/ 객체에 포함 X
		s = "서울"; //StaticMain02.s 인데 생략 가능
		System.out.println(s); // static은 호출만 하면 메모리에 올라가서 바로 출력 가능 (static은 클래스명 생략 가능)
		System.out.println("-----------------");
		
		//인스턴스 변수는 객체 생성 후에 호출해야 사용 가능
		//a = 1000; > a는 인스턴스 변수라 객체 생성 + 클래스명 기재해야함
		StaticMain02 sm = new StaticMain02();
		sm.a = 1000;
		System.out.println(sm.a);
		
	}
}
