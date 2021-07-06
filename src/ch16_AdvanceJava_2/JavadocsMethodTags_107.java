package ch16_AdvanceJava_2;

import java.util.Date;

import ch10_Inheritance.ThisAndSuper_47;

public class JavadocsMethodTags_107 {
	
	/**
	 * This is the method to add two integers.
	 * @param a is the first integer value
	 * @param b is the second integer value
	 * @param sum is addition of a and b
	 * @return sum
	 * @throws Exception
	 */
	
	public static int add(int a, int b) throws Exception {
		
		if (a==0 && b==0)
		{
			throw new Exception();
		}
		int sum = a+b;
		return sum;
		
	}
	
	/**
	 * This is the method to print the date
	 * @param c is the integer value which gives date
	 * @deprecated The date method is deprecated
	 * @return integer c
	 */
	
	public static int date() {
		Date d = new Date();
		int c =d.getDate();
		return c;
	
	}

	public static void main(String[] args) throws Exception {


		System.out.println(add(5, 5));
		
		System.out.println(date());

	}

}
