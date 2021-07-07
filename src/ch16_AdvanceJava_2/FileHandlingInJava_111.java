package ch16_AdvanceJava_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingInJava_111 {

	public static void main(String[] args) {
/*		
		//Code to create a new File
		
		File myFile = new File("praveen.txt");
		
		try {
			myFile.createNewFile();
			System.out.println("File creates successfully");
			
		} catch (IOException e) {
			
			System.out.println("Unable to create file");
			e.printStackTrace();
		}
*/
/*		
		//Code to write a file
		
		try {
			FileWriter fileWriter = new FileWriter("praveen.txt");
			fileWriter.write("This is the new File   \nThe End ");
			fileWriter.close();	
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
*/
		
		//Code to read a file
		
		File myFile1 = new File("praveen.txt");
		
		try {
			Scanner sc = new Scanner(myFile1);
			while(sc.hasNext()){
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {

		
			e.printStackTrace();
		}
	}
}
