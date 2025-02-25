package com.demo;

import com.demo1.Example1;

public class MainMethod extends Example1{

	public static void main(String[] args) {
		Example ex = new Example();
		ex.welcome();
		ex.hello();
		ex.hi();
		// ex.display();

		Example1 ex1 = new Example1();
		ex1.welcome1();
//		ex1.hello1();
//		ex1.hi1();
//		ex1.display1();
		
		MainMethod m = new MainMethod();
		m.hello1();
//		m.hi1();
//		m.display1();
		m.welcome1();
		
	}
}
