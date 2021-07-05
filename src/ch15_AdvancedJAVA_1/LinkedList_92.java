package ch15_AdvancedJAVA_1;

import java.util.LinkedList;

public class LinkedList_92 {

	public static void main(String[] args) {


		LinkedList<Integer> l1 = new LinkedList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		//l1.add(5, 555);

		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		
		l1.addLast(100);
		l1.addFirst(100);
		
		System.out.println("");
		
		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
		
		l1.removeLast();
		l1.removeFirst();
		
		System.out.println("");
		
		System.out.print("l1 Array: ");
		
		for (int i=0; i<l1.size();i++)	
		{
			System.out.print(l1.get(i));
			System.out.print(" ");
		}
	}

}
