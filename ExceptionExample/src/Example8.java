public class Example8 {

	public static void main(String[] args) throws DataNotFoundException2 {
		int age = 17;

		display(age);

		System.out.println("hi");

	}

	public static void display(int age) throws DataNotFoundException2 {
		if (age < 18) {
			throw new DataNotFoundException2("Age is less than 18");
		}
	}
}
