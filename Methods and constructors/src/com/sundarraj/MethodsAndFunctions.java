package com.sundarraj;

import com.sundarraj.entity.University;

public class MethodsAndFunctions {
	public static void print() {
		System.out.println("Raj");
	}

	public static void main(String[] args) {
		
		print();
		University un = new University();
		un.department(124, "EEE", 2022);
		un.department(104, "ECE", 2012);
		un.department(113, "CIVIL", 2002);
		un.department(024, "MECH", 2015);
		un.print();
		un.toString();
		
	}
}

