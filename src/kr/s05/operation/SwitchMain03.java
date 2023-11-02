package kr.s05.operation;

public class SwitchMain03 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("성적입력>");
		score = input.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("성적은 0~100만 입력 가능");
			System.exit(0); // 프로그램 종료
		}
		
		switch(score/10) {
		case 10:
			grade = 'A'; // case10과 9가 연속적으로 위치해있고, 수행문이 똑같음 -> 생략 가능
			break;
			// case 10:
			// case 9:
			//		grade = 'A'; break; 이런식으로
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println(); //단순 줄바꿈 () 안에 아무것도 안 넣으면 됨
		System.out.printf("성적 : %d%n", score);
		System.out.printf("등급 : %c%n", grade);
		
		input.close();
	}
}
