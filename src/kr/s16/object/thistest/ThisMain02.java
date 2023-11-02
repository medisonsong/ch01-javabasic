package kr.s16.object.thistest;

class ThisTest{
	//은닉화
	private int a;//멤버변수
	
	//캡슐화
	public void setA(int a) {//지역변수
		//메서드 내에서 지역 변수명을 멤버 변수명과 동일하게 사용하면
		//지역 변수명이 우선하기 때문에 멤버 변수를 인식하지 못함.
		//이런 경우 this를 이용해서 멤버 변수를 지칭함
		this.a = a; //this.a라고 하면 멤버변수로 인식함.
	}
	//위처럼 int a넣고 a = a; 라고 하면 0이 출력됨
	//메소드 내부 지역변수 명이 멤버변수랑 같아서 충돌이 남. -> 메서드 안에서는 지역변수가 우선하기 때문에 이 안 a는 모두 지역변수. 
	//그때 이건 멤버변수입니다~ 라고 지칭하는게 this임
	
	public int getA() {
		return a;
	}
}

public class ThisMain02 {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
		
	}
}
