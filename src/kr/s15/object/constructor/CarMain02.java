package kr.s15.object.constructor;
	//생성자 무슨 말인지 아예 모르것다... 나중에 한번 영상 찾아봐야할듯
class Car2{ // Car라고 하면 에러남: 같은 패키지 내에서는 유니크해야하는데 CarMain01에 이미 Car가 있어서 Car2로 설정
	String color;
	String gearType;
	int door;
	
	//생성자 오버로딩
	public Car2() {}
	
	public Car2(String c, String g, int d) { //변환형이 없으니 생성자임
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarMain02 {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); //위에 생성자 넣는 작업을 이미 해서 한 번 더 하면 오류남
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 2;
		
		System.out.println(c1.color + "," + c1.gearType + "," + c1.door);
		System.out.println("---------------------");
		
		Car2 c2 = new Car2("blue", "manual", 5);
		System.out.println(c2.color + "," + c2.gearType + "," + c2.door);
	}
}
