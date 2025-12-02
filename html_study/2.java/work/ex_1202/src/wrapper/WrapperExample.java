package wrapper;

public class WrapperExample {
public static void main(String[] args) {
	//wrapper 타입 int > Intager   char > Character  long > Long 이런식으로 Wrapper 타입 클래스이다. 
	// 자동 포장이 일어난다.
	// 기본타입이 100 Integer 객체가 된다.
	Integer obj = 100;
	System.out.println("value : "+ obj.intValue());
	
	int value = obj;
	System.out.println("value : "+value);
	
	Integer obj2 = 300;
	Integer obj3 = 300;
	System.out.println(obj2 == obj3);//객체는 주소를 비교하기 때문에 false
	System.out.println(obj2.equals(obj3));//equals 로 값을 비교
}
}
