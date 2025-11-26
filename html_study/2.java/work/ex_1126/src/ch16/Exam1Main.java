package ch16;

import Time.TimeTable;

public class Exam1Main {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	//다른 클래스에 있는 메서드를 사용하려면 해당 클래스의 객체를 
	//만들어야한다.
	
	//자바에서 변수를 만들 때 넣으려는 데이터의 타입을 명시
	
	//객체 생성 방법
	// 클래스명 변수명 = new 클래스명();
	Exam1 exam =new Exam1(); //내가 만든 클래스 밑이랑 같은개념
	
	exam.maxFinder(arr);
	System.out.println(exam.maxFinder(arr));
	//클래스명 변수명;
	//변수명 = new 클래스명()
	String str = new String("문자열"); //자바가 만든 클래스
	
	System.out.println(exam.circleArea(3));
	exam.circleRound(3);
	exam.fToc();
	System.out.println(exam.calc(5, 2, "*"));
	
	TimeTable tt= new TimeTable();
	tt.showTable(5);
	
	}
}
