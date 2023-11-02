package kr.s10.object.method;

public class MethodMain01 {
	//<기본적인 메서드의 이해>
	
	//1) 반환하는 데이터가 있는 경우 (반환형 int가 있는 경우)
// 접근제한자 반환형 메서드 (인자, 인자){
	public int add(int a, int b) {
	//          반환값(앞 반환 자료형에 맞춰서 생성됨)}
		return a + b;
	} // 이게 메서드의 기본적인 형태임..!!!!!
	
	//2) 반환하는 데이터가 없는 경우 (반환형이 없는 경우)
	// 반환형이 없어서 void 사용 (빈, 비어있는 이란 뜻)
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain01 method = new MethodMain01();
		
		int result = method.add(10, 20); // method.add 한 값이 위 int add 실행> return돼서 result에 저장됨. 
		System.out.println("result = " + result);

		method.print("오늘은 수요일");
	
	}
}
