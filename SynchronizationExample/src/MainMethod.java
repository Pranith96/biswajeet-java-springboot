
public class MainMethod {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ThreadClass1 th1 = new ThreadClass1(ex);
		th1.start();
		
		ThreadClass1 th2 = new ThreadClass1(ex);
		th2.start();
	}
}
