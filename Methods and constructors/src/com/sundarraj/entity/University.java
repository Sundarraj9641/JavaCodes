package com.sundarraj.entity;

public class University {
    
	private int id;
	private String name;
	private int worktime;
	
	public  void department(int id, String name, int worktime) {
		this.id = id;
		this.name = name;
		this.worktime = worktime;
	}
	
	public void print() {
		System.out.println("id = " +id);
		System.out.println("name = " +name);
		System.out.println("worktime = " +worktime);
	}
	public String toString() {
		String str = "id = " +id + "name = " +name + "worktime = " +worktime;
		return str;
	}
}