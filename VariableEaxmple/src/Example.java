
public class Example {

	// static method
	public static void main(String[] args) {
		System.out.println("java");
		Example ex = new Example();
		ex.hello();
		ex.hi();
		
		display();
		view();
	}

	// non-static method
	public void hello() {
		System.out.println("Hello");
		view();
	}

	// non-static method
	public void hi() {
		hello();
		System.out.println("Hi");
	}

	// static method
	public static void display() {
		System.out.println("display");
		Example ex1 = new Example();
		ex1.hi();
	}

	// static method
	public static void view() {
		System.out.println("view");
	}
}
