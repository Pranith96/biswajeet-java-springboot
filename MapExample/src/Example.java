import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Example {

	public static void main(String[] args) {
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(6, "ABC");
		map.put(1, "PQR");
		map.put(2, "ABC");
		map.put(3, null);
		map.put(4, "PQR");
		map.put(1, "ABC");
		map.put(null, "LKJ");
		map.put(8, "XYZ");

		System.out.println(map);

		int count = map.size();
		System.out.println(count);

		map.remove(0);

		System.out.println(map);

		boolean result = map.containsKey(3);
		System.out.println(result);

		boolean result1 = map.containsValue("JHK");
		System.out.println(result1);
		// map.equals(map);

		boolean result12= map.isEmpty();
		System.out.println(result12);

		Set<Integer> records = map.keySet();
		System.out.println(records);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		System.out.println(map.get(3));
		map.remove(3);
		System.out.println(map);
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
}
