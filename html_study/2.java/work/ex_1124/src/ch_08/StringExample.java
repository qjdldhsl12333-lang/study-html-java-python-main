package ch_08;

import java.util.Arrays;

public class StringExample {
	public static void main(String[] args) {
		//문자열 값의 비교
		//서로 다른 String 객체의 내부 문자열만 비교하기 위해서는
		//equals()메서드를 사용한다.
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		//같은 문자열이 있으면 다른 변수도 같은 주소를 참조한다.
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 srtVar2는 참조하고 있는 주소가 같다.");
		}
		
		//각 변수에 들어있는 문자열 내용이 같은지 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 srtVar2는 문자열 값이 같다.");
		}
		
		//클래스 변수명; -> 참조 변수 (주소값을 주소값에 저장할수있다.)
		//new -> 메모리에 공간을 확보해준다.
		//클래스명() -> 생성자: 메모리에 객체를 생성해준다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		//new 생성자()로 만들면 무조건 heap 영역에 새로 객체를 생성한다.
		//ㄴ 객체마다 주소값이 다르다.
		
		//같은 문자열이 있으면 다른 변수도 같은 주소를 참조한다.
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 srtVar4는 참조하고 있는 주소가 같다.");
		} else {
			System.out.println("strVar3과 srtVar4는 참조하고 있는 주소가 다르다.");
		}
		//각 변수에 들어있는 문자열 내용이 같은지 비교
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 srtVar4는 문자열 값이 같다.");
		}
		
		// 문자 추출
		// 문자열에서 특정위치의 문자를 얻고 싶다면 charAt()메서드를 이용할 수 있다.
		// charAt(index);
		
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(3);
		System.out.println(charValue);
		
		//주민등록번호 
		//970225 -1230123; 뒷자리 첫글짜 1 성별
		String ssn ="9702251230123";
		char gender = ssn.charAt(6);
		switch(gender) {
		case '1': 
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		};
		
		//문자의 갯수 
		//length()
		//공백 포함 글자수를 반환한다.
		System.out.println("subject 문자열의 길이 : " + subject.length());
		
		//문자열 대체
		//replace(기존문자열,대체문자열)
		String oldStr ="자바프로그래밍";
		System.out.println(oldStr.replace("자바", "java"));
		System.out.println(oldStr);
		
		//불변의 법칙
		String s = "hello";
		String s2 = "hello";
		
		s = "hello, world";
		
		//같은 주소를 참조하고 있어도 값이 바뀔때 s2 값은 바뀌지 않는다.
		System.out.println(s2);
		System.out.println(s);
		
		//문자열 잘라내기
		//substring(시작인덱스,마지막인덱스)
		System.out.println(ssn.substring(0,6));
		
		//특정 문자열의 위치 찾기
		//indexof(문자열) 문자열의 시작되는 위치의 값을 나타낸다.
		System.out.println(subject.indexOf("그"));
		
		// 없는 값을 달라고 하면 -1을 반환한다.
		
		//문자열ㅇ르 구분자를 이용하여 여러개로 분리하는것
		//split(구분자)
		String board = "번호,제목,내용,성명";
		String[] arr = (board.split(","));
		//구분자로 문자들을 잘라서 배열의 요소로 넣는다.
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(String i : arr) {
			System.out.println(i);
		}
		
		
		
		
				
	}

}
