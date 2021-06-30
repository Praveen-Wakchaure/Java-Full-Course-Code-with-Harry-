package ch13_Multithreading;

class MyThread11 extends Thread
{
	public void run() {
		int i=0;
		
		while(i<1000) 
		{
			System.out.println("My Thread 11");
			i++;
		}
		}
}

class MyThread12 extends Thread
{
	public void run() {
		int i=0;
		
		while(i<1000) 
		{
			System.out.println("My Thread 12");
			i++;
		}
		}
}

public class ThreadMethod_75 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread11 t11 = new MyThread11();
		MyThread12 t12 = new MyThread12();
		
		t11.start();
		
		t11.join();                          //Exception Handling needed--> 1. Throws Exception or 2. Try-catch exception
		
		//After finishing of t11, t12 starts executes
		
		t12.start();			
	}
}
