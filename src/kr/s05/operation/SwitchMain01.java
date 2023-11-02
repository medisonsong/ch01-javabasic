package kr.s05.operation;

public class SwitchMain01 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수형 숫자 입력>");
		int a = input.nextInt();
		//switch의 인자값은 long형을 제외한 정수형(byte, short, int)
		//char, 문자열 사용이 가능
		switch(a) { //a=인자값 / if문은 블럭문을 수행하고 빠져나가는데 switch는 각각의 케이스+브레이크가 있음.
		case 1: // 케이스 조건, : 콜론 사용
			System.out.println("1 입력");
			break; //switch블럭을 빠져나감
		case 2:
			System.out.println("2 입력");
			break;
		case 3:
			System.out.println("3 입력");
			break;
		default :
			System.out.println("1,2,3이 아닌 숫자 입력");
		}
		input.close();
		
	}

}
