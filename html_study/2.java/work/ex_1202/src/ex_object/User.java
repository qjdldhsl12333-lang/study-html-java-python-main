package ex_object;

public record User(String name, int age) {
	//메서드를 추가하는것도 가능하다.
	public void print() {
		System.out.println("이름 : "+ name +", 나이 : " + age);
	}
	
}


//레코드를 만들게 되면 컴파일러가 자동으로 코드를 만들어 준다.
//1. 매개 변수에 있는 것들을 private final 필드로 만들어준다.
//2. 매개 변수를 받는 생성자를 만들어준다.
//3. getter 를 만들어준다.
//4. equals, hashCode , toString 메서드를 오버라이딩한다.

//레코드는 불변 객체라서 setter 도 필요 없고, 어차피 필드도 모두 final 이라서
// 변경이 불가능하다.