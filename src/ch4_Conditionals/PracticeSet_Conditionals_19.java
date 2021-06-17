package ch4_Conditionals;

import java.util.Scanner;

public class PracticeSet_Conditionals_19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/*		//1 --> Error code
		
		int a =10;
		
		if (a=11) //<--- Cannot assigned value in if statement
		{
			System.out.println("---");
		}
		else
		{
		System.out.println("---");
	}
	
*/	
		
/*		//2
		
		
		
		System.out.println("Enter Marks of subject 1 out of 100");
		float sub1 = sc.nextFloat();
		
		System.out.println("Enter Marks of subject 2 out of 100");
		float sub2 = sc.nextFloat();
		
		System.out.println("Enter Marks of subject 3 out of 100");
		float sub3 = sc.nextFloat();
		
		float total = sub1+ sub2 + sub3;
		 
		float percentage = total/300 *100;
		
		if (sub1>=33 && sub2>=33 && sub3>=33 && percentage>=40)
		{
			System.out.println("Pass");
			System.out.println(percentage);
		}
		else
		{
			System.out.println("Fail");
			System.out.println(percentage);
		}
	
*/	

/*		//3
		
		System.out.println("Enter your income in Lakh");
		
		float income = sc.nextFloat();
		
		if (income<2.5)
		{
			System.out.println("Tax Paid in lakh = 0");
			
		}
		
		else if (income>=2.5 && income<=5)
		{
			System.out.println("Tax Paid in lakh =" +(income-2.5)*0.05);
		}
		
		else if (income>5 && income<=10)
		{
			System.out.println("Tax Paid in lakh =" +((2.5*0.05)+((income-5)*0.2)));
		}
		else if (income>10)
		{
			System.out.println("Tax Paid in lakh =" +((2.5*0.05)+(5*0.2)+((income-10)*0.3)));
		}
*/		
		
/*		//4
		
		System.out.println("Enter day number");
		
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1->System.out.println("Monday");
		case 2->System.out.println("Tue");
		case 3->System.out.println("Wed");
		case 4->System.out.println("Thur");
		case 5->System.out.println("Fri");
		case 6->System.out.println("Sat");
		case 7->System.out.println("Sun");
		}
		
*/	
		//5
		
		System.out.println("Enter Year");
		
		int year = sc.nextInt();
		
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.println("Specified year is a leap year");
		}    
	    else
	    {
	    	 System.out.println("Specified year is not a leap year");
	    }
	        
		
		
		
		
		
/*		
 	    //6
		
		System.out.println("Enter the Website");
		
		String web = sc.next();
		
		if(web.endsWith(".com"))
		{
			System.out.println("Commercial Website");
		}
		
		else if (web.endsWith(".org"))
		{
			System.out.println("Organization Website");
		}
		
		else if (web.endsWith(".in"))
		{
			System.out.println("Indian Website");
		}
*/	
	
	}
	
}
