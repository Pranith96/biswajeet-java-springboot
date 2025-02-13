import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		String s = "Hello";
		s = s.concat("World ");
		System.out.println(s);

		System.out.println(s.charAt(1));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("ello"));
		System.out.println(s.endsWith("rld"));
		System.out.println(s.startsWith("He"));

		System.out.println(s.isBlank()); // """,null,"
		System.out.println(s.isEmpty());
		System.out.println(!s.isEmpty());
		System.out.println(s.trim());
		System.out.println(s.length());

		String str = s.substring(5);
		System.out.println(str); // dfghjcvhjvb678678vbnnghjvbn

		String str1 = s.substring(1, 4);
		System.out.println(str1);

		System.out.println(".........................");
		String s1 = "Welcome to java";
		String[] s2 = s1.split("\\s");
		System.out.println(Arrays.toString(s2));
		for (int i = 0; i < s2.length; i++) {
			String s8 = s2[i];
			for (int j = s8.length() - 1; j >= 0; j--) { // 0-6 ;
				System.out.print(s8.charAt(j));
			}
			System.out.println();
		}

		for (int k = s1.length() - 1; k >= 0; k--) {
			System.out.print(s1.charAt(k));
		}
		System.out.println(".............");
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Welcome");
		System.out.println(sb);
		sb.reverse(); // reverse method will be only in string buffer and String builder not in String
						// class
		System.out.println(sb);
		System.out.println(".............");
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("Welcome");
		System.out.println(sb1);
	}
}
