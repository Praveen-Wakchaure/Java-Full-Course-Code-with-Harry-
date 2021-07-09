package com.javapractice.ch13_Multithreading;


class MyThread1 extends Thread
{
	public void run() {
		int i=0;
		while(i<4000)
		{
			System.out.println("Thread 1 is Running");
			System.out.println("Chatting");
			i++;
		}	
	}
}

class MyThread2 extends Thread
{
	public void run() {
		int b=0;
		while (b<4000) {
			System.out.println("Thread 2 is Running");
			System.out.println("Cooking");	
			b++;
		}
	}
}

public class ThreadByExtendingThreadClass_70 {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();      
		t2.start();
		
		//Both the threads run concurrently
	}

}
