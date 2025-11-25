package ch12;

public class CarExample {
	public static void main(String[] args) {
		//자동차 객체 생성하기
		// 변수명 c1
		Car c1 = new Car();
		
		//클래스에 포함된 필드들을 출력하기
		c1.model ="소나타";
		c1.start =false;
		c1.speed =60;
		c1.color ="white";
		System.out.println(c1.model);
		System.out.println(c1.start);
		System.out.println(c1.speed);
		System.out.println(c1.color);
		System.out.printf("차종= %s 출발= %b 속력= %d km/h 색상 = %s\n",c1.model,c1.start,c1.speed,c1.color);
		
		
		//자동차 객체 c2 만들기
		//c2의 필드값 출력하기
		Car c2 = new Car();
		c2.model = "아반떼";
		c2.start = true;
		c2.speed = 80;
		c2.color = "black";
		System.out.println(c2.model);
		System.out.println(c2.start);
		System.out.println(c2.speed);
		System.out.println(c2.color);
		System.out.printf("차종= %s 출발= %b 속력= %d km/h 색상 = %s\n",c2.model,c2.start,c2.speed,c2.color);
		
	}

}
