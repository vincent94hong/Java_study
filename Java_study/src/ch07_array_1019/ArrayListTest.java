package ch07_array_1019;
// 1207 4교시 수업

import java.util.ArrayList;

import ch05_test_1018.Student;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student("조정래"));
		students.add(new Student("헤르만 헤세"));
		students.add(new Student("조정래"));

		for (int i = 0; i < students.size(); i++) {

			Student student = students.get(i);
			student.showInfo();
		}

		System.out.println();
		System.out.println("=== 향상된 for 문 사용 ===");
		for (Student student : students) {
			student.showInfo();
		}

//		ArrayList<Book> library = new ArrayList<Book>();
//		
//		library.add( new Book("�¹���", "������") );
//		library.add( new Book("���̾�", "�츣�� �켼") );
//		library.add( new Book("��� �� ���ΰ�", "���ù�") );
//		library.add( new Book("����", "�ڰ渮") );
//		library.add( new Book("�����", "�������丮") );
//		
//		for(int i=0; i<library.size(); i++){
//	
//			Book book = library.get(i);
//			book.showBookInfo();
//		}
//		
//		System.out.println();
//		System.out.println("=== ���� for�� ��� ===");
//		for(Book book : library){
//			book.showBookInfo();
//		}
	}
}
