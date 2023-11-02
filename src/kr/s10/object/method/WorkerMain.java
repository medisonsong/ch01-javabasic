package kr.s10.object.method;
/*
 * [실습]
 * Worker
 * 1) 멤버 변수 : 직원 이름(name)-String, 급여(money)-int, 계좌 잔고(balance)-int
 * 2) 멤버 메서드 : work(실행하면 money에 1000원을 누적),
 *               deposite(실행하면 money의 돈을 balance에 누적시키고 money는 0으로 처리)
 *    WorkerMain의 main 메서드
 *    1) worker 객체 생성
 *    2) 직원의 이름 지정
 *    3) 10번 일하는데 번 돈이 3000원이 모일 때마다 계좌에 저축 (한번 일할때 1천원 누적) >반복문, 조건식
 *    4) 직원 이름, 현재 계좌에 입금되지 않고 남아 있는 급여 출력 (money), 계좌 잔고 (balance)를 출력하시오.
 */

class Worker{
	//멤버 변수
	String name;
	int money;
	int balance;
	//멤버 메서드
	public void work() { //메서드 내부에서 변환하고, 반환할 필요가 없기 때문에 void문 사용
		money += 1000;
	}
	public void deposite() {
		balance += money;
		money = 0;
	}
}

public class WorkerMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
	Worker worker = new Worker();
	worker.name = "차은우";
	
	//10번 일하는데 번 돈이 3,000원일 때마다 저축
	for(int i=1; i<=10; i++) {
		worker.work();
		if(worker.money >= 3000) {//3000원일때마다 저축 worker.money%3000==0 이라고 해도 됨.
			worker.deposite();
		}
	}
	
	System.out.println("직원 이름 : " + worker.name);
	System.out.printf("현재 계좌에 입금되지 않고 남아 있는 급여 : %,d원%n", worker.money);
	System.out.printf("계좌 잔고 : %,d원", worker.balance);
	 
	}
}
