package com.javapractice.ch11_AbstractClassesAndInterfaces;

interface Bicycle
{
	int a=50;         //<-- this value is by default final value.
	
	void applyBrake(int decrement);
	void speedUp(int increment);
	void rest (int n);
}

interface Motorcycle
{
	void Light (String Off);
	void Switch (String On);
}

abstract class Vehicle
{
	void fourWheeler(int f) 
	{
	}
	abstract void twoWheeler(int t);
}

// All methods of interface must be implemented in the subclass of the interface

class Driver extends Vehicle implements Bicycle,Motorcycle //Multiple interfaces can be implemented, but only one abstract class is extends

{
	@Override
	public void applyBrake(int decrement) {
		System.out.println("Slow Down...");
	}

	@Override
	public void speedUp(int increment) {
		System.out.println("Speed Up...");
	}

	@Override
	public void rest(int n) {
		System.out.println("Neutral");
	}

	@Override
	public void Light(String Off) {
		System.out.println("Light off...");
	}

	@Override
	public void Switch(String On) {
		System.out.println("Switch On...");
	}

	@Override
	void twoWheeler(int t) {
		System.out.println("Two Wheeler");
	}
}

public class Interface_54 {

	public static void main(String[] args) {
		
		Driver d =new Driver();
		
		d.applyBrake(0);
		d.speedUp(0);
		d.rest(0);
		d.Light(null);
		d.Switch(null);
		d.twoWheeler(0);
		
	   // d.a=70;                  //<--not allowed
		System.out.println(d.a);  //this Prints a=50 because once the variable value declare in the interface, it cannot be change.
	}
}
