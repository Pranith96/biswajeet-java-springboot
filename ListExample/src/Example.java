import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);

		int count = list.size();
		System.out.println(count);

		int indexZero = list.get(8);
		System.out.println(indexZero);

		list.remove(0);

		System.out.println(list);

		boolean result = list.contains(3);
		System.out.println(result);

		// list.equals(list);

		boolean result1 = list.isEmpty();
		System.out.println(result1);

		list.set(3, 10);
		System.out.println(list);

		list.add(3, 20);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		int index = 0;
		for (Integer i : list) {
			System.out.println(i);
			index++;
		}
	}
}
