package kr.s16.object.thistest;

public class LocalVariable {
	//멤버 변수 : 클래스 블럭 내에서 정의된 변수
	int b = 200;
	
	public LocalVariable() {
		int a = 300; //지역변수
		int c = 500;
		System.out.println("a = " + a); //지역변수 호출
		System.out.println("c = " + c);
	}
	
	
	public void make() { 
		//위 블럭에도 a가 있는데 여기서도 선언이 가능한 이유는 지역변수이기 때문에 각자 블럭에서만 생존하기 때문
		//지역 변수 : 메서드, 생성자, 제어문 블럭 내에서 생성된 변수
		//         해당 블럭이 종료되면 변수는 소멸함
		int a = 100;
		System.out.println("a : " + a); //지역변수
		System.out.println("b : " + b); //멤버변수
//		System.out.println("c : " + c); 위에서 선언한 지역변수지만 같은 블럭이 아니기 때문에 소멸됨. 그래서 에러남 
		//생성자에서 선언된 지역변수로 생성자가 종료되면 소멸됨
	}
	
	
	
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {// i -> 제어문 블럭 안의 지역변수
			System.out.println(i);
		}
		System.out.println("------------------");
		//제어문 블럭 밖에서 호출하면 지역변수가 소멸해서 호출 불가
//		System.out.println(i); 지역변수이기 때문에 블럭을 빠져나와서 i를 재사용할 수 없음
		
		for(int i=1;i<=10;i++) { //지역변수이기 때문에 위 블럭i가 있어도 i를 선언할 수 있음
			System.out.println(i);
		}
		
		
	}
}




