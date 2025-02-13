import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int i = 10;
		int[] j = { 1, 2, 7, 8, 9, 3, 4 };
		String[] str = { "jh", "ha", "oi" };
		int[] k = { 1, 2, 7, 8, 9, 3, 4 };

		String s = Arrays.toString(j);
		System.out.println(s);
		System.out.println(Arrays.toString(j));
		System.out.println(Arrays.toString(str));
		int res = j[2];
		System.out.println(res);

		boolean b = Arrays.equals(j, k);
		System.out.println(b);

		Arrays.sort(j);
		System.out.println(Arrays.toString(j));

		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(Arrays.toString(a));
		
		System.out.println(a.length);
		System.out.println(j.length);
		
		j[j.length-1] = 10;
		System.out.println(Arrays.toString(j));
		
		int result = Arrays.binarySearch(j, 2);
		System.out.println(result);

	}
}
