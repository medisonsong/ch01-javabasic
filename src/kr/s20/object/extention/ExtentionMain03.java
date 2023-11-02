package kr.s20.object.extention;

//부모 클래스
class A{
	int x = 100;
	private int y = 200;
	
	//1) y를 호출하기 위해 메서드 생성
	public int getY() {
		return y;
	}
}

//자식 클래스
class B extends A{
	int z = 300;
}

public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private 멤버 변수는 상속 관계라도 다른 클래스에서 호출은 불가 / private>상속 
		//System.out.println(bp.y);
		//2) y를 호출하는 메서드 출력
		System.out.println(bp.getY());
		System.out.println(bp.z);
	}
}
