// package ex_if;



// class Book{
// 	String title = "제목없음";
// 	String author = "작자미상";
// 	int price = 0;
	
// 	Book(String title,String author,int price){
// 		this.title=title;
// 		this.author=author;
// 		this.price=price;
		
		
// 	}
	
// 	Book(){
		
// 	}
	
	
// 	void printInfo() {
// 		System.out.println("제목 : "+ title + " 저자 : "+ author +" price :");
// 	}
	
// 	public static void main(String[] args) {
// 		Book b1 = new Book("자바입문", "홍길동", 20000);
// 	       Book b2 = new Book();

// 	       b1.printInfo();
// 	       b2.printInfo();
// 	   }
	
// }
// //----------------------------------------------------------------------------------
// class ScoreCalculator {
// 	int kor;
// 	int eng;
// 	int math;
// 	double getAverage(int kor,int eng, int math){
// 		this.kor=kor;
// 		this.eng=eng;
// 		this.math=math;
// 		return (eng + math + kor)/3;
		
// 	}
// 	public class Main {
// 		   public static void main(String[] args) {
// 		       ScoreCalculator c = new ScoreCalculator();
// 		       double avg = c.getAverage(80, 90, 100);
// 		       System.out.println("평균 점수: " + avg);
// 		   }
// 		}
// 	//--------------------------------------------------------------------
// 	class Person {
// 		   String name;

// 		   public Person(String name) {
// 		       this.name = name;
// 		   }

// 		   public void introduce() {
// 		       System.out.println("안녕하세요, 저는 " + name + "입니다");
// 		   }
// 		   public void studyInfo(String name ,String major) {
				
// 		}
// 	}
// 	class Student extends Person{
// 		    public Student(String name, String major) {
// 		    super(name);
// 			}
		   
			

// 			public void studyInfo(){
// 				System.out.println("안녕하세요, 저는 " + name + "입니다");
			
// 			}
		  
// 		    public class Main {
// 		    	   public static void main(String[] args) {
// 		    	       Student s = new Student("홍길동", "컴퓨터공학");
// 		    	       s.introduce();    // Person 의 메서드
// 		    	       s.studyInfo();    // Student 의 메서드
// 		    	   }
// 		   }
		    
// 		    class Animal() {
// 		    	String name;
		    	
// 		    	Animal(String name){
		    		
		    		
// 		    	}
		    	
// 		    }
// 	}
	

