package collection;

import java.util.ArrayList;
import java.util.Random;

public class Exam1 {
	public static void main(String[] args) {
		//정수타입의 ArrayList를 생성합니다
		//1~30 사이의 난수를 10개넣는다.
		
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			int temp =(int)(Math.random()*30)+1;
			list.add(temp);
		}
		//그중에 짝수만 출력하기
		System.out.println("짝수 : ");
		for(int i =0; i<list.size();i++) {
			int value =list.get(i);
			if(value %2 ==0) {
				System.out.print(value + " ");
			}
		}
	}

}
