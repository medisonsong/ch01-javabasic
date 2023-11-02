package kr.s04.operator;

public class OperatorMain05 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in); // 입력 작업 시작
			System.out.print("국어:");
			//입력된 정수를 변수에 대입
			int korean = input.nextInt();
//			System.out.printf("국어 = %d%n", korean);

			System.out.print("영어:");
			int english = input.nextInt();
//			System.out.printf("영어 = %d%n", english);
			
			System.out.print("수학:");
			int math = input.nextInt();
//			System.out.printf("수학 = %d%n", math);
			
			//총점 구하기
			int sum= korean + english + math;
			//평균 구하기
//			double avg = sum / 3; // 정수 데이터로 연산 후 실수데이터처럼 표기함
			double avg = sum / 3.0; // 처럼 하나를 double(실수) 로 바꿔서 넣어서 double로 바꾸기
			
			System.out.printf("국어 = %d%n", korean);
			System.out.printf("영어 = %d%n", english);
			System.out.printf("수학 = %d%n", math);
			
			System.out.printf("총점 = %d%n", sum);
			System.out.printf("평균 = %.2f%n", avg);
			
		input.close(); // 입력 끝났을 때 
		
		//주의사항
		//nextInt에 정수만 입력해야함. 실수로 입력하고 싶으면 nextInt 대신 nextDouble() 하면 됨.
				
	}
}
