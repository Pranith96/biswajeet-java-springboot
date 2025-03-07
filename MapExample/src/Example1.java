import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
		Student st4 = new Student();
		st4.setId(1);
		st4.setName("ABC");
		st4.setAge(13);
		
		Student st5 = new Student();
		st5.setId(1);
		st5.setName("XDC");
		st5.setAge(15);

		Set<Student> list = new HashSet<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		System.out.println(list);

	}
}
