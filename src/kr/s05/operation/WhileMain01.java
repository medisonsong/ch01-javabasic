package kr.s05.operation;

public class WhileMain01 {
	public static void main(String[] args) {
		//while문은 조건 비교에 만족할 때만 수행문을 수행하는 반복문
		//for문과는 다르게 조건식 위주로 반복 수행을 하기 위해 만들어짐.
		
		int i = 1; //초기값

			  //조건식
		while(i <= 10) {
			System.out.println(i++); //증감식
		}
		System.out.println("-------------");
		
		
		int j = 10; //초기값
		
		while(j >= 0) {
			System.out.println(j--);
		}
		
	}

}
