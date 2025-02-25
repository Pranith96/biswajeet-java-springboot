package com.demo1;

public class Example1 {
	public int i = 10;

	public void welcome1() {
		System.out.println("Welcome1");
		display1();
	}

	private void display1() {
		System.out.println("Display1");
	}

	protected void hello1() {
		System.out.println("hello1");
	}

	void hi1() {
		System.out.println("Hi1");
		display1();
	}
}
