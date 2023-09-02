package com.methoddemo;

public class MethodDemo {
	int c;
	 int add(int a, int b,int d) {
		int c = a+b+d;
		//System.out.println(c);
		return c;
	}
	
	 int sub(int a, int b) {
		int c = a-b;
		//System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		System.out.println(md.add(3,5,5));
		md.add(4,5,7);
		md.add(3,16,7);
		
		md.sub(18,5);
		md.sub(6,5);

	}
}
