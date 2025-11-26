package ch16;

public class Book {
	String title;
	String author;
	
	public void printInfo(String title, String author) {
		this.title =title;
		this.author =author;
		System.out.printf("제목 :%s , 저자 :%s\n",title,author);
		
	}
	

}
