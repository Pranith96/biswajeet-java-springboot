import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(5);
		s1.setName("ABC");
		s1.setAge(20);

		Student s2 = new Student(3, "PQR", 25);

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(new Student(1, "xyz", 30));
		list.add(new Student(4, "JLK", 20));
		list.add(new Student(2, "SSDC", 34));

		System.out.println(list);
		Collections.sort(list, new AgeComparator());

		for (Student s : list) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
		}
		
		Collections.sort(list, new IdComparator());
	}
}
