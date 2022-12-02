package ch05_test2_1202;

public class PersonTest {

	public static void main(String[] args) {
		// 기본 생성자 호출.
		Person vincent = new Person();
		// 데이터에 직접 접근할 것인가?
//		vincent.name = "홍성훈";
		// set(메서드)을 이용해서 name 값 설정하기/
		vincent.setName("홍성훈 setters");
		vincent.weight = 75F;
		vincent.height = 181F;
		vincent.showInfo();
		
		// get 메서드를 이용해서 접근 할 것인가?
		System.out.println("get 메서드로 이름호출 : "
				+ vincent.getName());

		// 매개변수가 1개인 생성자를 호출.
		Person vincent2 = new Person("홍성훈");
		vincent2.weight = 75F;
		vincent2.height = 181F;
		vincent2.showInfo();

		// 매개변수가 3개인 생성자를 호출.
		Person vincent3 = new Person("홍성훈", 75F, 181F);
		vincent3.showInfo();

	}
}
