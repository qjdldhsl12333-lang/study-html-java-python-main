package ch05;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		//if의 기본형
		//if(조건식){조건식이 참일 때 실행할 명령};
		//만약 실행햐야 하는 명령이 하나라면 중괄호를 생략할 수있다.
		//if(조건식) 조건식이 참일 때 실행할 명령;
		int score =93;
		if (score >= 90){
			 System.out.println("점수가 90보다 큽니다.");
			 System.out.println("등급은 A입니다..");
		}
		if (score <90) {
			System.out.println("점수가 90보다 작습니다.");
			 System.out.println("등급은 B입니다..");
		}
		
		//정수형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 만들기
		
		// int x = 20;
		
		// if (x > 10 && x < 20);
		// //정수형 변수 ch가 'x' 또는 'X' 일 때 true 인 조건식
		// if(ch == 'x' || ch == 'X');
		// //문자형 변수가 ch가 알파벳일때 true이 조건식
		// if ((ch>='a' && ch<='z') || (ch>='A' && <= 'Z'));
		
		//if else
		//if(조건식){
//		조건식이 참일 때 실행할 명령
//      } else {
//		조건식이 거짓일 때 실행할 명령
//		}
		
		//if(조건식) 조건식이 참일 때 실행할 명령
//		else 조건식이 거짓일 때 실행할 명령;
		//
		//if- eles if - else
		//비교해야 할게 여러개일때
//		  if(조건식1){
//			조건식1이 참일 때 실행할 명령
//	      } else if(조건식2) {
//			조건식1이 거짓이고 조건식2가 참 때 실행할 명령
//		  } else if(조건식3) {
//		    조건식1,2이 거짓이고 조건식3가 참 때 실행할 명령
//		  } else if(조건식4) {
//		    조건식1,2,3이 거짓이고 조건식4가 참 때 실행할 명령
//		  } else{
//			어느 조건도 맞지 않을 때 실행할 명령
//	      };
		
		 int a=3;
		 int b=4;
		 int c=5;
		 
		 int max = a;
		 
		 if(b > max) {
			 max = b;
		 }
		 if(c > max) {
			 max = c;
		 }
		 // 세 숫자를 비교해서 가장 큰값 출력
//		 if (a < b || b < c) {
//			 System.out.println("c가 가장큽니다");
//		 }
		 // 개수를 셀 때 ->개수를 담을 변수를 만들기
		 // 총합을 구할때 -> 총합을 담을 변수를 만들기
		 // 평균을 구할때 ->평균을 담을 변수를 만듦
		 //글자를 뒤집어라 ->뒤집은 글자를 담을 변수를 만듦
		 Scanner sc = new Scanner(System.in);
		 System.out.print("아이디 입력: ");
		 String id = sc.next();
		 System.out.print("비밀번호 입력: ");
		 String pw = sc.next();
		 //아이디가 admin이면서 비밀번호가 1234가 일치 할 때 "로그인성공"
		 //일치하지 않으면 "로그인 실패" 를 출력하기
		 if(id.equals("admin") && pw.equals("1234")) {
			  System.out.println("로그인 성공");
		 }else {
			  System.out.println("로그인 실패");
		 }
		 //내용물을 비교할 때는 equals()매서드를 사용하는것이 맞다.
		 
		 String str = new String("admin");
		 String str2 = new String("admin");
		 
		
		}
		
	

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               