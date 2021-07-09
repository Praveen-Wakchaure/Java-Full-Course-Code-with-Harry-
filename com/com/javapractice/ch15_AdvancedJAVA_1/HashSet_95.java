package com.javapractice.ch15_AdvancedJAVA_1;

import java.util.HashSet;

public class HashSet_95 {

	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>(5);
		
		hs.add(501);
		hs.add(502);
		hs.add(503);
		hs.add(504);
		hs.add(505);
		hs.add(506);
		hs.add(507);
		
		hs.add(503);  //Cannot add Duplicate element (Collision)
		
		System.out.print("hs Array: ");
		System.out.println(hs.clone());
		
		hs.clear();
		
		System.out.print("hs Array: ");
		System.out.println(hs.clone());
	}

}
