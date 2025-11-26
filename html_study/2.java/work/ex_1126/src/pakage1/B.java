package pakage1;

//B클래스는 public 이기 때문에 다른 패키지에서도 접근이 가능.
public class B {
	//같은 패키지에 있기 때문에 A클래스의 객체를 생성할 수 있다.
	A a  = new A();
	
	//일반 실행문은 메서드/ 생성자 안에서 쓸 수 있다.
	public B() {
		a.field1 = 2;
		a.field2 = 2;
		
//		a.field3; private 라 안됨
		
		a.method1();
		a.method2();
//		a.method3(); 역시 private라 안됨 +
	}
	
	
	A a1 = new A(true);
	A a2 = new A(1);
//A a3 = new A("문자열"); 
//	생성자가 Private 접근 제한이기 때문에 다른 클래스에서
	// 사용할수가 없다.
	
}
