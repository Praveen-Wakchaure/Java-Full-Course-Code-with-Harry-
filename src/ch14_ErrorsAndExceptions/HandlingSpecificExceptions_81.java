package ch14_ErrorsAndExceptions;

public class HandlingSpecificExceptions_81 {

	public static void main(String[] args) {
		
		int [] arr = {2,4,6,8,10};
		
		try
		{
			System.out.println(arr[7]);
			
			System.out.println(arr[2]/0);
		}
		catch (ArrayIndexOutOfBoundsException b) {
			
			System.out.println("Array index is out of bound :"+b);
			
		}
		
		System.out.println("");
		
		try
		{
			System.out.println(arr[3]/0);   //<---ArithmeticException Occurs and it catch into << catch (ArithmeticException a) >> block
		  //System.out.println(arr[8]/0);   //<---ArrayIndexOutOfBoundsException Occurs and it catch into << catch(Exception e) >> block
		}
		catch (ArithmeticException a) {
			
			System.out.println("Can't divide by Zero because of : "+a);
		}
		catch(Exception b)
		{
			System.out.println("Some exception occurs :"+b);
		}
	}

}
