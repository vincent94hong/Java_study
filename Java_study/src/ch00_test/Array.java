package ch00_test;

public class Array {

	public static void main(String[] args) {
		int i;
		
		String[] arr = new String[5];
		
		// array 배열의 중간값에만 값을 넣을 수 있는지 체크.
		arr[2] = "vincent" ;
		
		for(i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
