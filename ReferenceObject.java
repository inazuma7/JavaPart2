
class Book{
	String title;
	String author;
	
	Book(String title, String author ){
		this.title = title;
		this.author = author;
	}
	
	void display() {
		System.out.println("\nTitle\t: " + this.title);
		System.out.println("\nAuthor:\t " + this.author);
	}
	


}

public class ReferenceObject {
	public static void main(String [] args) {
		
		Book book1 = new Book("Pride and Prejudice", "Jane Austen");
		book1.display();
		
		//display address
		String addressBook1 = Integer.toHexString(System.identityHashCode(book1));
		System.out.println(addressBook1);
		
		//assignment object
		Book book2 = book1;
		book2.display();
		String addressBook2 = Integer.toHexString(System.identityHashCode(book2));
		System.out.println(addressBook2);
		
		//book1 & book2 are same address/refrence same
		book1.title = "Emma";
		book1.display();
		book2.display();
		
		//insert object to methods
		function(book2);
		book1.display();
		book2.display();
	}
	
	
	
	public static void function(Book dataBook) {
		String addressDataBook = Integer.toHexString(System.identityHashCode(dataBook));
		System.out.println("address in function " + addressDataBook);
	    dataBook.author = "Auten Jane";
	}

}
