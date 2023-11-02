package kr.s21.object.extention;

//부모 클래스
public class Phone {
	protected String number; //같은 클래스 내에서 상속 관계면 접근 가능한거> protected
	protected String model;
	protected String color;
	
	public String getNumber() {
		return number;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
}
