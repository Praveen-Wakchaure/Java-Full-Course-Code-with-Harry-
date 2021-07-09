package com.javapractice.ch13_Multithreading;

//Thread()................................

class Thread5 extends Thread
{
	public Thread5() {
		
		int i =0;
			while (i<5)
			{
				System.out.println("Thread 5");
				i++;
			}
		}
	}



//Thread(String name)......................

class Thread6 extends  Thread {
	
  public Thread6 (String name) {
	  
	  super(name);
	}

  int i =0;
	@Override
	public void run() {
		while (i<5)
		{
			System.out.println("Thread 6");
			i++;
		}
		
}

}
// Thread (Runnable r)...................

class Thread7 extends  Thread {
	
	  public Thread7 (Runnable r) 
	    {
		  super(r);
		}

	int i =0;
		@Override
		public void run() {
			while (i<5)
			{
				System.out.println("Thread 7");
				i++;
			}
			
	}

}
//Thread (Runnable r, String name)............

class Thread8 extends  Thread {
	
	  public Thread8 (Runnable r, String name)
	    {
		  super(r,name);
		}

	  int i =0;
		@Override
		public void run() {
			while (i<5)
			{
				System.out.println("Thread 8");
				i++;
			}		
	}
}
public class ThreadConstructors_73 {

	public static void main(String[] args) {
		
		Thread5 t5 = new Thread5();
		t5.start();
		System.out.println("The Id of Thread 5 is: "+t5.getId());
		
		Thread6 t6 = new Thread6("Harry");
		t6.start();
		System.out.println("The Id of Thread 6 is: "+t6.getId());
		System.out.println("The name of Thread 6 is: "+t6.getName());
	
        Thread7 t7 = new Thread7(t6);
        t7.start();
        System.out.println("The Id of Thread 7 is: "+t7.getId());
        
		Thread8 t8 = new Thread8(t6,"Code");
		t8.start();
        System.out.println("The Id of Thread 8 is: "+t8.getId());
        System.out.println("The name of Thread 8 is: "+t8.getName());

	}

}
