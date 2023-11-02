package kr.s17.object.trainning;

public class AnimalMain {
/*
 * [실습]
 * 1. 객체 생성 : 인자가 있는 생성자로 객체를 생성
 * 2. 생성된 객체의 멤버 변수에 저장된 정보 출력
 *    이름 : 기러기
 *    나이 : 3살
 *    비행 여부 : 가능
 * 3. 객체 생성 : 인자가 없는 생성자로 객체를 생성
 * 4. 생성된 객체의 멤버 변수에 저장된 정보 출력
 * 	  이름 : 기린
 *    나이 : 10살
 *    비행 여부 : 불가능
 */
	
	public static void main(String[] args) {
		Animal a1 = new Animal("기러기", 3, true);

		System.out.println("이름 : " + a1.getName()); // private이라 안에서 직접 못해서 이렇게 호출해야함
		System.out.println("나이 : " + a1.getAge() + "살");
		// System.out.println("비행여부 : " + (a1.isFly()? "가능" : "불가능" )); //삼항연산자 사용 /원래 쓰던 방식
		System.out.println("비행 여부 : " + printFly(a1.isFly()));
		
		System.out.println("-------------------------");
		
		Animal a2 = new Animal();
		a2.SetName("기린");
		a2.SetAge(10);
		a2.Setfly(false);
		System.out.println("이름 : " + a2.getName());
		System.out.println("나이 : " + a2.getAge() + "살");
		// System.out.println("비행 여부 : " + (a2.isFly()?"가능":"불가능")); 얘도 static 메서드 써서 다시 해보면
		System.out.println("비행 여부 : " + printFly(a2.isFly()));
		
	}
	
	public static String printFly(boolean fly) { //static 메서드 생성
		return fly ? "가능" : "불가능";
	}
	
}
