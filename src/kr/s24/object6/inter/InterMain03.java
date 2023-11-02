//제빵 보조로 빵집에 취업했는데 제빵사가 쿠키틀을 자기가 만들어줄테니까 나한테 몰드에 구우라고 지시함

package kr.s24.object6.inter;

//인터페이스 : 형식만 있고 내용은 없음
interface CookieMold{ //쿠키틀
	public abstract void makeStar(); // 별모양으로 빵만들어!
	public abstract void makeCircle(); // 이건 동그라뮈
	public abstract void makeDiamond(); // 이건 다이아몬드 ㅎ_ㅎ
}

class Cookie implements CookieMold{
	//인터페이스가 형식을 제공하면 클래스에 구현해서 내용을 채워줌
	@Override
	public void makeStar() {
		System.out.println("별 모양의 쿠키를 만들다");
	}
	@Override
	public void makeCircle() {
		System.out.println("원 모양의 쿠키를 만들다");
	}
	@Override
	public void makeDiamond() {
		System.out.println("다이아몬드 모양의 쿠키를 만들다");
	}
}

public class InterMain03 {
	public static void main(String[] args) {
		Cookie ck = new Cookie();
		
		ck.makeStar();
		ck.makeCircle();
		ck.makeDiamond();
	}
}

/*
 * <인터페이스가 사용되는 경우>
 * 앞으로 어떤 메서드를 만들지 예상할 수 있게끔 형식을 맞춰줌 
 * 1. 표준화 작업
 * 2. 자료형으로 사용 가능 (부모클래스처럼 사용 가능)
 * 3. 우회적으로 다중상속같은 기능 가능
 */
