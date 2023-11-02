package kr.s06.array;

public class ArrayMain07 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//과목명
		String[] course = {"국어", "영어", "수학"};
		//성적 
		int[] score = new int[course.length]; //new int[3]이라고 적을 수도 있는데 위 코드가 수정될 가능성이 있기 때문에
		//총점
		int sum = 0;
		//평균
		float avg = 0.0f;
		
		//반복문을 이용해서 입력 처리
		for(int i=0;i<score.length;i++) {
			do {
				System.out.print(course[i] + "=");
				score[i] = input.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			//총점 구하기
			sum += score[i];
		}
		//평균 구하기
		avg = sum / (float)course.length; // score length라고 해도 되고 course length라고 해도 됨
		
		System.out.println(); //단순 줄바꿈
		
		//과목 점수 출력
		for(int i=0; i<score.length; i++) {
			System.out.printf("%s = %d%n", course[i], score[i]);
		}
		
		//총점과 평균 출력
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %.2f%n", avg);
		
		input.close();
	}
}
