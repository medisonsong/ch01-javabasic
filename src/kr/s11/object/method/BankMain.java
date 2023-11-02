package kr.s11.object.method;

import java.util.Scanner;

/*
 * [실습]
 * Account
 * 1) 멤버 변수: 계좌번호(account_num/연산작업X 정보니까 string처리), 예금주(name), 잔고(balance/int)
 * 2) 멤버 메서드: 1.예금하기(deposite): balance에 값 누적
 * 					예금 처리 후 "입금이 완료되었습니다." 문구 출력
 * 				2.출금하기(withdraw): balance에 값 차감
 * 					출금 처리 후 "출금이 완료되었습니다."
 * 				3.계좌정보(printAccount): 계좌번호, 예금주, 잔고 출력
 * BankMain
 * 1) Account 생성
 * 		"계좌 기본 정보를 입력해서 계좌를 생성합니다." 문구 출력 후
 * 		계좌번호, 예금주, 잔고를 입력
 * 		"홍길동님 계좌가 개설되었습니다." 문구 출력 
 * 2) while문을 만들고 메뉴 지정
 * 		1.예금 2.출금 3.잔고확인 4.종료
 */

class Account{
	//멤버 변수
	String account_num; //계좌번호
	String name; //예금주
	int balance; //잔고
	
	int plus;
	public int deposite(int a) {
		if(plus>0) {
			balance += plus;
			System.out.println("입금이 완료되었습니다.");
		}
		return balance;
	}
	
	int minus;
	public int withdraw(int a) {
		if(minus>0) {
			balance -= minus;
			System.out.println("출금이 완료되었습니다.");
		}
		return balance;
	}
	
	public void printAccount() {
			System.out.println("계좌번호 : " + account_num);
			System.out.println("예금주 : " + name);
			System.out.printf("잔고 : %,d원%n", balance);
		}
}

public class BankMain {
	public static void main(String[] args) {
		
		Account ac = new Account();
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("계좌 기본 정보를 입력해서 계좌를 생성합니다.");
		System.out.print("계좌번호:");
		ac.account_num = input.nextLine();
		
		System.out.print("예금주:");
		ac.name = input.nextLine();
		
		System.out.print("잔고:");
		ac.balance = input.nextInt();
		
		System.out.printf("%s님 계좌가 개설되었습니다.%n", ac.name);
		
		
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("--------------------------------");
			
			System.out.print("메뉴 선택:");
			int num = input.nextInt();
			
			if(num==1) {//예금
				System.out.print("예금액:");
				ac.plus = input.nextInt();
				ac.deposite(ac.plus);
			}else if(num==2){//출금
				System.out.print("출금액:");
				ac.minus = input.nextInt();
				ac.withdraw(ac.minus);
			}else if(num==3) {//잔고확인
				ac.printAccount();
			}else if(num==4) {//종료
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
		
		input.close();
	}
}

// 여긴 내가 짠거 밑엔 선생님거

/*
 * String account_num;
 * String name;
 * int balance;
 * 
 * 1) 예금하기
 * public void deposite(int money){         아 이렇게 바로.. 선언하고 만들면 되네
 * 	if(money <= 0) {                            기본적인 조건 체크에용
 * 		System.out.println("입금액은 0보다 크게 입력하세요");
 * 	}else {
 * 		balance += money;
 * 		System.out.println("입금이 완료 되었습니다.");
 * 		}
 * } 
 * 2) 출금하기
 * public void withdraw(int money){
 * 	if(money <= 0) {
 * 		System.out.println("출금액은 0보다 크게 입력하세요.");
 * }else if(balance < money) { //마이너스 통장이 아니기 때문에
 * 		System.out.println("잔액이 부족합니다.");
 * }else {
 * 		balance -= money;
 * 	  }
 * }
 * 3) 계좌정보출력
 * public void printAccount(){
 * 	System.out.println("계좌번호:"+account_num);
 * 	System.out.println("예금주:"+name);
 * 	System.out.printf("잔고:%,d원%n", balance);
 * }
 * ---------------main-------------------
 * 1) 계좌 생성(객체 선언 및 생성)
 * Account account = new Account();
 * System.out.println("계좌 기본 정보를 입력해서 계좌를 생성합니다.");
 * System.out.print("계좌번호:");
 * account.account_num = input.nextLine();
 * System.out.print("예금주:");
 * account.account_name = input.nextLine();
 * System.out.print("잔고:");
 * account.account_balance = input.nextLine();
 * 
 * System.out.println(account.name + "님 계좌가 개설되었습니다.");
 * 
 * while(true){
 * 	System.out.println("-------------------------")
 * 	System.out.println("1.예금 2.출금 3.잔고확인 4.종료")
 * 	System.out.println("-------------------------")
 * 	
 * 	System.out.print("메뉴 선택:");
 * 	int num = input.nextInt();
 * 
 *  if(num==1){
 *  	System.out.print("예금액:");
 *  	account.deposite(input.nextInt());           깔끔하당... 이런 방법도 있다...!!!!!!!!!!!!!!!!!
 *  }else if(num==2){
 *  	System.out.print("출금액:");
 *  	account.withdraw(input.nextInt());           
 *  }else if(num==3){
 *	 	 account.printAccount();
 *  }else if(num==4){
 *  	System.out.println("프로그램 종료");
 *  	break;
 *  }else {
 *  	System.out.println("잘못 입력했습니다.");
 *  }
 * 		input.close();
 * 	 }
 * }
 * 
 */

//프로그램 짤때 순서. 공부하는 사람 입장이기 때문에 먼저 해결할 수 있는 것부터 하는 게 좋음
//else이런것부터 먼저 해놓고 하나하나 짜는 ㅎㅅㅎ 내가 원래 하고 있었던 방법!!!!!!!!!!!hehe