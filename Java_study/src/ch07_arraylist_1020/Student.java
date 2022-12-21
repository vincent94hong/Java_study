package ch07_arraylist_1020;

import java.util.ArrayList;

public class Student {

	// 인스턴스 변수
	int studentID;
	String studentName;
	String menu;

	// 제너릭으로 유효성 검사처럼, 데이터 형이 , Subject이라는 형으로만
	// 들어 갈수 있다. 이 ArrayList 의 원소 타입.
	// Subject 타입의 참조형 변수(인스턴스)
	ArrayList<Subject> subjectList;
	ArrayList<LunchMenu> lunchList;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
		lunchList = new ArrayList<LunchMenu>();
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();

		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}

	public void addLunchMenu(String menu, int price, String description) {
		LunchMenu lunchMenu = new LunchMenu();

		lunchMenu.setMenu(menu);
		lunchMenu.setPrice(price);
		lunchMenu.setDescription(description);
		lunchList.add(lunchMenu);
	}
	
	public void showStudentInfo() {
		int total = 0;

		for (Subject s : subjectList) {

			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		}

		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");

		for (LunchMenu menu : lunchMenu) {

			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + menu.getDescripiton() + "입니다.");
		}

	}
}
}
