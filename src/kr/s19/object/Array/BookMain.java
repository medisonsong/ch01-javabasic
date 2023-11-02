package kr.s19.object.Array;

public class BookMain {
	public static void main(String[] args) {
		Book[] bookArray = new Book[3]; //배열은...고정길이다........
		int total = 0;
		
		//Book 객체를 3개 생성해서 배열 저장
		bookArray[0] = new Book("IT","Java",50000,0.05);
		bookArray[1] = new Book("IT", "Oracle", 40000, 0.03);
		bookArray[2] = new Book("미술", "반 고흐", 60000, 0.06);
		
		//출력하는 방법 1) 일반 반복문=인덱스 2) 확장 for문 두가지임
		
		//반복문을 이용해 객체의 멤버 변수 값 출력
		for(int i=0; i<bookArray.length;i++) {
			System.out.printf("%s\t", bookArray[i].getCategory());
			System.out.printf("%s\t", bookArray[i].getName());
			System.out.printf("%,d원\t", bookArray[i].getPrice());
			System.out.printf("%.2f%n", bookArray[i].getDiscount());
			//합계
			total += bookArray[i].getPrice();
		}
		System.out.printf("책 가격의 합 : %,d원%n", total);
		
		System.out.println("-------------------------");
		//확장 for문으로 멤버 변수 값 출력
		for(Book book : bookArray) {
			System.out.printf("%s\t", book.getCategory());
			System.out.printf("%s\t", book.getName());
			System.out.printf("%,d원\t", book.getPrice());
			System.out.printf("%.2f%%%n", book.getDiscount()); //%가 특문이라서 %% 하나 %n 하나 이렇게 인식함 그래서 % 출력되고 \n 됨
		}
		
	}
}

