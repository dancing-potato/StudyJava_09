package JAVA0705;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 돈이 10000원 있고 사과 한개에 1000원 이라고 할때
		 * 1. 최대 구매 가능 갯수
		 * 2. 사과 3개의 가격
		 * 3. 사과 5개를 사고 남는 금액
		 * 4. 사과 5개를 사고 쌓이는 적립금 (구매금액의 1% 라고 가정)
		 * 
		 * */
		
//		System.out.println(10000/1000);
//		System.out.println(1000 * 3);
//		System.out.println(10000 - (1000 * 5));
//		System.out.println(1000 * 5 * 0.01);
		
		// 변수 사용 version
		int money = 50000;
		int apple = 1200;
		System.out.println(money / apple);
		System.out.println(apple * 3);
		System.out.println(money - (apple * 5));
		System.out.println(apple * 5 * 0.01);
		
		
		
		
		
		
	}

}
