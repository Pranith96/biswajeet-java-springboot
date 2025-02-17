
public class MainMethod {

	public static void main(String[] args) {
		Summation sm = new Summation();
		sm.welcome();
		sm.add(50, 20); // parent --> 70, child --> 30
		sm.display();
		
		Addition ad = new Summation(); // runtime polymorphsim
		ad.add(20, 20);
		//ad.welcome();
		ad.display();
	}
}
