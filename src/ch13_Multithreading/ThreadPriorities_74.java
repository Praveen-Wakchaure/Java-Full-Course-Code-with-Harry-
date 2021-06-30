package ch13_Multithreading;

class Thread11 extends Thread
{
	public void run() {
		
		int i=0;
		while(i<50)
		{
			System.out.println("Thread 11");
			i++;
		}
	}
}

class Thread12 extends Thread
{
	public void run() {
		
		int i=0;
		while(i<50)
		{
			System.out.println("Thread 12");
			i++;
		}
	}
}

class Thread13 extends Thread
{
	public void run() {
		
		int i=0;
		while(i<50)
		{
			System.out.println("Thread 13");
			i++;
		}
	}
}

class Thread14 extends Thread
{
	public void run() {
		
		int i=0;
		while(i<50)
		{
			System.out.println("Thread 14");
			i++;
		}
	}
}

class Thread15 extends Thread
{
	public void run() {
		
		int i=0;
		while(i<50)
		{
			System.out.println("Thread 15");
			i++;
		}
	}
}

public class ThreadPriorities_74 {

	public static void main(String[] args) {
		
		Thread11 t11 = new Thread11();
		Thread12 t12 = new Thread12();
		Thread13 t13 = new Thread13();
		Thread14 t14 = new Thread14();
		Thread15 t15 = new Thread15();
		
		t15.setPriority(Thread.MAX_PRIORITY);          //Executes maximum times
		t13.setPriority(Thread.NORM_PRIORITY);         //Executes normal times
		t11.setPriority(Thread.MIN_PRIORITY);          //Executes minimum times
		
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
	}
}
