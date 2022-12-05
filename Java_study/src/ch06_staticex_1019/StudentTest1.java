package ch06_staticex_1019;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student2 hshStudent6 = new Student2();
		System.out.println(Student2.getSerialNum());
		
		//Student1 클래스로 객체를 생성해서, 자동으로 학번이 어떻게 부여되는지 확인.
		Student1 hshStudent3 = new Student1();
		System.out.println("hshStudent3의 학번 : " + hshStudent3.studentID);

		Student1 hshStudent4 = new Student1();
		System.out.println("hshStudent4의 학번 : " + hshStudent4.studentID);

		Student1 hshStudent5 = new Student1();
		System.out.println("hshStudent5의 학번 : " + hshStudent5.studentID);
		
		// static 키워드에 접근하는 방법.
		// 인스턴스 (객체를) 생성해서 접근. (비추)
		// 해당 클래스명으로 접근.
		Student hshStudent = new Student();
		hshStudent.setStudentName("홍성훈");
		System.out.println(hshStudent.serialNum);
		System.out.println(Student.serialNum);
		hshStudent.serialNum++;
		System.out.println(hshStudent.serialNum);
		System.out.println(Student.serialNum);
		
		System.out.println("hshStudent2 의 정보");
		Student hshStudent2 = new Student();
		System.out.println(hshStudent2.serialNum);

//		Student studentLee = new Student();
//		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // 초깃값 출력
//		studentLee.serialNum++;					// static 변수 증가
//		System.out.println("현재 값 : " + studentLee.serialNum);
//		
//		Student studentSon = new Student();
//		studentSon.setStudentName("손수경");
//		studentSon.serialNum++;	
//		System.out.println("한번더 클래스 변수 값 증가하기. ");
//		System.out.println("studentSon 의 값" + studentSon.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee.serialNum); // 증가된 값 출력
//		System.out.println("studentLee 의 값" + studentLee);
//		System.out.println("studentSon 의 값" + studentSon);
	}
}
