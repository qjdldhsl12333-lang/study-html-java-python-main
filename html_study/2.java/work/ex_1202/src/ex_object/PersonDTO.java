package ex_object;

public class PersonDTO {
	private final String name;
	private final int age;
	
	public PersonDTO(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
