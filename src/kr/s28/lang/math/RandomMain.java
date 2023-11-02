package kr.s28.lang.math;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"스마트폰", "TV", "냉장고", "꽝!"};
						//   0       1     2      3
		double ran = Math.random(); // 0.0 ~ 1.0 미만의 난수 발생
		System.out.println("발생한 난수 : " + ran);
		
		int index = (int)(ran*4);
		System.out.println("정수로 변환한 난수 : " + index); // 0 1 2 3 범위로 난수 발생할 수 있도록 ran*4하고 int로 형변환 시킴
		System.out.println("오늘의 선물 : " + gift[index]);
		System.out.println("-----------------------------");

		
		String[] luck = {"귀인을 만남", "해외여행 출발", "로또 당첨", "피곤한 하루"};
						//   0           1           2           3
		Random r1 = new Random(); // java.util.Random 안에 있는거라 객체 생성 하고 random 돌려야함.
		//위에 Math.random은 static이라서 객체 생성 안해도 됨.
		index = r1.nextInt(4); // 0부터 인자로 전달되는 값의 전까지 범위로 난수 발생/ 0 1 2 3 까지 발생되는거.
		System.out.println("발생한 난수 : " + index);
		System.out.println("오늘의 운세 : " + luck[index]);
	}
}

/*
 * 난수 만드는 방법(2)
 * 1. Math.random() 으로 만드는 방법
 * Math 는 static을 이용하기 때문에 객체 생성할 필요 없음 근데 연산 필요함 0부터 0.999999까지라
 * 
 * 2. java.util.Random import 해서 index =r1.nextInt(3);처럼
 * 인수 넣는 방법
 * 계산 안해도 되는데 객체 생성해야함
*/
