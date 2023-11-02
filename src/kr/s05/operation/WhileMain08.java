package kr.s05.operation;

public class WhileMain08 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		/*
		 * [실습]
		 * 
		 * 커피 전문점에서 아메리카노가 4,000원입니다. 마실 커피 수량을 정하고
		 * 돈을 지불하세요.
		 * 지불한 돈에서 발생한 거스름돈을 출력하고, 커피의 총 비용보다 지불한 돈이 적어서
		 * 커피를 구매할 수 없을 경우 "금액이 부족합니다." 라고 알려주고,
		 * 다시 지불할 수 있는 프로그램을 작성하세요.
		 * (정상적으로 아메리카노를 구매하면 반복문을 빠져나오고 금액이 부족할 경우 계속 반복)
		 * 
		 * [입력 예시]
		 * 구매 수량 입력 : 1
		 * 내가 지불한 금액 : 5000
		 * or
		 * 내가 지불한 금액 : 3000 
		 * 
		 * [출력 예시]
		 * 거스름돈은 1,000원입니다. -> 반복문을 빠져나감 (거스름돈 >= 0)
		 * or
		 * 1,000원이 부족합니다. -> 계속 반복
		 * 
		 * price: 커피단가 , quantity: 수량, balance: 거스름돈, payment:지불한 돈, total: 총 지불해야 할 금액(price*quantity) / 모두 int형 
		 */
		
		int price = 4000;
				
		while(true) {
			
			System.out.print("구매 수량 입력:");
			int quantity = input.nextInt();
			System.out.print("내가 지불한 금액:");
			int payment = input.nextInt();
			
			int total = price * quantity;
			int balance = payment - total;
			
			if( balance >= 0 ) {
				System.out.printf("거스름돈은 %,d원입니다.%n", balance);
				break;
			}   /*
				 * else if( balance < 0 ) { 
				 * System.out.printf("%,d원이 부족합니다.%n", -balance); }
				 */
			System.out.printf("%,d원이 부족합니다.%n", -balance);
			//선생님 방법
			//if문을 balance>=0 만 넣고, System.out.printf("%,d원이 부족합니다.%n", -balance); 를 while안에 넣어도 계속 반복되면서 실행됨. if에 안넣고!
		}
		
		input.close();
	}
}
