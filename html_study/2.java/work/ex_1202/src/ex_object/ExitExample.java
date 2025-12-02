package ex_object;

public class ExitExample {
	public static void main(String[] args) {
		for(int i= 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
		System.out.println("프로그램 종료"); //exit 를 실행했기에 안나옴
	}

}
