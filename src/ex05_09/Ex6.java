package ex05_09;

public class Ex6 {

	public static void main(String[] args) {
		// 197p
		
		// Q1) 정답: this
		// 클래스 내부에서 자신의 주소를 가리키는 예약어를 XXX 라고 합니다.
		
		// Q2) 정답: this()
		// 클래스에 여러 생성자가 오버로드되어 있을 경우에
		// 하나의 생성자에서 다른 생성자를 호출할때 XXX를 사용합니다.

		// Q3) 정답: 클래스 변수
		// 클래스 내부에 선언하는 static 변수는 생성되는 인스턴스 마다 만들어지는 것이 아닌
		// 여러 인스턴스가 공유하는 변수입니다. 따라서 클래스에 기반한 유일한 변수라는 의미로 XXX 라고도 합니다.
		
		// Q4) 스택, 데이터 영역
		// 지역 변수는 함수나 메서드 내부에서만 사용할 수 있고 XXX 메모리에 생성됩니다.
		// 멤버변수중 static 예역어를 사용하는 변수는 static XXX 메모리에 생성됩
		
		// Q5)
		// 아침 출근길에 김 씨는 4000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
		// 이씨는 콩다방에서 4500원을 내고 라떼를 사 마셨습니다. 이 과정을 객체지향으로 프로그래밍해 보세요.
		CoffeeShop 별다방 = new CoffeeShop("별다방");
		CoffeeShop 콩다방 = new CoffeeShop("콩다방");
		
		Customer 김씨 = new Customer("김씨", 1000000);
		Customer 이씨 = new Customer("이씨", 20000);
		
		System.out.println("----- 커피 구매 전 -----");
		System.out.println("김씨 돈: " + 김씨.money);
		System.out.println("김씨 커피: " + 김씨.coffee);
		System.out.println();
		System.out.println("이씨 돈: " + 이씨.money);
		System.out.println("이씨 커피: " + 이씨.coffee);
		System.out.println();
		
		System.out.println(별다방.name + "의 오늘 매출: " + 별다방.money);
		System.out.println(콩다방.name + "의 오늘 매출: " + 콩다방.money);
		
		// 커피 구매
		김씨.buyCoffee(별다방, "아메리카노", 4000);
		이씨.buyCoffee(콩다방, "라떼", 4500);
		
		System.out.println("----- 커피 구매 후 -----");
		System.out.println("김씨 돈: " + 김씨.money);
//		System.out.println("김씨 커피: " + 김씨.coffee);
		System.out.println("김씨 커피 종류: " + 김씨.coffee.kind);
		System.out.println("김씨 커피 가격: " + 김씨.coffee.price);
		System.out.println();
		
		System.out.println("이씨 돈: " + 이씨.money);
//		System.out.println("이씨 커피: " + 이씨.coffee);
		System.out.println("이씨 커피 종류: " + 이씨.coffee.kind);
		System.out.println("이씨 커피 가격: " + 이씨.coffee.price);
		System.out.println();
		
		System.out.println(별다방.name + "의 오늘 매출: " + 별다방.money);
		System.out.println(콩다방.name + "의 오늘 매출: " + 콩다방.money);
		 
		System.out.println("----- 김씨가 한잔 더삼 -----");
		김씨.buyCoffee(콩다방, "아인슈패너", 100000);
		System.out.println("김씨 돈: " + 김씨.money);
		System.out.println("김씨 커피 종류: " + 김씨.coffee.kind);
		System.out.println("김씨 커피 가격: " + 김씨.coffee.price);
		
		System.out.println(별다방.name + "의 오늘 매출: " + 별다방.money);
		System.out.println(콩다방.name + "의 오늘 매출: " + 콩다방.money);
		
		
	}

}

class Customer {
	
	String name;
	int money;
	Coffee coffee;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(CoffeeShop coffeeShop, String kind, int price) {
		this.money -= price;
		coffee = coffeeShop.sellCoffee(kind, price);
	}
	
}

class CoffeeShop {
	String name;
	int money;
	
	public CoffeeShop(String name) {
		this.name = name;
	}
	
	public Coffee sellCoffee(String kind, int price) {
		this.money += price;
		return new Coffee(kind, price);
	}
}

class Coffee {
	String kind;
	int price;
	
	public Coffee(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}
}










