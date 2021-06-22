package ch4_Conditionals;

import java.util.Random;
import java.util.Scanner;

public class Exe2_RockScissorPaperGame_20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rn = new Random();
		
		int[] Random = {1,2,3};
		
		int computer = rn.nextInt(Random.length);

		
		//0--> Rock
		//1-->Paper
		//2--> Scissor

		System.out.println("Enter the value from given: 0--> Rock\r\n"
				           + "		1-->Paper\r\n"
				           + "		2--> Scissor");
		
		int player = sc.nextInt();
		
		System.out.println(computer);
		
		//0 and 1 --> Rock and Paper    --> Paper wins
		//0 and 2 --> Rock and Scissor  --> Rock Wins
		//1 and 2 --> Paper and Scissor --> Scissor Wins
		//1 and 0 --> Paper and Rock    --> Paper wins
		//2 and 0 --> Scissor and Rock  --> Rock wins
		//2 and 1 --> Scissor and Paper --> Scissor Wins
		
		if (computer==0 && player==1)
		{
			System.out.println("Player Wins");
		}
		else if (computer==0 && player==2)
		{
			System.out.println("Computer Wins");
		}
		else if (computer==1 && player==2)
		{
			System.out.println("Player Wins");
		}
		else if (computer==1 && player==0)
		{
			System.out.println("Computer Wins");
		}
		else if (computer==2 && player==0)
		{
			System.out.println("Player Wins");
		}
		
		else if (computer==2 && player==1)
		{
			System.out.println("Computer Wins");
		}
		else if (computer==0 && player==0)
		{
			System.out.println("Tied");
		}
		else if (computer==1 && player==1)
		{
			System.out.println("Tied");
		}
		else if (computer==2 && player==2)
		{
			System.out.println("Tied");
		}
		else
		{
			System.out.println("Invalid Number from Player");
		}
		
	}

}
