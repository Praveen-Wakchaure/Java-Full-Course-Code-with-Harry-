package ch11_AbstractClassesAndInterfaces;


interface if1
{
	void meth1();
	void meth2();	
}

interface if2 extends if1{
	default void meth2()
	{
		System.out.println("Overridden method 2");//Overridden
	}
	void meth4();
}

class if3 implements if2         //default method not necessary to implement
{

	@Override
	public void meth1() {
		System.out.println("Method 1...");	
	}

	@Override
	public void meth4() {
		System.out.println("Method 4...");	
	}
}

public class InheritanceInInterface_58 {

	public static void main(String[] args) {

		if3 i = new if3();
		
		i.meth1();
		i.meth2();
		i.meth4();

	}

}
