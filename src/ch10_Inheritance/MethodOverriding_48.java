package ch10_Inheritance;

class A
{
	void B()
	{
		System.out.println("Method B");
	}
}

class C extends  A
{
	@Override
	void B()                      //<-- Method void B is override
	{
		String a="Praveen";
		System.out.println(a);
	}
}

public class MethodOverriding_48 {

	public static void main(String[] args) {
		
		C c = new C();
		
		c.B();		
	}
}
