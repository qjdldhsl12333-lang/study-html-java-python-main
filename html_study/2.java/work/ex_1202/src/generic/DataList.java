package generic;

//객체를 만들면서 전달받은 타입을 클래스내부로 전달.
// 타입전파라고 한다.
public class DataList<T> {
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public DataList() {
		data = new Object[defaultSize];
		
	}
	public DataList (int size) {
		data = new Object[size];
	}
	//메서드를 호출하면서 Object타입의 value를 인자로 전달받아
	// data 배열에 넣는 add 메서드 만들기
	public void add(T value) {
		data[size++] =value;
	}
	// index를 인자로 받아서 배열에 들어가 있는 값을 반환해주는 get 메서드 
	// 작성하기
	public T get(int index) {
		return (T)data[index];
	}
	public int size() {
		return size;
	}

}
