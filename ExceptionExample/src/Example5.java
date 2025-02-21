public class Example5 {

	public static void main(String[] args) {
		int age = 17;
		try {
			display(age);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		System.out.println("hi");

	}

	public static void display(int age) {
		if (age < 18) {
			throw new RuntimeException("Age is less than 18");
		}
	}
}
