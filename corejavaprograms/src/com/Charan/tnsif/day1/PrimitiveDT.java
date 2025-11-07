package com.Charan.tnsif.day1;

public class PrimitiveDT {
	public static void main(String[] args) {
		
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Min range of byte is" +
				byteMin+"\nMax range of byte is "+byteMax);
		
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("\nMinshort range of byte is" +
				shortMin+"\nMaxshort range of byte is "+shortMax);
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("\nMinint range of byte is" +
				minInt+"\nMaxint range of byte is "+maxInt);
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("\nMinlong range of byte is" +
				minLong+"\nMaxlong range of byte is "+maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("\nfloat value is "+f+" \ndouble value is "+d);
		 
		boolean flag=false;
		System.out.println("\nboolean value is "+flag);
	}

}
