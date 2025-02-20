
public class MainMethod {
	public static void main(String[] args) {

		Address studentAddress = new Address();
		studentAddress.setaId(12);
		studentAddress.setArea("hjkl");
		studentAddress.setCity("HYD");
		studentAddress.setPlotNo("sdfg456");

		Student st = new Student();
		st.setId(1);
		st.setName("ABC");
		st.setAge(10);
		st.setGender("M");
		st.setAddress(studentAddress);

		System.out.println(st);

		int age = st.getAge();
		System.out.println(age);

		Student st1 = new Student(2, "XYZ", 20, "F");
		System.out.println(st1);
		
		Student[] students = new Student[5];
		students[0] = st;
		students[1] = st1;
		
		Address collegeAddress = new Address();
		collegeAddress.setaId(189);
		collegeAddress.setArea("nara");
		collegeAddress.setCity("HYD");
		collegeAddress.setPlotNo("4567t");

		College cl = new College();
		cl.setCollegeId(121);
		cl.setCollegeName("PLKJ");
		cl.setAddress(collegeAddress);
		cl.setStudent(students);

		String plotNo = cl.getAddress().getPlotNo();
		System.out.println(plotNo);
		
		String city = cl.getStudent()[0].getAddress().getCity();
		System.out.println(city);
		System.out.println(cl);
	}
}
