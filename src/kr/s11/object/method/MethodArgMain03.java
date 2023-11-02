package kr.s11.object.method;

public class MethodArgMain03 {
	//Variable Arguments
	//자료형이 일치할 때 전달하고자 하는 값의 개수를 다르게 지정할 수 있음
	//전달하는 데이터는 내부적으로 배열로 인식함
	
	public void argTest(int ... n) { //n을 배열로 인식하기 때문에 값의 개수를 마음대로 넣을 수 있음
		for(int i=0;i<n.length;i++) {
			System.out.println("n[" + i + "]:" + n[i]);
		}
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) {
		MethodArgMain03 me = new MethodArgMain03();
		me.argTest(); // 배열은 만들어지는데 length가 0이라서 구분선만 출력이 됨 (에러 안남)
		me.argTest(10); // 출력결과> n[0]:10
		me.argTest(10, 20); // 출력결과> n[0]:10, n[1]:20 
		me.argTest(10,20,30); // n[0]:10 n[1]:20 n[2]:30
	}
}
