package ch8_IntroductionToOPP;



class Square
{
	int side;
	
	public int setSide(int s) 
	{
		side=s;
		
		return side;
	}
	
	public int side()
	{
		return side;
	}
	
	public int area()
	{
		return side*side;
	}
	
	public int perimeter()
	{
		return 4*side;
	}
}


public class PracticeSet_Problem3_39 {
	

	public static void main(String[] args) {
		
		Square s = new Square();
		
		s.setSide(5);
		
		System.out.println("Side: "+s.side);
		System.out.println("Area: "+s.area());
		System.out.println("Perimeter: "+s.perimeter());
		
	}

}
