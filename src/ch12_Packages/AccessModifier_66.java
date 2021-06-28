package ch12_Packages;

import ch12_Packages_AccessModifier1.*;

class C1
{
	public int a=1;
	
	protected int b=2;
	
	int c=3;           //Default
	
	private int d=4; 
}

class C3 extends AccessModifier1_66
{
	public void name() {
		
		System.out.println(x);
		
		System.out.println(y);
		
//private and default cannot access in subclass
		
//		System.out.println(z);        
//		System.out.println(p);
		
	}
	
}

public class AccessModifier_66 {

	public static void main(String[] args) {
		
		
		C1 c = new C1();
		
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		
		//System.out.println(c.d);        //<-- Cannot access private within package. Only access within class
		
		//.........Accessing from different package............
		
		AccessModifier1_66 am = new AccessModifier1_66();
		
		System.out.println(am.x);        // Only public is accessible
		
		//protected, private and default is not accessible
		
//		System.out.println(am.y);
//		System.out.println(am.z);
//		System.out.println(am.p);
        
	}

}
