
public class MainMethod {

	public static void main(String[] args) {
		Example ex = new Example();
		ex.add();
		ex.add(10, 20);
		ex.add(10, "Welcome");
		ex.add(10, 20, 200L);
	}
}
