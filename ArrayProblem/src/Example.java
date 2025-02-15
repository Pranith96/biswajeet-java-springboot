
public class Example {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 }; // single dimension array
		int[][] b = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 8 } }; // 2D-array

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("......................");
		int r1 = b[0][0];
		System.out.println(r1);
		int r2 = b[0][1];
		System.out.println(r2);
		int r3 = b[2][1];
		System.out.println(r3);

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}

}
