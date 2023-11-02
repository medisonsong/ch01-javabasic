package kr.s26.lang.string;

public class StringMain01 {
	public static void main(String[] args) {
		//암시적으로 객체 생성
		//암시적으로 객체를 생성할 때 문자열이 같으면 같은 객체를 공유
		String str1 = "jupiter";
		String str2 = "jupiter";
		
		//객체 비교
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체");
		}else {
			System.out.println("str1과 str2는 다른 객체");
		}
		
		//문자열 비교
		if(str1.equals(str2)) {
			System.out.println("str1의 내용(문자열)과 str2의 내용(문자열)이 같다");
		}else {
			System.out.println("str1의 내용(문자열)과 str2의 내용(문자열)이 다르다");
		}
		
		//로그인 같은거 짤 때는 객체가 아닌 문자열을 비교해야하기 때문에 ==가 아니라 equals를 써야함.
		
		System.out.println("----------------------");
		
		//명시적 객체 생성
		//명시적으로 객체를 생성하면 같은 문자열을 사용해도 각각 새로운 객체를 생성
		String str3 = new String("Moon");
		String str4 = new String("Moon");
		
		//객체 비교 
		if(str3 == str4) {
			System.out.println("str3과 str4는 같은 객체");
		}else {
			System.out.println("str3과 str4는 다른 객체");
		}
		
		//문자열 비교
		if(str3.equals(str4)) {
			System.out.println("str3의 내용(문자열)과 str4의 내용(문자열)이 같다");
		}else {
			System.out.println("str3의 내용(문자열)과 str4의 내용(문자열)이 다르다");
		}
		System.out.println("-------------------------");
		
		String str5 = "earth";
		String str6 = "EARTH";
		
		//대소문자를 구분하지 않고 문자열 비교
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println("[대소문자 구분 없이 비교]str5와 str6의 문자열은 같다");
		}else {
			System.out.println("[대소문자 구분 없이 비교]str5와 str6의 문자열은 다르다");
		}
		
	}
}
