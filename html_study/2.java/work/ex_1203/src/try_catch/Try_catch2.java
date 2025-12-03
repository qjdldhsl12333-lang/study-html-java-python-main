package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.println("몇 번 카드를 뽑을꺼야?");
			
			int cardIndex =sc.nextInt();
			System.out.println("뽑은 번호는 : " + cards[cardIndex]);
			//여러개의 catch구문을 작성하여 특정 예외마다 처리를 달리 할 수있다.
		} catch (InputMismatchException e) {
			System.out.println("숫자만 됨 ㅋ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("그런 카드는 없어 돌아가");
			
		}
		
		System.out.println("빠이 ㅎ");
	}

}
