package ch16;

public class Person {
	static final String NAME ; // final 은 한번 넣으면 끝 절대 못바꿈 
	//바꾸고 싶으면 final 을 빼라
	static final int AGE;
	
	static { 
		// static 과 관련된 것들을 초기화 해줄수있는 블록
		// 복잡한 로직을 처리할 때 사용된다.
		//클래스가 처음 메모리에 올라갈때 딱 한번 실행되는 초기화 구간.
		//클래스 단위로 한 번만 해야 하는 작업을 넣는곳 
		NAME = "홍길동";
		AGE = 20;
		
	}

}
