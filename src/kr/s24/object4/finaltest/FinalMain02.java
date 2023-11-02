package kr.s24.object4.finaltest;

//부모 클래스
class Me{
	int a = 100;
	
	//메서드에 final을 지정하면 자식클래스에 메서드 오버라이딩(재정의)을 할 수 없음 (상수라서 호출/상속은 되는데 값 변경 X)
	public final void setA(int a) {
		this.a = a;
	}
}

//자식 클래스
public class FinalMain02 extends Me{
	//부모 클래스의 final 메서드는 재정의 할 수 없음 
	/*
	@Override
	public void setA(int a) {
		System.out.println(a);
	}
	*/
	
	public static void main(String[] args) {
		FinalMain02 me = new FinalMain02();
		me.setA(200);
	}
}
