package ch15_AdvancedJAVA_1;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem_Exe7_107 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Calendar c = Calendar.getInstance();
		
		ArrayList<String> BookNameAndAuthor = new ArrayList<>();
		
		BookNameAndAuthor.add("Marathi-By ABC");
		BookNameAndAuthor.add("Hindi-By ABC");
		BookNameAndAuthor.add("English-By ABC");
		BookNameAndAuthor.add("Science-By ABC");
		BookNameAndAuthor.add("Social Science-By ABC");
		BookNameAndAuthor.add("ICT-By ABC");
		
		System.out.println(".....Available Books With Name and Index(Id).....");
		System.out.println("");
		
		for(int i=0;i<BookNameAndAuthor.size();i++)
		{
			System.out.print(BookNameAndAuthor.get(i));
			System.out.print("::");
			System.out.println(BookNameAndAuthor.indexOf(BookNameAndAuthor.get(i)));	
		}
		System.out.println("");
		
//...........................Issuing Book.....................
		
		System.out.println("Write the Book index Which you Want to issue");
		int b = sc.nextInt();
		
		LocalDateTime d = LocalDateTime.now();
		
		ArrayList<String> IssuedBooks = new ArrayList<>();
		
		IssuedBooks.add(BookNameAndAuthor.get(b)+"::"+d);
		
		BookNameAndAuthor.remove(b);
		
		System.out.println(".....All Issued Book with Date and Time and New Index.....");
		System.out.println("");
		
//........................Showing Issuing Books.................
		
		for(int i=0;i<IssuedBooks.size();i++)
		{
			System.out.println(IssuedBooks.get(i)+"--->"+IssuedBooks.indexOf(IssuedBooks.get(i)));
		}
		System.out.println("");
		
//...................Showing Available Books after Issuing Book...................
		
		System.out.println(".....Available Books With Name and Index(Id).....");
		System.out.println("");
		
		for(int i=0;i<BookNameAndAuthor.size();i++)
		{
			System.out.print(BookNameAndAuthor.get(i));
			System.out.print("::");
			System.out.println(BookNameAndAuthor.indexOf(BookNameAndAuthor.get(i)));	
		}
		System.out.println("");
		
//...............................Returning Book..............................
		
		System.out.println("Write the Book index Which you Want to Return");
		int r = sc.nextInt();
		
		BookNameAndAuthor.add(IssuedBooks.get(r));
		
//...................Showing Available Books after Returning Book...................	

		System.out.println(".....Available Books With Name and Index(Id).....");
		System.out.println("");
		
		for(int i=0;i<BookNameAndAuthor.size();i++)
		{
			System.out.print(BookNameAndAuthor.get(i));
			System.out.print("::");
			System.out.println(BookNameAndAuthor.indexOf(BookNameAndAuthor.get(i)));	
		}
		System.out.println("");
	}

}
