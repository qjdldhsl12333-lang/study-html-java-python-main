package ch_07;

import java.util.Random;
import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		//break
		//반복문을 의도적으로 종료할 때 사용하는 키워드
		
//		int rand = new Random().nextInt(10)+1;
		//밖에 넣었으면 while문 안에 들어와있지 않아서 
		//if의 영향을 받지않아서 값이 바뀌지 않는다.
		//한가지 숫자로 무한루프
		
//		while(true) {
//			int rand = new Random().nextInt(10)+1;
//			System.out.println(rand);
//			if(rand ==6) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//		
		//난수 생성해서 맞추는 up,down 퀴즈 프로그램
		//기회를 10번만 주기
		
		//1. 1~50 사이의 난수 생성
		//2. for 문을 이용해서 up,down 퀴즈프로그램 만들기
		// 정답이 난수보다 크면 down 출력
		// 정답이 난수보다 작으면 up 출력
		// 정답을 맞추면 반복문 종료
		// 기회는 10번 (10번이내에 맞추면 더이상 반복을 수행하지 않고 종료)
//		Scanner sc = new Scanner(System.in);
//		
//		int random = new Random().nextInt(50)+1;
//		
//		//정답을 맞췄는지에대한 변수;
//		
//		//1 for 문으로 10번만 돌리기
//		
//		boolean isMatched = false;
//		for(int i= 0; i < 10; i++) {
//			System.out.println("정답 : ");
//			int guess =sc.nextInt();
//			
//			//정답을 맞췄을 때
//			if (guess == random) {
//				System.out.println((i+1)+ "번째에 맞췄습니다");
//				isMatched = true;
//				break;
//			}else if (guess > random) {
//				System.out.println("down");
//			}else if (guess < random) {
//				System.out.println("down");
//		}
//	}
//	if(!isMatched) {
//		System.out.println("정답을 맞추지 못했습니다");
//	}
		//중첩 반복문에서 break;
		//break문은 가까운 반복문을 종료하고 outer 반복문은 종료시키지 않는다.
		// 중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 outer 반복문에 라벨을 붙이고
		//break쪽에도 라벨을 단다.
		
		Outter:for(char upper = 'A'; upper <='Z'; upper++) {
			for (char lower= 'a'; lower <='z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g')
					break Outter;
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}

	
