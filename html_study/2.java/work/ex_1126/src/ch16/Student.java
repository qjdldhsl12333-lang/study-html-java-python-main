package ch16;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	
	
	public Student(String name, int kor, int eng, int math) {
		this.name= name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}

	public int getTotal(int kor , int eng ,int math) {
		return kor + eng + math;
	}
	
	public double getAverage() {
		return  getTotal(kor, eng, math)/3.0;
	}	
	public char getGrade() {
		double avg = getAverage();
		if()
		
	}

}
