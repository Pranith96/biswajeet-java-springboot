import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		try {
			int[] a = new int[4];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;
			a[4] = 5;
			System.out.println(Arrays.toString(a));
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		System.out.println("Hello welcome");
		System.out.println("Java");
	}
}
