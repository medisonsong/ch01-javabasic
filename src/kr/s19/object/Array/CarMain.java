package kr.s19.object.Array;

class Car{
	//멤버 변수
	private String color;
	private int speed;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
}

public class CarMain {
	public static void main(String[] args) {
		//배열 선언 및 생성
		Car[] carArray = new Car[3]; 
		
		for(int i=0; i<carArray.length;i++) {
			System.out.println(carArray[i]); //객체가 생성되지 않아서 주소가 없음 그래서 null이 나옴.
		}
		System.out.println("-------------------");
		//첫번째 객체
		carArray[0] = new Car();
		carArray[0].setColor("검정색");
		carArray[0].setSpeed(100); // 생성자가 없기 때문에 이렇게 하나하나 명시했음
		//두번째 객체
		carArray[1] = new Car();
		carArray[1].setColor("흰색");
		carArray[1].setSpeed(200);
		//세번째 객체
		carArray[2] = new Car();
		carArray[2].setColor("파란색");
		carArray[2].setSpeed(300);
		
		//배열의 요소 출력
		for(int i=0; i<carArray.length; i++) {
			System.out.println(carArray[i]);
		} // 얘네는 배열의 참조값(주소)를 출력함
		System.out.println("------------------------");
		
		//Car 객체의 멤버 변수에 저장된 데이터를 출력
		for(int i=0; i<carArray.length; i++) {
			System.out.println("carArray["+i+"]: 색상->"+carArray[i].getColor()+", 스피드->"+carArray[i].getSpeed());
		} // 배열명[i].메서드이름() 
		System.out.println("------------------------");
		
		//확장for문
		//객체의 배열은 일반 for문보다 확장for문이 더 편함
		for(Car car : carArray) {
			// System.out.println(car); / 일반 배열처럼 이러면 참조주소만 나옴.
			System.out.println("색상 : " + car.getColor() + ", 스피드 : " + car.getSpeed());
		}
	}
	
}
