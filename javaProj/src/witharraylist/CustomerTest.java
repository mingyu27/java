package witharraylist;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer형 객체배열 만들기!
		ArrayList<Customer> customerList = new ArrayList<Customer>();	
		
		
		//Customer형 인스턴스 형성
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		//객체배열에 인스턴스 추가하기
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		//고객정보출력
		System.out.println("===== 고객정보 출력 =====");
		for(Customer customer : customerList) {						//향상된 for문, for(대입되는것(이전에 선언하지 x), 복사할배열)
			System.out.println(customer.showCustomerInfo());		//Customer형 customer에 순서대로 대입하면서, info출력할예정
		}
		
		//할인율, 포인트 계산
		System.out.println("==== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for(Customer customer : customerList) {						//customerList의 customer들을 대입해서, 배열수만큼 반복하는셈
			int cost = customer.calcPrice(price);					//복사받은 customer형 객체들의 calcPrice메서드 > 각class의 calcPrice로 호출됨
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현제 포인트는 " + customer.bonusPoint + "점입니다.");
		}
		
	

	}

}
