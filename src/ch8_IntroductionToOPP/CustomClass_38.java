package ch8_IntroductionToOPP;

//Custom Class

class Employee1
{
	int id;             //Attr. 1
	String name;        //Attr. 2
	int salary;
	public void details ()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
		System.out.println("Emplolyee salary is: "+salary);
	}
	
	public int getSalary() 
	{
		return salary;
	}
}

public class CustomClass_38 {

	public static void main(String[] args) {
		
		System.out.println("This is custom class");
		
		Employee1 praveen = new Employee1();  //Initiating new Employee Object
		
		// Setting Attributes for praveen
		
		praveen.id=100;
		praveen.name="Praveen Wakchaure";
		praveen.salary=30;
		
		praveen.details();
		

	}

}
