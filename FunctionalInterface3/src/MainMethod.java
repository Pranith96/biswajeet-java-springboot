import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainMethod {

	public static void main(String[] args) {
		Predicate<Integer> p = (x) -> {
			if (x % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean result = p.test(2);
		System.out.println(result);

		Predicate<Integer> p1 = x -> x % 2 == 0;
		boolean result1 = p1.test(2);
		System.out.println(result1);

		Consumer<String> c = (y) -> {
			y = y.toUpperCase();
			System.out.println(y);
		};
		c.accept("hello world");

		Supplier<Integer> s = () -> {
			Random rn = new Random();
			int num = rn.nextInt(0, 10);
			return num;
		};
		int results = s.get();
		System.out.println(results);
	}
}
