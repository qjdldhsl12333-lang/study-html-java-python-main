package ch16;

public class CalcullatorMain {
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			
			// 길이가 4인 정사각형의 넓이를 구하여 출력하기
			double res1 = calc.areaRectangle(4);
			System.out.println("정사각형의 넓이 : "+res1); 
			// 가로가 5, 세로가 10인 직사각형의 넓이를 구하여 출력하기
			double res2 =calc.areaRectangle(5, 10);
			System.out.println("직사각형의 넓이 : "+res2);
			//정적필드는 객체를 통하지 않아도 호출이 되지만 객체를 통해서도 호출이된다.
			System.out.println(Calculator.pi);
			System.out.println(calc.pi);
			
			Calculator.plus(10,5);
		}
}
