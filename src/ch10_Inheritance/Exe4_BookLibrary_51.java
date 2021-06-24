package ch10_Inheritance;

class BookLibrary
{
	String [] bookLibrary = new String[5];
	
	
	
	public void addBook(int i,String name) 
	{
		bookLibrary[i]=name;
	}

	public String issueBook(int i) 
	{
		return bookLibrary[i];
	}
	
	public String returnBook(int i) 
	{
		return bookLibrary[i];
		
	}
	
	public void showAvailableBook() 
	{
		for(int i=0; i<=4 ; i++)
		{
			System.out.println(bookLibrary[i]);
		}
	}
}


public class Exe4_BookLibrary_51 {

	public static void main(String[] args) {
		
		BookLibrary b = new BookLibrary();

		b.addBook(0,"Marathi");
		b.addBook(1,"Hindi");
		b.addBook(2, "English");
		b.addBook(3, "Science");
		b.addBook(4, "Math");

		
		System.out.println(".....Available Book.....");
		
		b.showAvailableBook();
		
		System.out.println("");
		
		System.out.println(".....Issued Book.....");
		
		b.issueBook(2);
		
		System.out.println(b.issueBook(2));
		
		System.out.println("");
		
		System.out.println(".....Return Book.....");
		
		System.out.println(b.returnBook(2));
		
		
	}

}
