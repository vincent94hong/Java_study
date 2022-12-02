package ch05_test_1018;

public class Animal {
	String name; // 동물 이름.
	int age; // 동물 나이.
	// ex) private String name : 보안을 위해 접근을 제한.
	// ex) private int age : 보안을 위해 접근을 제한.

	// 리턴값 없는 메서드 만들기.
	// 이름과 나이만 출력하는 메서드.

	public void showInfo() {
		System.out.println("동물이름 : " + name + ", 나이 : " + age);
	}
}
