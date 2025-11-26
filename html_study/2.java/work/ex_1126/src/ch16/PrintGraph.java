package ch16;

import java.util.Random;

public class PrintGraph {
	//0~9사이의 난수를 100개 저장하는 배열을 만들고,
	//해당 배열이 가지고 있는 0 ~9사이의 난수가 몇개씩 있는지 판별하고
	//그래프화 한다.
	//print 메서드를 만들어서 작업한다.
	public static void print() {
		int[] arr = new int[100];
		int[] count =new int[10]; 
		
		Random random =new Random();
		
		String numbers = " ";
		for(int i =0; i <arr.length; i++) {
			arr[i] =random.nextInt(10);
			count[arr[i]]++;
			numbers += arr[i];
			
		}
		for(int i =0; i < count.length; i++) {
			System.out.println(" 의 갯수 : "+i);
			for(int j= 0; j < count[i]; j++) {
				System.out.print("#");
			}
			 System.out.print(" " + count[i]); 
		}
	}
	

	
//	결과:
//		0507...... //난수 100개
//		0의 갯수 : ############ 12
//		1의 갯수 : ######### 9
//		2의 갯수 : ########### 11
//		3의 갯수 : ######## 8
//		4의 갯수 : ############## 14
//		5의 갯수 : ####### 7
//		6의 갯수 : ######### 9
//		7의 갯수 : ############# 13
//		8의 갯수 : ####### 7
//		9의 갯수 : ########## 10
}
