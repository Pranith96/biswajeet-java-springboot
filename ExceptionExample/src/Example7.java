public class Example7 {

	public static void main(String[] args) {
		int age = 17;

		display(age);

		System.out.println("hi");

	}

	public static void display(int age) {
		if (age < 18) {
			throw new DataNotFoundException("Age is less than 18");
		}
	}
}
