
public class MainMethod {

	public static void main(String[] args) {
		Addition ad = new AdditionImpl2();
		ad.add(10, 10);
		ad.hello();
		Addition.sum(20, 10);

		Addition ad1 = (int x, int y) -> {
			int z = x + y;
			System.out.println(z);
		};
		ad1.add(20, 20);

		Addition ad2 = (x, y) -> {
			int z = x + y;
			System.out.println(z);
		};
		ad2.add(20, 20);

		Addition ad3 = (x, y) -> {
			System.out.println(x + y);
		};
		ad3.add(20, 20);
		
		Addition ad4 = (x, y) -> System.out.println(x + y);
		ad4.add(20, 20);
	}
}
