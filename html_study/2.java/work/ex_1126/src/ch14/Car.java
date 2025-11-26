package ch14;

public class Car {
	//필드선언(맴버변수)
	String company = "현대자동차";
	String model;
	String color;
	String price;
	int maxSpeed;
	//기본생성자 선언하기
	public Car() {
		}
	//생성자 오버로딩
	public Car (String model) {
		this.model = model;
		}
	public Car(String model, String color) {
		this(model); // 위의 생성자를 호출
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this(model,color);
		this.maxSpeed = maxSpeed;
		}
	//this() : 같은 클래스내의 다른 생성자를 호출
	//기본생성자 오버로딩했을때 아래와 같이 먼저 같은 
	//str,str 을 만들었을때 같은 오버로딩을 만들수없다. 
	// Car(String model, String color) { ... }
	//Car(String color, String model) { ... } //오버로딩이 아님 컴파일 에러 발생

}
