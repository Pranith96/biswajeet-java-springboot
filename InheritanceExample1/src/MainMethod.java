
public class MainMethod {

	public static void main(String[] args) {
		Summation sm = new Summation();
		sm.welcome();
		sm.add(10, 20);
		sm.display();

		System.out.println("........................");
		Subtraction sb = new Subtraction();
		sb.add(10, 20);
		sb.display();
		sb.sub(20, 10);
	}
}
