package exam;

public class Student {
	
	//1번문제
	//필드 생성
	String name;
	int age;
	String major;
	public Student(String name, int age, String major ) {
		this.name =name;
		this.age =age;
		this.major =major;
	}
	public Student() {
		name ="홍길동";
		age = 20;
		major = "컴퓨터공학";
		
	}

		
		public void printInfo() {
			System.out.println("이름 : " + name + " 나이 : "+ age + " 전공 : " + major );
		}

}
