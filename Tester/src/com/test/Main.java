package com.test;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tester t = new Tester();
		/*
		 * first user #0
		 */
		t.setB(1);
		/*
		 * first user #0
		 */
		t.setB(100);
		
		t.setC(1);
		t.setA(100);
		
		System.out.println(t.getA() + " : " + t.getC());
	}

}
