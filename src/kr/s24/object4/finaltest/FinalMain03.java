package kr.s24.object4.finaltest;

//클래스에 final을 지정하면 상속 불가능
final class Me2{
	int a = 200;
	public void make() {
		System.out.println("make 메서드");
	}
}

//public class FinalMain03 extends Me2 { 위 final 클래스에 상속시켜서 오류난 문장임
public class FinalMain03{
	public static void main(String[] args) {
		
	}
}

//java.lang - String/ System 은 둘다 그냥 기본값으로 써도 훌륭하니 그것만 쓰라고(강사님피셜) final로 되어있음 / 필수 클래스니 원형으로 쓰라고
//final, string, system 클래스 외에는 다 상속 받을 수 있음 
// 변수 앞에 final 붙여서 사용하는 경우가 제일 많고 ex) final int a = 100;
// final static은 캘린더 할 때 사용하기 좋아서 학습했다하셨음. 