package ch8_IntroductionToOPP;

class Cellphone
{
	public void Vibrating()
	{
		System.out.println("Vibrating...");
		
	}
	public void Ringing()
	{
	System.out.println("Ringing...");
	}
}

public class PracticeSet_Problem2_39 {

	public static void main(String[] args) {
		
		Cellphone mi = new Cellphone();
		
		mi.Vibrating();
		mi.Ringing();

		
	}

}
