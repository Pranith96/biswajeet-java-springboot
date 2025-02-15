import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {

		program1();
		System.out.println(".......2.....");
		program2();
		System.out.println("........4..........");
		program4();
		System.out.println(".....................7.............");
		program7();
		System.out.println("........9................");
		program9();
		System.out.println("..................16..................");
		program16();
		System.out.println("...................25...........");
		program25();
	}

	public static void program1() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // single dimension array //20 0-19

		int firstIndex = a[0];
		int lastIndex = a[a.length - 1];
		System.out.println(firstIndex);
		System.out.println(lastIndex);

		System.out.println("............");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void program2() {
		int[] a = { 7, 8, 12, 17, 11, 15 };
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}

	public static void program4() {
		int[] a = { 2, 3, 1, 4, 5 }; // 1+2+3+4+5 = 15
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			k = k + a[i];
			// 0+a[0] = 0+2 = 2
			// 2+a[1] = 2+3 = 5
			// 5+a[2] = 5+1= 6
			// 6+a[3] = 6+4 =10
			// 10+a[4] = 10+5 =15
		}
		System.out.println(k);
	}

	public static void program7() {
		int[] a = { 2, 3, 1, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(a[a.length - 1]);
	}

	public static void program9() {
		int[] a = { 2, 3, 1, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(a[a.length - 2]);
	}

	public static void program16() {
		int[] a = { 2, 3, 1, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void program25() {
		int[] a = { 2, 3, 1, 4, 5 };
		int max = a[0]; // 2, 3, 4, 5
		int secondMax = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				if (secondMax < max) {
					secondMax = max;
				}
				max = a[i];
			}
		}
		System.out.println("Largest value in array without sorting is: " + max);
		System.out.println("second Largest value in array without sorting is: " + secondMax);

	}

}
