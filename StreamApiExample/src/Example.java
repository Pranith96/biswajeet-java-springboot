import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("ABC");
		s1.setAge(20);
		s1.setGender("F");
		s1.setStatus("ACTIVE");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Xyz");
		s2.setAge(15);
		s2.setGender("M");
		s2.setStatus("ACTIVE");

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("PQR");
		s3.setAge(19);
		s3.setGender("M");
		s3.setStatus("INACTIVE");

		Student s4 = new Student(4, "ABC", 18, "F", "INACTIVE");
		Student s5 = new Student(5, "ABC", 28, "F", "ACTIVE");

		List<Student> list = List.of(s1, s2, s3, s4, s5);

		filterData(list);
		mapStream(list);
		streamOperation(list);
		sorting(list);
	}

	private static void sorting(List<Student> list) {

		System.out.println("-----------------Sorted----------------");
		List<Student> lists = list.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
		System.out.println(lists);
		
		List<Student> list1 = list.stream().sorted((x, y) -> x.getAge() - y.getAge()).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Student> list2 = list.stream().sorted(Comparator.comparing(Student::getId).reversed()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Student> list3 = list.stream().sorted(Comparator.comparing(Student::getId).thenComparing(Student::getAge))
				.collect(Collectors.toList());
		System.out.println(list3);
		
		List<Student> list4 = list.stream().sorted(Comparator.comparing(Student::getId)).limit(3)
				.collect(Collectors.toList());
		System.out.println(list4);
		

		List<Student> list5 = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(2).skip(1)
				.collect(Collectors.toList());
		System.out.println(list5);
		
		Optional<Student> list6 = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).skip(1).findFirst();
		System.out.println(list6.get());
		
		//[[1,2,3],[],[]] --> flatmap
		//AnyMatch, AllMatch, Flatmap, reduce, groupingBy
	}

	private static void streamOperation(List<Student> list) {

		Student lists = list.stream().max(Comparator.comparing(Student::getAge)).get();
		System.out.println(lists);

		Student list2 = list.stream().max((x, y) -> x.getAge() - y.getAge()).get();
		System.out.println(list2);

		Student list3 = list.stream().min(Comparator.comparing(Student::getAge)).get();
		System.out.println(list3);

		Student list4 = list.stream().min((x, y) -> x.getAge() - y.getAge()).get();
		System.out.println(list4);
	}

	private static void mapStream(List<Student> list) {

		List<String> list1 = list.stream().map(s -> {
			return s.getName();
		}).collect(Collectors.toList());
		System.out.println(list1);

		Set<String> list2 = list.stream().map(s -> {
			return s.getName();
		}).collect(Collectors.toSet());
		System.out.println(list2);

		List<Integer> list3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> records = list3.stream().map(data -> data * 5).collect(Collectors.toList());
		System.out.println(records);

		Set<String> newrecords = list.stream().filter(s -> s.getAge() > 18).map(y -> {
			return y.getName();
		}).collect(Collectors.toSet());
		System.out.println(newrecords);
	}

	private static void filterData(List<Student> list) {

		Stream<Student> stream = list.stream().filter(s -> s.getStatus().equals("ACTIVE"));
		List<Student> records = stream.collect(Collectors.toList());
		System.out.println(stream);
		System.out.println(records);

		Set<Student> newrecords = list.stream().filter(s -> s.getAge() > 18).collect(Collectors.toSet());
		System.out.println(newrecords);
	}
}
