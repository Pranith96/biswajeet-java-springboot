import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		try {
			int[] a = new int[4];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;
			System.out.println(Arrays.toString(a));

			int b = 10;
			int c = b / 0;
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("spring");
		}
		System.out.println("Hello welcome");
		System.out.println("Java");
	}
}
