package kr.s18.object.statictest;

public class StaticCount {
	//인스턴스 변수 : 객체가 생성될 때 객체에 포함되는 변수
	int c;
	//static(클래스) 변수 : 객체가 생성될 때 포함되지 않음
	static int count;
	
	//생성자
	public StaticCount() {
		c++;
		count++;
		//원래는 StaticCount.count라 붙여야되는데
		//같은 클래스라 count가 어디 있는지 식별할 수 있어서 생략 가능
	}
}
