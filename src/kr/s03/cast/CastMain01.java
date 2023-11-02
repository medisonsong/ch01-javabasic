package kr.s03.cast;

public class CastMain01 {
	public static void main(String[] args) {
		System.out.println("===묵시적 형변환(자동 형변환)===");
		//더 큰 자료형으로 승격이 일어나는 형태, 정보의 손실이 전혀 없으며 자동적으로 발생
		
		byte b1 = 127;
		byte b2 = 127;
		// byte result = b1 + b2; / 자동으로 형변환이 일어나기 때문에 에러발생함
		int result = b1 + b2; //32bit (4byte)미만의 자료형 즉, byte형 데이터들을 연산하면 32bit로 승격.
		
		System.out.println("result = " + result);
		//254라는 결과를 보호하기 위해 자동으로 승격되게끔 만들어져있음. 그래서 byte result는 오류, int는 가능
		
		short s1 = 32767;
		short s2 = 32767;
		int result2 = s1 + s2; // 32bit 미만의 자료형 즉, short형 데이터들을 연산하면 32bit로 승격.
		System.out.println("result2 = " + result2);

		int in2 = 1234;
		long lg2 = 2345L;
					   //아래 식에서 in2 : int -> long 자동 형변환이 일어남
		long result3 = in2 + lg2;
		System.out.println("result3 = " + result3);
		
		int in3 = 25;
		double db = 10.5;
						//in3 : int -> double 자동 형변환
		double result4 = in3 + db; //25.0 + 10.5 로 계산
		System.out.println("result4 = " + result4);
		
	}
}
