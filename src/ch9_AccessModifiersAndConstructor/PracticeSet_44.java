package ch9_AccessModifiersAndConstructor;

class Cylinder
{
	float radius;
	float height;
	float area;
	float volume;
	public float getRadius() {
		return radius;
	}
	public void setRadius(double d) {
		this.radius = (float) d;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(double d) {
		this.height = (float) d;
	}
	
	public float area()
	{
		area=2*(22/7)*radius*height;
		return area;
	}
	public float volume ()
	{
		volume=(22/7)*radius*radius*height;
		return volume;
	}
	
	//Custom Parameters
	
	public float area(float radius, float height)
	{
		area=2*(22/7)*radius*height;
		return area;
	}
	
	public float volume (float radius, float height)
	{
		volume=(22/7)*radius*radius*height;
		return volume;
	}
}

public class PracticeSet_44 {

	public static void main(String[] args) {
		
		Cylinder c=new Cylinder();
		
		c.setRadius(10);
		c.setHeight(10);
		
		System.out.println("Radius:"+c.getRadius());
		System.out.println("Height: "+c.height);
		
		System.out.println("Area: "+c.area());
		System.out.println("Volume: "+c.volume());
		
		//Custom Parameters
		
		System.out.println(".....Custom Parameters.......");
		
		System.out.println("Area: "+c.area(4,5));
		System.out.println("Volume: "+c.volume(4,5));
		
		
	}

}
