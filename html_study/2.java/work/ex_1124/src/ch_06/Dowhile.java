package ch_06;
import java.util.Scanner;
public class Dowhile {
	public static void main(String[] args) {
		//조건에 맞지 않아도 한번을 실행하는 반복문
		//do{
		//반복하고자 하는 명령
		//}while(조건식)
		
		int i = 10;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		//국어,영어, 수학 점수를 입력받는다.
		//세 과목중 하나라도 40점 미만이면 다시 입력 받는 do-while문 작성하기
		Scanner sc = new Scanner(System.in);
		int kor,eng,math;
		int result = 40;
		
		do {
			System.out.println("국어 점수 : ");
			kor =sc.nextInt();
			System.out.println("영어 점수 : ");
			eng =sc.nextInt();
			System.out.println("수학 점수 : ");
			math =sc.nextInt();
			
			
		}
		while(result > kor || result > eng || result > math);
		
		
		
		
		
	}
}
