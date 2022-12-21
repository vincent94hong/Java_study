package ch00_test;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		// 위의 add() 메서드를 이용한 코드는 library 라는 ArrayList 안에 정보를 담은것.
		// 아래는 Book 클래스 형의 book, book2 라는 변수를 생성하여 그에 클래스형에 맞게 생성자를 통해 정보를 담은것.
		
		// Book 클래스형의 book 참조형변수 생성하여 선언 및 초기화 > library 라는 ArrayList[0] 에 있는 값으로
		Book book1 = library.get(0);
		Book book2 = library.get(1);
		
		book1.showBookInfo();
		book2.showBookInfo();
		
		for(int i = 0; i < 2; i++) {
			
		}
		

	}

}
