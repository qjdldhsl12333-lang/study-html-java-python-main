package exam2;

public class Student extends Person {
	String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public Student() {
		major ="컴퓨터공학";
	}
	
	@Override
	public void introduce() {
		System.out.println("안녕하세요, 저는 " + name + " 이고 "+age+"살 입니다. "+ "전공은 " + major +" 입니다." );

	}
	
}
