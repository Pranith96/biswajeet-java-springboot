
public class MainMethod {

	public static void main(String[] args) {

		Addition ad1 = (int x, int y) -> {
			int z = x + y;
			return z;
		};
		int result = ad1.add(20, 20);
		System.out.println(result);

		Addition ad2 = (x, y) -> {
			int z = x + y;
			return z;
		};
		int result1 = ad2.add(20, 20);
		System.out.println(result1);
		
		Addition ad3 = (x, y) -> {
			return x + y;
		};
		int result2 = ad3.add(20, 20);
		System.out.println(result2);
				
		Addition ad4 = (x, y) -> x + y;
		int result3 = ad4.add(20, 20);
		System.out.println(result3);
	}
}
