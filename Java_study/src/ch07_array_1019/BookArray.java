package ch07_array_1019;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0] = new Book();
		library[1] = new Book("이상용북", "이상용작가");
		
		System.out.println(library[0] //get
				);
		System.out.println(library[1]);
		for(int i=0; i<library.length; i++){
			System.out.println(library[i]);
		}
	}
}
