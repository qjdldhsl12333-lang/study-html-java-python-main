package ch13;

public class Car {
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	public Car() {
		
	}
	//값을 받아서 필드에 넣는 생성자
	public Car(String model,String color, int maxSpeed) {
		this.model =model;
		this.color =color;
		this.maxSpeed =maxSpeed;
		//this 객체가 자기 자신을 표현하는 언어
	}

}
