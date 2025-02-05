
public class Example2 {

	int i = 20; // instance variable
	static int b = 30; // static variable

	// static method
	public static void main(String[] args) {
		System.out.println("java");
		Example2 ex = new Example2();
		ex.hello();
		view();

		System.out.println(ex.i);
		System.out.println(b);
		bird(40);
		int result = bike(40);
		System.out.println(result);
		
		String result1 = bike1(40);
		System.out.println(result1);
	}

	// non-static method
	public void hello() {
		int a = 10; // local variable
		System.out.println("Hello");
		System.out.println(a);
		i = 50;
		System.out.println(i);
		System.out.println(b);
		view();
		bird(a);

	}

	// static method
	public static void view() {
		System.out.println("view");
		Example2 ex = new Example2();
		System.out.println(ex.i);
		System.out.println(b);
	}

	// static method
	public static void bird(int data) {
		int g = data + 60;
		System.out.println(g); // 70, 100
	}

	// static method
	public static int bike(int data) {
		int g = data * 60;
		return g;
	}

	// static method
	public static String bike1(int data) {
		int g = data * 60;
		return "bike" + g;
	}
}
