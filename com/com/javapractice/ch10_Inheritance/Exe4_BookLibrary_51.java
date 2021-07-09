package com.javapractice.ch10_Inheritance;

class BookLibrary
{
	String [] bookLibrary = new String[5];
	String [] issueBooks = new String [5];
	String [] returnBooks = new String [5];
		
	public void addBook(int i,String name) 
	{
		bookLibrary[i]=name;
	}

	public String issueBook(int i) 
	{
		issueBooks [i]= bookLibrary[i];
		
		System.out.println("issued Book :"+issueBooks [i]);
		
		bookLibrary[i]=bookLibrary[i]+":Not Available";
		
		System.out.println("...Available book stock...");
		
		for(int n=0; n<=4 ; n++)
		{
			System.out.println(bookLibrary[n]);
		}
		return null;
	}
	
	public String returnBook(int i) 
	{
		returnBooks[i]=issueBooks[i];
		
		bookLibrary[i]=returnBooks[i];
		
		System.out.println("Return Book: "+returnBooks[i]);
		
		System.out.println("...Available book stock...");
		
		for(int n=0; n<=4 ; n++)
		{
			System.out.println(bookLibrary[n]);
		}
		
		return bookLibrary[i];	
	}
	
	public void showAllBook() 
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

		///Available Book///
		
		System.out.println(".....All Book List.....");
		
		b.showAllBook();
		
		System.out.println("");
		
		///Issued Book///
		
		System.out.println(".....Issued Book.....");
		
		b.issueBook(1);
		
		//System.out.println(b.issueBook(1));
		
		System.out.println("");
		
		///Return Book///
		
		System.out.println(".....Return Book.....");
		
		b.returnBook(1);
		
	}

}
