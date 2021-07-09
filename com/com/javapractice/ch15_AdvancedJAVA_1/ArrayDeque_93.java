package com.javapractice.ch15_AdvancedJAVA_1;

import java.util.ArrayDeque;

public class ArrayDeque_93 {

	public static void main(String[] args) {
		
		ArrayDeque <Integer> ad = new ArrayDeque<>();
		
		ad.add(101);
		ad.add(102);
		ad.add(103);
		ad.add(104);
		
		ad.addFirst(10001);
		ad.addLast(10002);
		
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		System.out.println(ad.getClass());
		

	}

}
