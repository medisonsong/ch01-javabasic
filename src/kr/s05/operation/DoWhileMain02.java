package kr.s05.operation;

public class DoWhileMain02 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int korean, english, math, sum;
		char grade;
		float avg;
		
		//do블럭에서 입력한 값을 조건 체크해서 0부터 100사이이면 조건이 false가 되어 do~while 블럭을 빠져나감
		do {
			System.out.print("국어=");
			korean = input.nextInt();
		}while(korean < 0 || korean > 100); //국어를 입력받아서 0이하거나 100이상(true)이면 다시 입력하게 돌아가는 것. false면 빠져나가서 다음 작업 수행
		
		//do~while은 문구 처리를 못함. 0~100까지의 수를 입력하시오. << 처럼
		//따로 문구처리를 하는 방법이 있긴 함
		
		do {
			System.out.print("영어=");
			english = input.nextInt();
		}while(english < 0 || english > 100); // english가 음수이거나 100 넘으면 true, 그럼 다시 돌아가서 do 실행/ false면 다음 작업 수행
		
		do {
			System.out.print("수학=");
			math = input.nextInt();
		}while(math < 0 || math > 100);
		
		//총점 구하기
		sum = korean + english + math;
		//평균 구하기
		avg = sum / 3.0f; // 실수데이터기 때문에 3.0f로 표현해서 실수값을 내야함. 3.0이라고만 하면 double이 돼서 오류가남 float<double 이라서
		//등급 구하기 (정수값을 쓴다거나 문자열을 쓰거나 이퀄비교 > 스위치 쓸때가 좋을 때도 있음)
		//if문도 많이 쓰는데 스위치문을 많이 접하는게 좋아서 스위치로 작성
		switch((int)(avg/10)) { //float이라서 오류남 그래서 강제로 형변환 시켜야함
		case 10:
		case 9:	grade = 'A'; break;
		case 8:	grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; 
		}
		
		System.out.println(); //단순 줄바꿈 / print(\n)도 됨.
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %.2f%n", avg);
		System.out.printf("등급 = %c%n", grade);
		
		
		input.close();
		
	}

}
