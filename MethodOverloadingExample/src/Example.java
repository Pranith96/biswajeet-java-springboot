
public class Example {

	public void add() {
		System.out.println("Hello welcome");
	}

	public void add(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}

	public void add(int x, int y, long z) {
		long a = x + y + z;
		System.out.println(a);
	}

	public void add(int z, String y) {

		y = y.toUpperCase();
		y = y + z;
		System.out.println(y);
	}
}
