package kr.s24.object4.finaltest;

class A{
	//지정한 값은 변경 불가능
	final int NUM = 10; //int num=10 하면 바꿀 수 있는데 final int 하면 상수가 돼서 바꿀 수 없음
	public static final int NUMBER = 20;
		//일반적으로 객체들이 공유할 수 있게 만들기 때문에 public사용
}

public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		// ap.NUM = 20; 상수가 되었기 때문에 변경 불가능함.(final)
		
		System.out.println(ap.NUM); //호출은 가능함
		
		//static 상수 호출
		System.out.println(A.NUMBER); // static 상수 -> 클래스명+상수명
		
		//지역 상수
		final int NO = 30;
		System.out.println(NO);
		
	}
}
