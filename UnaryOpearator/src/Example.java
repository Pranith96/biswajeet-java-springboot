
public class Example {

	public void display() {
		int i = 10;
		System.out.println(i);
		int j = i++; // 10
		System.out.println(i); // 10+1 = 11
		System.out.println(j);
		
		//welcome();
	}
	
	public void welcome() {
		Example2 ex2 = new Example2();
		ex2.display_1();
	}
	
	public void display1() {
		int i = 10;
		System.out.println(i);
		int j = ++i; // 10+1
		System.out.println(i); //11
		System.out.println(j); // 11
		
		//welcome();
	}
	
	public void display2() {
		int i = 10;
		System.out.println(i);
		int j = --i; // 10-1
		System.out.println(i); //9
		System.out.println(j); // 9
		
		//welcome();
	}
	
	public void display3() {
		int i = 10;
		System.out.println(i);
		int j = i--; // 10
		System.out.println(i); //10-1
		System.out.println(j); // 10
		
		//welcome();
	}
}
