package kr.s21.object.extention;

public class FeaturePhone extends Phone { //extends Phone를 입력해야 오류가 안남 상속받아야 있는거니까
	private int pixel; //사진 화소 수
	
	//생성자
	public FeaturePhone(String number, String model, String color, int pixel) {
		this.number = number;
		this.model = model;
		this.color = color;
		this.pixel = pixel;
	}
	
	//get메서드
	public int getPixel() {
		return pixel;
	}
}
