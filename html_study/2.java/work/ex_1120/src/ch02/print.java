package ch02;

public class print {
	public static void main(String[] args) {
		//데이터의 출력 
		//System 클래스
		System.out.println("Welcome"); //출력을 한 뒤 줄바꿈
		System.out.print("Java World\n"); //내용을 출력
		//printf()
		//값의 자료형에 따라 서식 문자를 이용해 문자열 속에서 데이터를 출력 할수 있다.
		//%d : 정수의 서식문자 (10진수)
		//%o : 8진수
		//%x : 16진수
		//%f : 실수
		//%s : 문자열
		//%c : 문자
		//%b : 논리형
		
		String name ="홍길동";
		int age =  30;
		String address = "인천시 부평구";
		double height = 184.8 ;
		
		System.out.printf("제 이름은 %S입니다.\n", name);
		System.out.printf("제 나이는 %d입니다.\n",age);
		System.out.printf("제가 사는 곳은 %S입니다.\n",address);
		System.out.printf("제 키는 %.1fcm입니다.\n",height); // 소수점 몇자리까지 볼꺼냐? %.숫자f
		
		int x= 10 + 5;
		int y = 5;
		//10과 5의 합은 15입니다.
		System.out.printf("%d과 %d의 합은 %d입니다.",x,y,x+y); // 왼쪽 부터 차례대로 반영된다..
		
		//System.out.printf("10과 5의 합은 15입니다.");// 이건 하드코딩이라고함 값이 변하지않아요
		
		
		
	}
}
