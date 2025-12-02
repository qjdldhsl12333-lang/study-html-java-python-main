package generic;

public class DataMain {
	public static void main(String[] args) {
		//객체를 만드는 시점에 타입을 결정한다
		//제네릭 타입은 기본자료형을 인식하지 않는다.
		//int,double등의 기본 자료형을 제네릭타입으로 이용하고자 할 때는
		//Integer, Double 등의 클래스를 이용해야한다.
		DataList<Integer> list = new DataList<>();
		
		//정수입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
//		//문자열저장
//		list.add("문자열");
//		
//		//실수저장
//		list.add((int) 10.33);
		
		//데이터 출력
		int sum=0;
		for(int i = 0; i < list.size(); i++) {
			sum+= list.get(i);
			//데이터 가져오기
			
			
			//저장된 데이터 타입이 어떤타입인지 검사
//			if(data instanceof Integer) {
//				System.out.println("정수 : " + (int)data);
//			} else if(data instanceof Double) {
//				System.out.println("실수 : " + (double)data);
//			} else if(data instanceof String) {
//				System.out.println("문자열 : " + (String)data);
//			}
		}
	}

}
