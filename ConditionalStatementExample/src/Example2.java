import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = sc.nextInt();

		if (age > 18) {
			welcome();
		} else {
			System.out.println("SpringBoot");
		}
		sc.close();
	}

	public static void welcome() {
		System.out.println("Welcome to Java");
	}
}
