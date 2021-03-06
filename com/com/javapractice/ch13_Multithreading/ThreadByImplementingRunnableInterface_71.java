package com.javapractice.ch13_Multithreading;

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

class Thread3 implements Runnable
{

	@Override
	public void run() {
		
		int i=0;
		
		while(i<2000)
		{
			
			System.out.println("Thread 3");
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
		
		Thread3 bullet3 = new Thread3();
		Thread gun3 = new Thread(bullet3);
		
		gun1.start();
		gun2.start();
		gun3.start();
			
	}

}
