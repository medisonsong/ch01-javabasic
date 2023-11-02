package kr.s28.lang.math;

import java.util.Scanner;

public class RandomMain02 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 가위바위보 게임
		 * 
		 * [입력 예시]
		 * while문으로 루프를 돌면서 계속 메뉴가 보이게 만들거임
		 * -------------------
		 * 메뉴>1.게임하기, 2.종료
		 * -------------------
		 * 
		 * 메뉴>1
		 * 가위바위보 입력(0.가위, 1.바위, 2.보):
		 * 
		 * [출력 예시]
		 * -> 컴퓨터: 가위, 사람: 바위
		 * 결과 : 사람 승
		 * 
		 * 숫자 입력되면 난수 발생시켜서 게임하면 됨 
		 */
		
		Scanner input = new Scanner(System.in);
		String item[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("메뉴> 1. 게임하기 2. 종료");
			System.out.println("-------------------------------------");
			System.out.println();
			System.out.print("메뉴를 입력하세요>");
			int num = input.nextInt();
			
			if(num==1) {
				System.out.println("가위바위보 입력(0.가위 1.바위 2.보)");
				int user = input.nextInt();
				
				if (user < 0 || user > 2 ) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				int computer = (int)(Math.random()*3);
				
				/*
				 * 컴퓨터  -  유저   결과
				 * 0         1     -1 유저승
				 * 0         2     -2 컴퓨터승
				 * 1         0      1 컴퓨터승
				 * 1         2     -1 유저승
				 * 2         0      2 유저승
				 * 2         1      1 컴퓨터승
				 * 
				 * 값이 같을땐 무승부
				 * 유저승: -1, 2
				 * 컴퓨터승: -2, 1
				 */
				
				int result = computer - user;
				
				System.out.println("-> 컴퓨터 : " + item[computer] + ", 사람 :" + item[user]);
				System.out.print("결과 : ");
				if(result == -1 || result == 2) {
					System.out.println("사람 승");
				}else if(result == -2 || result == 1) {
					System.out.println("컴퓨터 승");
				}else {
					System.out.println("무승부");
				}
			}else if(num==2) {
				System.out.println("게임을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
				continue;
			}
			
			
		}
		input.close();
		
	}
}

/*
 * 선생님 코드
 * int computer = (int)(Math.random()*3); // 0~2
 * 
 * 컴퓨터 - 사용자 = 결과
 * 0      0        0   무승부
 * 0      1       -1  사용자승
 * 0      2       -2  컴퓨터승
 * -------------------------
 * 1      0        1  컴퓨터승
 * 1      1        0  무
 * 1      2       -1  사용자승
 * -------------------------
 * 2      0        2  사용자승
 * 2      1        1  컴퓨터승
 * 2      2        0  무
 * 
 * 0 > 무승부
 * -1 > 사용자승
 * -2 > 컴퓨터승
 * 1 > 컴퓨터승
 * 2 > 사용자승
 * 
 * int result = computer - user;
 * 
 * System.out.println("-> 컴퓨터 : " + item[computer], "-> 사람 : " + item[user])
 * Systme.out.print("결과 : ");
 * if(result == -1 || result == 2){
 * 		System.out.println("사람 승");
 * }else if(result == -2 || result == 1){
 * 		System.out.print("컴퓨터 승");
 * }else {
 * 		System.out.print("무승부");
 * }
 * 
 */
