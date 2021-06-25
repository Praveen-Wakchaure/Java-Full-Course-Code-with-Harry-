package ch11_AbstractClassesAndInterfaces;

interface GPS
{
	void gps();
	void location();

interface Camera
{
	void video();
	void photo();
}
	
class SmartPhone implements GPS, Camera
{

	@Override
	public void video() {
		System.out.println("Recording video...");
		
	}

	@Override
	public void photo() {
		System.out.println("Taking Photo...");
		
	}

	@Override
	public void gps() {
		System.out.println("GPS");
		
	}

	@Override
	public void location() {
		System.out.println("Sharing Location...");
		
	}
	
}
}
public class PolymorphismInInterface_ {

	public static void main(String[] args) {
		
		GPS g = new SmartPhone();
		
		//g.video();   //<--- Not allowed
		//g.photo();   //<--- Not allowed
		
		//Object can implements only methods which are include in it's reference. In this case reference is GPS.
		
		g.gps();
		g.location();

	}

}
