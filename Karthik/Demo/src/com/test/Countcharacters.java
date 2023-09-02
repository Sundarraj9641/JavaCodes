package com.test;

public class Countcharacters {
	public static void main (String[]args) {
	String name = "hello";
	int count=0;
	for(int i=0;i< name.length(); i++) {
		if (name.charAt(i)!= ' ' ) {
			count++;
		}
System.out.print(i);
}
	}
}
