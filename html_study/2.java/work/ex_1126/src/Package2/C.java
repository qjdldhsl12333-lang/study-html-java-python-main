package Package2;

import pakage1.*;

public class C {
	
//	A a; // A클래스의 접근 제한이 default  이기 때문에 안된다.
	B b; //       public 이라 된다.
	
	A a1 = new A(true);
//	A a2 = new A(1); //생성자가 defult 라 다른 페키지에 있어 안됨
//	A a3 = new A("문자열"); //생성자가 private 라 안됨
}
