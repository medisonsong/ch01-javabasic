package kr.s05.operation;

public class DoWhileMain01 {
	public static void main(String[] args) {
		int su = 0;
		String str = "Hello World";
		
		//선 처리, 후 비교
		do {
			System.out.println(str);
		}while(su++ < 5);
		System.out.println("-------------");
		// 무조건 한번 실행하고 비교하기 때문에 특수한 상황에서 사용함
		// 데이터베이스 연동하는 상황에서 쓰이기도 함.
		
		int su2 = 0;
		//선 비교, 후 처리
		while(su2++ < 5) {
			System.out.println(str);
		}
			
			
	}
}
