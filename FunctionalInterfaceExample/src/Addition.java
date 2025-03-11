@FunctionalInterface
public interface Addition {

	public void add(int a, int b);
	
	public static void sum(int x, int y) {
		int z = x+y;
		System.out.println(z);
	}
	
	default void hello() {
		System.out.println("hello");
	}
}
