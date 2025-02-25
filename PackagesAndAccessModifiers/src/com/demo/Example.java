package com.demo;

public class Example {
	public int i = 10;

	public void welcome() {
		System.out.println("Welcome");
		display();
	}

	private void display() {
		System.out.println("Display");
	}

	protected void hello() {
		System.out.println("hello");
	}

	void hi() {
		System.out.println("Hi");
		display();
	}
}
