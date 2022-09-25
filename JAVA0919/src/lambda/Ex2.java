package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

	Customer customer1	= new Customer("우영우", 26, 100);
	Customer customer2	= new Customer("오인주", 31, 200);
	Customer customer3	= new Customer("오인경", 28, 20);
	Customer customer4	= new Customer("오인혜", 18, 30);
	Customer customer5	= new Customer("진화영", 36, 50);
		
	
	List<Customer>list = new ArrayList<Customer>();
	
	list.add(customer1);
	list.add(customer2);
	list.add(customer3);
	list.add(customer4);
	list.add(customer5);
	
	System.out.println("===== 고객 명단(이름만) 추가된 순서대로 출력 =====");
	list.stream().map(c -> c.getName())
				 .forEach(c -> System.out.println(c));
	
	
	int total = list.stream().mapToInt(c -> c.getPrice()).sum();
	System.out.println("총 여행 비용은 " + total + " 입니다.");
	
//--------------------------------------------------------------------------
	System.out.println("===== 30세 이상 고객 중 여행비용이 큰 순으로 출력  =====");
	
	list.stream().filter(c -> c.getAge() >= 30)
				 .sorted((c1,c2) -> c2.getPrice() - c1.getPrice())
				 .forEach(c -> System.out.println(c));
	
//--------------------------------------------------------------------------
	System.out.println("===== 가장 어린 사람의 정보 출력 =====");

	// 강사님 방법
	Customer customer = list.stream().min((c1,c2) -> c2.getAge() - c1.getAge()).get();
	System.out.println(customer);
	
	// 구글링 한 방법
	list.stream().min(Comparator.comparing(Customer::getAge))
				 .ifPresent(c -> System.out.println(c));
				 
//--------------------------------------------------------------------------	
	System.out.println("===== 가장 비용이 적은 사람 출력 ====="); 

	// 강사님 방법
	customer =  list.stream().min((c1,c2) -> c2.getPrice() - c1.getPrice()).get();
	System.out.println(customer);
	
	// 구글링 한 방법
	list.stream().min(Comparator.comparing(Customer::getPrice))
				 .map(c -> c.getName())
	 			 .ifPresent(c -> System.out.println(c));
	
	
	
	
	}

}



class Customer {
	private String name;
	private int age;
	private int price;
	
	
	public Customer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	
	
	// Getter 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}



	// toString 오버라이딩 (alt + shift s > s)
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}



	
	
	
	
	
}