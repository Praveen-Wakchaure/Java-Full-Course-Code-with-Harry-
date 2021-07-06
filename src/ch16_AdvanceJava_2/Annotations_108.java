package ch16_AdvanceJava_2;

class Phone
{
	public void ringing() {
		System.out.println("Phone Ringing");
	}
}


class SmartPhone extends Phone
{
	@Override
	public void ringing() {
		System.out.println("SmartPhone Ringing");	
	}
}


class Mobile
{
	@Deprecated
	public void Camera() {
		System.out.println("Taking Photo");
	}
}

@FunctionalInterface
interface MyInterface
{
	void name();
	//void name2();  //<--- Functional Interface contains only one method 
}


public class Annotations_108 {
	
	@SuppressWarnings( "deprecation" )
	
   public static void main(String[] args) {


		SmartPhone sp = new SmartPhone();
		sp.ringing();
		
		Mobile m =new Mobile();
		m.Camera();

	}

}
