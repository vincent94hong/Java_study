package ch07_array_1019;

public class ArrayTest {

	public static void main(String[] args) {

		int[] number = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] str1 = new String[] { "vincent", "vincent2" };
		// Person[] persons = new Person[] {new Person(), new Person()};

		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
