package ch13_Multithreading;

class Thread1 implements Runnable
{

	@Override
	public void run() {
		
		int i=0;
		
		while(i<2000)
		{
			
			System.out.println("Thread 1");
			i++;
		}	
	}	
}

class Thread2 implements Runnable
{

	@Override
	public void run() {
		
		int i=0;
		
		while(i<2000)
		{
			
			System.out.println("Thread 2");
			i++;
		}	
	}
}

public class ThreadByImplementingRunnableInterface_71 {

	public static void main(String[] args) {
		
		Thread1 bullet1 = new Thread1();
		Thread gun1 = new Thread(bullet1);
		
		Thread2 bullet2 = new Thread2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		
		gun2.start();
			
	}

}
