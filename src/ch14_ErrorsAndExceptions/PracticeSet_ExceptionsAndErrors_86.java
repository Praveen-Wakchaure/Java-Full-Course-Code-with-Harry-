package ch14_ErrorsAndExceptions;

import java.util.Scanner;

/*
//................1..........................
class MyException2 extends IllegalArgumentException

{
	@Override
	public String toString() {
		return "He...He...";
	}
	
	@Override
	public String getMessage() {
		return "He...He...";
	}
}
*/

//..................2,3,4.......................

class MaxAttempt extends Exception
{
	@Override
	public String toString() {
		return "Error.....Maximum attemt reached......";
	}
	
	@Override
	public String getMessage() {
		return "Error.....Maximum attemt reached......";
	}
}



public class PracticeSet_ExceptionsAndErrors_86 {

	

	public static void main(String[] args) throws MaxAttempt {
	
/*
		//................1..........................
		
		int a=5;
		int b=0;
		
		try
		{
			if(a<6)
			{
				throw new MyException2();
			}
			
		}
		finally
		{
			try
			{
				int c=a/b;
				System.out.println(c);
			}
			
			catch (ArithmeticException e)
			{
				System.out.println("Ha...Ha...");
			}
		}
*/


//..................2,3,4.......................
	
		Scanner sc = new Scanner(System.in);
		int [] array = {5,6,7};
		int i=0;
		
		boolean flag = true;
		
		while(flag && i<5)
		{
			try
			{
				System.out.println("Write the Index Number");
				int index = sc.nextInt();
				System.out.println("Value of index is :"+array[index]);
				flag=false;
			}
			catch (Exception e) {
				i++;
				System.out.println("Invalid Index");
			}
			if(i>=5)
			{
				//System.out.println("Error.....Maximum attempt reached......");
				
				throw new MaxAttempt();         //Custom Exception
			}
		}
	
	}

}
