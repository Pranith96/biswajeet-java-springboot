
public class Example {

	public static void main(String[] args) {
		int age = 17;

		boolean b = (age <= 18) ? true : false;
		System.out.println(b);

		String s = (age > 18) ? "Hello" : "HI";
		System.out.println(s);

		int result = (age <= 20) ? 10 : 20;
		System.out.println(result);

		int i1 = 20;
		int i2 = 20;
		int val = (age >= 18) ? add(i1, i2) : mul(i1, i2);
		System.out.println(val);
	}

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
}
