package ch02;

//import 
//다른 패키지에 있는 클래스를 불러올때 사용
//자바에서 다른 클래스를 사용하려면 같은 패키지 안에 있거나 import를 해야 한다.

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
	//데이터의 입력
	//키보드르 통해 다양한 데이터를 다양하게 입력할 수 있다.
	//키보드를 통해 입력하는 데이터를 얻기 위해서는 'java.util'패키지에 있는
	//Scanner 클래스를 이용해야 한다.
	
	//Scanner 클래스의 객체를 만들어야 한다.
	//클래스 안에 있는 기능들을 써야하기위함
		
	//객체를 만드는 방법
	//let 변수명 = new Objact(); - js
	//클래스명 변수명 = new 클래스명(); -- heap에 속함----ㄱ
		//     l      ㅣ ㄴ  생성자.객체를 만듬    -> (주소)를 받음 주소는 = 변수 
		//     l      ㄴ메모리 영역에 공간을 주십쇼 					   ㅣ
		//    ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅣ
		Scanner sc = new Scanner (System.in); //System.out.println(sc); 객체를 불러보면 결과값이 보임 외울필요는 없지만 알아둠
		
		String name,address;
		int age;
		double weight;
		
		System.out.print("이름 : ");
		name =sc.next();
		System.out.println(name);
		System.out.print("나이 : ");
	    age =sc.nextInt();
	    System.out.println(age);
	    
	    
	    
	}	
}
