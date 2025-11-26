package ch16;

public class Library {
	
	Book[] books;
	int count;
	
	public Library(int x) {
		books = new Book[x];
		count = 0;
	}

	
	public void addBook(String title, String author) {
		Book b = new Book();
		
		
		System.out.printf("책추가: 제목 -%s, 저자-%s\n",b.title,b.author);
		}
	public void printAllBooks() {
		
	}

}
