package ch06_staticex_1019;

public class Student {
	
	//static 이라는 키워드를 사용해서, 전역변수로 사용, 정적 변수, 다르게 표현 리소스라고 합니다.
	public static int serialNum = 1000;
	
	// 인스턴스 변수 >> 객체를 생성해서 접근. (none static 변수라고 함.)
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//해당메서드의 리턴 타입이 : string
	//활용한다면,
	//ex1. Student lsy = new Student();
	//ex2. String s1 = lsy.getStudentName();
	public String getStudentName(){
		return studentName;
	}
	
	
	//활용?
	//Person p1 = getPersonInfo();
	//Person p2 = new Person();
	public void setStudentName(String name){
		studentName = name;
		// = this.studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
