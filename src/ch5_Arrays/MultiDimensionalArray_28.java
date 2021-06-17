package ch5_Arrays;

public class MultiDimensionalArray_28 {

	public static void main(String[] args) {
		
		
		//2-D Array
		
		int [][] flats = new int [2][2];
		
		flats [0][0]=1001;
		flats [0][1]=1002;
		flats [1][0]=101;
		flats [1][1]=102;
		
		for(int i=0;i<flats.length;i++)
		{
			for(int j=0;j<flats[i].length;j++) 
			{
				System.out.print(flats[i][j]);
				System.out.print("  ");
			}
			System.out.println("");
		}
		
		//3-D Array
		
		int [][][] Array = new int [1] [2] [3];
		
		
		
		
	}

}
