package ch_09;

import java.util.Random;

public class ArrayExamlpe2 {
	public static void main(String[] args) {
		//길이가 3인 비어있는 정수형 배열을 생성
		int[] arr =new int[3];
		
		System.out.println(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i,arr[i]);
		}
		String[] sArr = new String[3];
		for(int i =0; i<arr.length; i++){
			System.out.printf("sArr[%d] : %s\n",i,sArr[i]);
		}
		// 배열의 길이
		// 배열을 생성했을 때 대괄호 안에 배열의 길이를 작성했다.
		// 배열은 내부적으로 length 라는 변수를 지니는데, 해단 변수는 배열의
		//길이 값을 가지고 있다.
		//배열의 길이를 알고싶을 때는 배열명 .length를 하면된다.
		
		//길이 10의 정수형 배열을 만든다.
		int[] numbers =new int[10];
		//변수이름은 numbers
		int sum = 0;
		// 배열은 10개의 난수를 집어넣는다.(1~30)
		for(int i =0 ; i < numbers.length; i++) {
		  numbers[i] = new Random().nextInt(30)+1;
		//배열 안에서 모든 짝수의 합 구하기
		  if(numbers[i]% 2==0) {
			  sum+= numbers[i];
		  }
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]+" ");
	}
	System.out.println();
	System.out.println(sum);
	
	//정렬 
	// 배열값이 순서 없이 저장되는 경우 배열의 값을 오름차순으로 정렬해주세요
	int[] arr2 = {1,6,2,10,5,8,4,3,9,7};

	int asc = 0;
	
	for(int i = arr2.length; i >0; i--) {
		for(int j =)
	}
	 
	
	
	}

}
