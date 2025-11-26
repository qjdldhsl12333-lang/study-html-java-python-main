package pakage1;

//A클래스의 접근 제한은 default 로 설정이되어있고
// 같은 패키지 내에서만 접근이 가능하다.
public class A {
	public int field1;
	int field2;
	private int field3;
	
	public void method1() {};
	void method2() {};
	private void method3() {};
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
	}
	
	public A(boolean b) {
		
	}
	A(int b){
		
	}
	
	 A(String s) {
		
	}
	
}
