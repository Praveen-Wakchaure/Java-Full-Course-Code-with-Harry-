package ch9_Inheritance;


class parent
{
	parent(int x)
	{
		System.out.println("Value of x: "+x);
	}
}

class child1 extends parent
{

	child1(int x,int y) {
		super(x);
		System.out.println("Value of y: "+y);
	}
}

class child2 extends child1
{

	child2(int x, int y, int z) {
		super(x, y);
		 System.out.println("Value of z: "+z);
	}
	
}

public class ConstructorInInheritance_46 {

	public static void main(String[] args) {
	
		
		child2 c = new child2(5, 6, 7);
	}
}
