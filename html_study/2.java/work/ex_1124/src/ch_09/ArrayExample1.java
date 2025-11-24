package ch_09;

public class ArrayExample1 {
	public static void main(String[] args) {
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//배열의 요소에 점근하는법
		//변수명[index]> 변수처럼 사용하자!!
		//season[0] >"Spring"이 들어있음
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		//인덱스 1번의 요소의 값을 변경
		//"여름"
		System.out.println(season[1].replace("Summer","여름"));
		season[1] ="여름";
		System.out.println(season[1]);
		
		int[] scores = {83,90,87};
		//총합 평균구하기
		int sum = (scores[0] + scores[1] + scores[2]);
		sum = 0;
		System.out.println(sum);
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		int[] arr = { 7, 14, 23, 38, 41, 56, 63, 72, 89, 100 };
		int even = 0;
		int odd = 0;
		for(int i = 0; i < arr.length ; i++) {
			if (arr[i] % 2==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("짝수의 갯수 : " + even);
		System.out.println("홀수의 갯수 : " + odd);
	}

}
