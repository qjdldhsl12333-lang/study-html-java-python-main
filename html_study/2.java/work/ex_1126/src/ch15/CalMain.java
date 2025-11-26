package ch15;

public class CalMain {
public static void main(String[] args) {
	//클래스에 속해있는 함수는 독립적으로 실행할 수 없다.
	//스캐너나 랜덤 같은 경우를 생각하기
	// 객체를 생성하고 객체를 통해서 호출해야한다.
	Calculator calc1 = new Calculator();
	
	calc1.powerOn();
	calc1.powerOff();
	
	//plus 메서드를 호출하여 5와 6을 인자로 전달하고 
	// 덧셈 결과를 result1 변수에 대입하기
	int result1 =calc1.plus(5, 6) ; 
	System.out.println("result1 = "+result1);
	//divide 메서드를 호출하여 11과 5 인자로 전달하고
	// 나눗셈 결과를 result2변수에 대입하기
	double result2 = calc1.divide(result1, 5);
	System.out.println(result2);
	}
}
