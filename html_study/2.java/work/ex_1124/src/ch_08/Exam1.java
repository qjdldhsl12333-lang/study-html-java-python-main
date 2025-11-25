package ch_08;
import java.util.Scanner;
public class Exam1 {
	public static void main(String[] args) {
		//문자의 개수 세기
		//키보드에서 한글,영문을 무작위로 입력받는다.
		//입력받은 문자열에서 소문자 a 의 개수를 구하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String word =sc.next();
		int count =0;
		//length(): 문자열의 길이를 반환
		for(int i = 0;i < word.length(); i++) {
			// charAt(index): 문자열에서 해당 인덱스에 해당하는 '문자'를 반환
			char ch =word.charAt(i);
			if(ch == 'a') {
				count++;
			}
		}
	System.out.println("a의 갯수 : " + count);
	
	//문자열을 입력받아서 한글자씩 뒤집어서 출력해주세요
	
	System.out.print("문자열 입력 : ");
	String original =sc.next();
	String reversed ="";
	for(int i = original.length() -1; i>=0; i--){
		reversed += original.charAt(i);
		
		System.out.println(original);
		System.out.println(reversed);
	}
	//키보드에서 이메일을 입력받고 아이디부분만 추출하기
		System.out.print("이메일을 입력하세요 : ");
		String email =sc.next();
	//아이디는 몇글자 일지는 모르겠으나 '@'의 위치를 찾아서 그 앞까지 자르면
		//indexOf("문자열"): 해당문자열의 인덱스값을 반환
		//substring(offset,endindex) :시작인덱스부터,endindex전까지 자른다. 
		String id =email.substring(0,email.indexOf("@"));
		System.out.println(id);
	}
}


