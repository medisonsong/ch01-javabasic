package kr.s23.object.bank;

public class BankAccount {
	//멤버 변수
	protected String number; // 같은 클래스에 있거나 상속관계라면 갖다쓸수있음.
	protected String password;
	protected String name;
	protected long balance;
	
	//생성자
	public BankAccount(String number, String password, String name, long balance) {
		this.number = number;
		this.password = password;
		this.name = name;
		this.balance = balance;
		System.out.println(this.number + " 계좌가 개설되었습니다.");
	}
	
	//setters 들은 수정할 때 필요한데 지금은 수정을 안할거라 필요 없어서 지움
	//생성자 쪽 this.number = number; 이거면 됨.

	//입금 하기
	public void deposit(long amount) {
		if(amount <= 0) {
			System.out.println("0 이하의 금액은 입금할 수 없습니다.");
			return; // 메서드가 끝났다는 뜻인데 생략해도 문제 없어서 지금까지 생략했던거임... 아니 개헷갈린다 머야 이게
			//여기서 return은 특정 조건일 때 void형 메서드를 빠져나가기 위해서 return 을 기재함!!!!!!!!!!!
			//이 return이 없다면 else 넣어서 balance ~~~ 적었어야함
			
			//선생님 return 설명: 특정 조건일 때 void형 메서드를 빠져나감
		}
		balance += amount;
		System.out.println(amount + "원이 입금 되었습니다.");
	}
	
	//출금 하기
	public void withdraw(long amount) {
		if(amount <= 0) {
			System.out.println("0 이하의 금액은 입금할 수 없습니다.");
			return; // 이 return이 다중if문 같은 효과를 줌
		}
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount;
		System.out.println(amount + "원이 출금되었습니다.");
	}
	
	//잔고 확인
	public void printAccount() {
		System.out.println("---------------------");
		System.out.println("(일반)계좌번호 : " + number);
		System.out.println("비밀번호 : " + password);
		System.out.println("예금주 : " + name);
		System.out.printf("계좌 잔액 : %,d원%n", balance);
		System.out.println("---------------------");
	}
	
}
