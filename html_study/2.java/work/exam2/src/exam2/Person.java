package exam2;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
		name ="홍길동";
		age = 20;
		
	}
	public void introduce() {
		System.out.println("안녕하세요, 저는" + name + "이고 "+age+"살 입니다");

	}
}
