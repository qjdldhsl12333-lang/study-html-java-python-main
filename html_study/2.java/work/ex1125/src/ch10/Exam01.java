package ch10;

import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		//단일 문자 배열에 단어와 숫자를 섞어 넣는다.
//	      char[] cards = {'1','L','O','2','V','3','E'};
//	      String myWord = "";
//	      
//	      //알파벳만 추출해서 myWord넣고 출력하기
//	      
//	      //반복문 이용해서 순회하세요
//	      
//	      for(int i = 0; i < cards.length; i++) {
//	    	// 요소가 알파벳인지 판별하세요
//	    	  if((cards[i]>= 'a' && cards[i] <='z')||(cards[i]>= 'A' && cards[i] <='Z')) {
//	    		// 알파벳이면 myWord에 넣으세요
//	    		  myWord += cards[i];
//	    	  }
//	    	  
//	      }
//	      System.out.println(myWord);
	      //키보드에서 배열의 길이를 입력 받는다.
	      //입력 받은 배열의 길이 만큼 알파벳을 요소로 넣고 출력해주세요
	      //예시
	      // 배열의 길이를 정해주세요 :5
	      // ABCDE // 아스키코드를 이용 65=A
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("배열의 길이 : ");
//	      int length = sc.nextInt();
//	      
//	      char[] alphabets = new char[length];
//	      
//	      char asci = 65;
//	      
//	      for(int i = 0 ; i< length; i++) {
//	    	  alphabets[i] = (char) (asci + i);
//	    	  alphabets[i] = asci++;
//	    	  
//	      }
//	      System.out.println(Arrays.toString(alphabets));
//	      
//	      System.out.println("결과 : ");
//	      for(char alphabet : alphabets) {
//	    	  System.out.print(alphabet);
//	      
	      
	      
	      //ex)3450,2100,60
	      
	      
	      
	      // 가능한 적은 수의 동전을 사용한다.
//	      int [] coin = {500,100,50,10};
//	   // 변수 money에 10~ 5000 사이의 난수를 발생시켜 넣는다.
//	      int money = (new Random().nextInt(500)+1)*10;
//	   // 단 1의 자리는 반드시 0이 되도록 한다.
//	      int price = 0; 
//	      
//	      System.out.println("금액" + money);
//	      
//	      for(int i = 0; i < coin.length; i++) {
//	    	 //발생된 난수 money 를 동전으로 바꾸면 각 동전이 몇개씩 필요한지 출력
//	    	  price =money/coin[i];
//	    	  System.out.printf("코인은 %d개 필요합니다\n",price);
//	    	 money %= coin[i];
//	      }
//	      
//	      //배열의 모든 요소의 합 구하기;
//	      int[][] arr = {
//	    		  {1,2,3},
//	    		  {4,5,6,7,8},
//	    		  {9},
//	    		  {10,11,12,13},
//	    		  {14,15},
//	    		  {16,17,18,19,20}
//	      };
//	      int sum =0;
//	      for(int i = 0; i < arr.length; i++) {
//	    	  for(int j= 0; j < arr[i].length; j++) {
//	    		  sum += arr [i][j];
//	    	  }
//	      }
//	      System.out.println("총합 : " + sum);
	      
	      //1~45사이의 난수를 발생시켜 로또 번호 6개를 배열에 저장 하는 프로그램 만들기
	      //겹치는것은 들어가면 안됨
	      int [] lotto = new int[6];
	      
	      outer:for (int i = 0; i < lotto.length;) {
	    	  lotto[i] = new Random().nextInt(45)+1;
	    		   //겹치는게 있는지 없는지 검증
	    	  		for(int j = 0; j<i; j++) {
	    	  			if(lotto[i] == lotto[j]) {
	    	  				continue outer;
	    	  			}
	    	  		}
	    	  		System.out.println(lotto[i] +" ");
	    		   i++;
	    	  

	  }      
	      
	      
	      
	      
	      }
	}


