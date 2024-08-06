package com.itbulls.learnit.javacore.primitives;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
//public static is a standard declaration for main section of code first example ////!
		byte b = 1;
		short s;
		s = 2;
		int i = 3;
		long l = 4;
		
		char c = 'a';
		
		boolean bool = true;
		
		float f = 1.2F;
		
		long l2 = 2_000_000_000_000L;
		
		double d = 1.3;
		
		var v = 1;
//		v = true;
//		v = 1.3;
		
		int i3 = s;
		
		char c2 = 100;
		System.out.println(c2);
		System.out.println("Our first class on java programming.......!");
		
		double d2 = i3;
		d2 = l;
		
		b = (byte)i3;
		
		byte b2 = (byte)128;
		System.out.println(b2);
		
		long number = 499_999_999_000_000_001L;
		double converted = (double) number;
		System.out.println(number - (long) converted);
		
		Integer i4 = 1;
		
		int i5 = i4;
		
		
	}

}
