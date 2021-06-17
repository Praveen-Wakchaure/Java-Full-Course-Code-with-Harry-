package ch4_Strings;

public class PracticeSet_15 {
	
	public static void main(String[] args) {
		
		//Question 1
		
		String s = "Praveen";
		
		s = s.toLowerCase();
		
		System.out.println(s);
		
		//Question 2
		
		String s1 = "Pra Veen  PraVeen  PraVeen";
		
		System.out.println(s1.replace(' ', '_'));
		
		//Question 3
		
		String letter = "Dear <|name|> , Thanks a lot";
		
		System.out.println(letter.replace("<|name|>", "Praveen"));
		
		//Question 4
		
		String s2 = "Praveen  Praveen   Praveen";
		
		System.out.println(s2.indexOf("  "));
		System.out.println(s2.indexOf("   "));
		System.out.println(s2.indexOf("           "));
		
		
		//Question 5
		
		String letter1 = "Dear Praveen, \n\tThis JAVA course is nice. \nThanks!";
		
		System.out.println(letter1);
	}

}
