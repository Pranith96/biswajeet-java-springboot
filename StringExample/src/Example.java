
public class Example {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("hello");

		if (s == s1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println(".......1.........");
		if (s == s2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println(".......2.........");

		if (s.equals(s1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println(".......3.........");
		if (s.equals(s2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println(".......3.........");
		if (s.equalsIgnoreCase(s2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
