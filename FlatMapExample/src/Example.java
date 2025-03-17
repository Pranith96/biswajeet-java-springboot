import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {

		List<Integer> grade1 = Arrays.asList(20, 43, 25, 65);
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("ABC");
		s1.setAge(20);
		s1.setStatus("ACTIVE");
		s1.setGrades(grade1);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Xyz");
		s2.setAge(15);
		s2.setStatus("ACTIVE");
		s2.setGrades(Arrays.asList(32, 43, 68, 65));

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("PQR");
		s3.setAge(19);
		s3.setStatus("INACTIVE");
		s3.setGrades(Arrays.asList(20, 23, 40, 65));

		Student s4 = new Student(4, "ABC", 18, List.of(20, 30, 40), "INACTIVE");
		Student s5 = new Student(5, "ABC", 28, List.of(80, 70, 40), "ACTIVE");

		List<Student> list = List.of(s1, s2, s3, s4, s5);

		flatMapExample(list);
		convertListToMap(list);
		groupingByOperation(list);
	}

	private static void groupingByOperation(List<Student> list) {
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getName));
		System.out.println(map);
		System.out.println(map.get("ABC"));

		// List of Adddess, city --> List<Address>
	}

	private static void convertListToMap(List<Student> list) {
		Map<Integer, Student> map = list.stream()
				.collect(Collectors.toMap(student -> student.getId(), student -> student));
		System.out.println(map);

		Map<Integer, Student> map1 = list.stream()
				.collect(Collectors.toMap(student -> student.getId(), Function.identity()));
		System.out.println(map1);

		map1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getAge)))
				.collect(Collectors.toList());
	}

	private static void flatMapExample(List<Student> list) {
		System.out.println(list);

		List<Integer> grades = list.stream().flatMap(data -> data.getGrades().stream()).collect(Collectors.toList());
		System.out.println(grades);

		List<Integer> grades1 = list.stream().flatMap(data -> data.getGrades().stream()).sorted()
				.collect(Collectors.toList());
		System.out.println(grades1);

		List<Integer> grades2 = list.stream().flatMap(data -> data.getGrades().stream())
				.sorted((x, y) -> y.compareTo(x)).distinct().collect(Collectors.toList());
		System.out.println(grades2);
	}
}

//Optional.of, Optional.ofNullable, 
