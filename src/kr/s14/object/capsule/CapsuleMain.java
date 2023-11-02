package kr.s14.object.capsule;

class Capsule{
	//private은 같은 클래스 내에서만 접근이 가능
	//은닉화
	private int a; //라잌 금고.. 함부로 들어갈 수 없어짐
	
	//캡슐화
	public void setA(int n) {
		if(n>=0) {
			a=n;
		}else {
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	
	public int getA() {
		return a;
	}
}
//private으로 멤버변수를 선언했기 때문에>>> 메서드를 통해서 그 멤버변수에 넣을 수 있도록 해야함!
//return 시킬때도 메서드를 사용해서 get해야하기 때문에 getA 메서드 따로 또 생성!

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		//변수 a의 접근 지정자(제한자)가 private이기 때문에 같은 클래스 내에서는
		//호출이 가능하지만 다른 클래스에서는 호출 불가능
		// cap.a = -10;
		// System.out.println(cap.a);
		
		cap.setA(100);
		System.out.println(cap.getA()); //데이터 호출
		
		cap.setA(-20);
		System.out.println(cap.getA());
		
	}
}
//변수에 직접적으로 접근하지 못하는 상태에서 캡슐화를 시킴 > 데이터 보호
//웹쪽에서는 거의 이렇게 작업화함(jsp)