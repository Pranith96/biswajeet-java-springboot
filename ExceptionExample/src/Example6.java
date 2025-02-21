public class Example6 {

	public static void main(String[] args) throws Exception {
		int age = 17;

		display(age);

		System.out.println("hi");

	}

	public static void display(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age is less than 18");
		}
	}
}
