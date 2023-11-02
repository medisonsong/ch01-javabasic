package kr.s03.cast;

public class CastMain02 {
	public static void main(String[] args) {
		System.out.println("===명시적 형변환(강제 형변환)===");
		//더 작은 자료형으로 강등이 일어나는 형태, 정보의 손실이 발생할 수 있음.
		//(이런 경우는 거의 없지만 문법적으로 학습 위해 실행함)
		byte b1 = 127;
		byte b2 = 127;
		byte result = (byte)(b1 + b2); // (소괄호) 안에 자료형을 넣는, cast연산자를 사용해서 강제로 형변환을 실행할 수 있음.
		//자동적으로 int로 형변환된 것을 byte로 강제 형변환
		//만약 (byte)b1+b2 > 라고 한다면 b1만 형변환을 시킬 수 있으니 (b1+b2)결과값을 형변환하기 위해 소괄호를 넣음
		System.out.println("result = " + result);
		
		short s1 = 32767;
		short s2 = 32767;
		short result2 = (short)(s1 + s2); //자동적으로 int로 형변환된 것을 short로 강제 형변환
		System.out.println("result2 = " + result2);		

		
		int in1 = 100;
		long lg1 = 200L;
							//lg1 : long -> int로 강제 형변환
		int result3 = in1 + (int)lg1;
		System.out.println("result3 = " + result3); // 결과값이 int 표현 범위 안에 들어가기 때문에 데이터의 손실이 없음
		
		int in2 = 26;
		float ft = 10.3f;
							//ft : float -> int로 강제 형변환
		int result4 = in2 + (int)ft;
		System.out.println("result4 = " + result4);
	}
}
