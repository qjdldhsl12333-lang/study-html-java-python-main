package ch16;

import ch16.Student;

public class StudentMain {
public static void main(String[] args) {
	
	Student st = new Student("홍길동",95,85,90);
	
	System.out.println("이름 :" + st.name);
	System.out.println("총점 :" + st.getTotal);
	System.out.println("평균 :" + st.getAverage);
	System.out.println("학점 :" + st.getGrade);
}
}
