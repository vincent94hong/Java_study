package ch08_inheritance_1020;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===============================");

		// VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

		// lsy. 으로는 Customer 입장이기 떄문에, VIPCustomer 에 대한 것을 볼 수 없다.
		// 정리하자면, 다형성에서 부모 클래스형으로 받으면 바라보는 관점은 부모 클래스형으로 보인다.
		// 확인 lsy. 찍어보면 부모 클래스만 보입니다.
		Customer lsy = new VIPCustomer();
		// 원래의 자식 클래스 형으로 변환 다운 캐스팅
		// 명시적 형변환을 했을때, 이것을 받을 형은 원래 자식 클래스 형입니다.
		// lsy7. 찍어보면, 자식 클래스와 부모 클래스가 전부 다 보입니다.
		// 상속은 그래서, 자식보다는 부모가 먼저 초기화가 반드시 되므로,
		// 1타 2피로 사용 가능합니다.
		VIPCustomer lsy7 = (VIPCustomer) lsy;

		// VIPCustomer lsy = new VIPCustomer(); 이 일반적이지만, VIPCustomer 의 상위 클래스에 Customer
		// 가 있기 때문에, 이와같이 가능.
		VIPCustomer lsy2 = new VIPCustomer();
		Object lsy3 = new VIPCustomer();
		Object lsy4 = new Customer();
		// Object 클래스는 클래스 최상위라서 뭐든 가능.

	}
}
