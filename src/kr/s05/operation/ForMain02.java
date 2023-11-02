package kr.s05.operation;

public class ForMain02 {
	public static void main(String[] args) {
		//감소연산자 사용해서 5부터 1까지 출력
		for(int i=5;i>=1;i--) {
			System.out.print(i + "\t");
		}
		System.out.println("\n----------");
		
		//0부터 10까지 짝수만 출력 (대입연산자 사용)
		for(int i=0;i<=10;i+=2) {
			System.out.print(i + "\t");
		}
		System.out.println("\n----------");
		
		//대입연산자 사용하지 않아도 if문으로도 짝수만 출력할 수 있음
		//조건체크 연습을 할 수 있어서 for문 하에 if문 넣는 문장을 더 추천함
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i + "\t");
			}
		}
	}
}
