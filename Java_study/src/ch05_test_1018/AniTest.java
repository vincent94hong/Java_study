package ch05_test_1018;

public class AniTest {

	public static void main(String[] args) {
		// 객체를 생성.
		// 클래스명 참조형_변수 = new 클래스의 기본 생성자();
		Animal dog = new Animal();
		// dog 라는 이름(참조형)의 변수를 선언.
		// 객체를 생성했음.

		// 강아지의 이름, 나이 설정.
		dog.name = "강아지";
		dog.age = 1;
		System.out.println("dog의 주소값 :" + dog);
		System.out.println(dog);
		System.out.println(dog.name);
		System.out.println(dog.age);
		// 기본 메서드 하나 출력.
		
		
		Animal cat = new Animal();
		cat.name = "고양이";
		cat.age = 2;
		System.out.println("cat의 주소값 :" + cat);
		System.out.println(cat);
		System.out.println(cat.name);
		System.out.println(cat.age);
		
		dog.showInfo();
		cat.showInfo();
	}

}
