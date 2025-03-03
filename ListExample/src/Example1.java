import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setId(1);
		st1.setName("ABC");
		st1.setAge(19);
		Student st2 = new Student();
		st2.setId(2);
		st2.setName("ABC");
		st2.setAge(13);
		Student st3 = new Student();
		st3.setId(3);
		st3.setName("XDC");
		st3.setAge(15);

		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);

		System.out.println(list);

		List<Student> newList = Collections.unmodifiableList(list);

		List<Student> list1 = Arrays.asList(st1, st2, st3);

		List<Student> list2 = List.of(st1, st2, st3);

		for (Student s : list) {
			if (s.getName().equals("ABC")) {
				System.out.println(s);
			}
		}
	}
}
