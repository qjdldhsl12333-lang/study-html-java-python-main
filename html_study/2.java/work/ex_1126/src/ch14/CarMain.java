package ch14;

public class CarMain {
	public static void main(String[] args) {
	//기본생성자를 통해 객체 생성하기
	Car c1 = new Car();
	System.out.println("c1.company : " + c1.company);
	System.out.println("--------------------");
	//model 을 인자로 받는 생성자
	Car c2 = new Car("소나타");
	System.out.println("c2.company : " +c2.company);
	System.out.println("c2.company : " +c2.model);
	System.out.println("--------------------");
	//model 과 color 를 인자로 받는 생성자
	Car c3 = new Car ("아반떼","white");
	System.out.println("c3.company : " +c3.company);
	System.out.println("c3.company : " +c3.model);
	System.out.println("c3.company : " +c3.color);
	System.out.println("--------------------");
	//model 과 color 와 maxSpeed를 인자로 받는 생성자
	Car c4 = new Car ("펠리세이드","Black",200);
	System.out.println("c4.company : " +c4.company);
	System.out.println("c4.company : " +c4.model);
	System.out.println("c4.company : " +c4.color);
	System.out.println("c4.company : " +c4.maxSpeed);
	}
}

