package exam;

public class Main {
	public static void main(String[] args) {
		//1번문제
		Student student = new Student();
		student.printInfo();
		System.out.println();
		//2번문제
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 4));
		System.out.println(calc.subtract(6, 3));
		System.out.println(calc.multiply(5, 6));
		System.out.println(calc.divide(6, 3));
		//6번 문제 
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();

	}

}
