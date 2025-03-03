import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(6);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(8);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);

		System.out.println(set);

		int count = set.size();
		System.out.println(count);

		set.remove(0);

		System.out.println(set);

		boolean result = set.contains(3);
		System.out.println(result);

		// set.equals(set);

		boolean result1 = set.isEmpty();
		System.out.println(result1);

		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
