package ch9_AccessModifiersAndConstructor;

import java.util.Random;
import java.util.Scanner;

class Game
{
	int UserInput;
	int noOfGuesses;
	int ComputerInput;
	int i;
	
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	
	public int computerInput()
	{
		int computer = rn.nextInt(100);
		System.out.println("GAME START");
		ComputerInput=computer;
		return computer;
	}
	
	public int noOfGuesses()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Enter the number between 1 to 100: ");
			
			int ui=sc.nextInt();
			
			UserInput=ui;
			
				if(UserInput==ComputerInput)
				{
					System.out.println("Matched");
					System.out.println("No of Guesses: "+i);
					break;
				}
				else
				{
					if(UserInput>100 || UserInput<1)
					{
						System.out.println("No. Entered is not between 1 to 100");
					}
					else if(UserInput>ComputerInput)
					{
						System.out.println("Number Entered is Big");
					}
					else if (UserInput<ComputerInput)
		            {
		            	System.out.println("Number Entered is small");
		            }
				}
			}

		return i;
	}
}

public class Exe3_GuessTheNumber_43 {
	
	public static void main(String[] args) {
	
	Game g = new Game();
	
	g.computerInput();
	
	g.noOfGuesses();

	}

}
