package ch01;

public class scope {
		public static void main(String[] args) {
			//변수의 사용 범위 {} 안에 들어간
			//if(){}, for(){}, while(){}, switch(){}
			int var1 = 10; //main ()메서드 영역에서 변수의 선언
			
			if(true) {
				int var2 = 20;
				var1 = 100;
				//현재 영역에선 var1,var2를 사용할 수 있다.
			}
			
			if(true) {
				int var3 = 300;
				//현재 영역에서 사용할 수 있는 변수를 모두 적으세요
				//var1,var3
				//var2는 위의 if문에 들어가 있기때문에 사용 불가.
				
			}
			//여기서는 var1만 사용가능
			//var2,var3는 사용불가.
		}
}
