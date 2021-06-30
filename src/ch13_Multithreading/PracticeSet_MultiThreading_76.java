package ch13_Multithreading;

class Thread31 extends Thread
{
	public void run() {
		int i=0;
		while(i<50)
		{
			System.out.println("Good Morning");
			i++;
		}
	}
}

class Thread32 extends Thread
{
	public void run() {
		int b=0;
		while(b<50)
		{
			
				System.out.println("welcome");
				b++;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
	}
}

public class PracticeSet_MultiThreading_76 {

	public static void main(String[] args) {

	
		Thread31 t31 = new Thread31();
		Thread32 t32 = new Thread32();
		
		t31.setPriority(Thread.MIN_PRIORITY);
		t32.getPriority();		
		t31.start();
		t32.start();
	}
}
