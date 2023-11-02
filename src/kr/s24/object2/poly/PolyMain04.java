package kr.s24.object2.poly;

//부모 클래스
class Product{
	int price; //제품의 가격
	int bonusPoint; //제품 구매시 제공하는 보너스 점수
	//인자가 있는 생성자
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	//제품의 이름을 반환
	public String getName() {
		return "상품";
	}
}


class Tv extends Product{
	public Tv() {
		super(100); // Tv의 가격
	}
	@Override
	public String getName() {
		return "Tv";
	}
}


class Computer extends Product{
	public Computer() {
		super(200); //computer 가격
	}
	@Override //메서드 오버라이딩(재정의)
	public String getName() {
		return "Computer";
	}
}


//제품을 추가하더라도 product를 상속받으면 문제가 없음
class Audio extends Product{
	public Audio() {
		super(300); // audio의 가격
	}
	public String getName() {
		return "Audio";
	}
}


class Buyer{
	private int money = 1000; //구매자 보유 금액
	private int bonusPoint = 0; //보너스 점수 (10%)
	//샹품 구매
	public void buy(Product p) { // 부모타입으로 넣었기 때문에 Tv랑 컴퓨터 모두 전달가능함.
		// 메서드 오버로딩으로 짜면 중간에 스마트폰같은 객체가 추가되면 또 새로 만들어야해서 번거로움)
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price; //차감
		bonusPoint += p.bonusPoint; //누적
		
		System.out.println(p.getName() + "을/를 구입하셨습니다.");
		System.out.println("현재 남은 돈은 " + money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 "+bonusPoint+"점입니다.");
	}
}

public class PolyMain04 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio ad = new Audio();
		
		//Tv 구매
		b.buy(tv); // Tv -> Product 형변환
		//Computer를 구매
		b.buy(com); // Computer -> product 형변환
		//Audio 구매
		b.buy(ad); // Audio -> product로 형변환
	}
}


//형변환은 부모자식간에만 가능해서 상속 시키고 product로 계산돌린거임 그게 아니라면 tv계산 audio계산 하나하나 다 따로해야함
