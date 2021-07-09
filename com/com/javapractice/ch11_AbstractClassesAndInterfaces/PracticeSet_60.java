package com.javapractice.ch11_AbstractClassesAndInterfaces;

/*

 //....................1 & 2...................

abstract class Pen
{
	abstract void write();
	abstract void refill();
}

class FountainPen extends Pen
{

	@Override
	void write() {
		System.out.println("Writing...");
		
	}

	@Override
	void refill() {
		System.out.println("Refilling...");
		
	}
	
	void changeNib()
	{	
	}
}

*/

/*

//...................3........................

class Monkey
{
	void jump()
	{
		System.out.println("Jumping");
	}
	void bite()
	{
		System.out.println("Biting");
	}
}

interface BasicAnimal
{
	void eat();
	void sleep();
}

class Human extends Monkey implements BasicAnimal
{

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
		
	}	
}

*/

//..................4....................

abstract class Telephone
{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}

class SmartPhone2 extends Telephone
{

	@Override
	void ring() {
		System.out.println("Ringing");
		
	}

	@Override
	void lift() {
		System.out.println("Lifting");
		
	}

	@Override
	void disconnect() {
		System.out.println("Disconnecting");
		
	}
	
	void camera()
	{
		System.out.println("Taking Photos");
	}
	
}









public class PracticeSet_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
 
//..................4....................
		
		System.out.println("...Telephone reference...");
		System.out.println("");
		
		Telephone sp = new SmartPhone2();
		
		sp.ring();
		sp.lift();
		sp.disconnect();
		
		System.out.println("");
		
		//sp.camera();      <--- Not allowed, method should be include in reference class i.e Telephone
		
		System.out.println("...SmartPhone reference...");
		System.out.println("");
		
		SmartPhone2 sp1 = new SmartPhone2();
		
		sp1.ring();
		sp1.lift();
		sp1.disconnect();
		sp1.camera();
		
*/		
		
		
		
		
	}

}
