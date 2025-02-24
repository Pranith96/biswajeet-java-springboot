
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Example ex1 = new Example();
		ex1.start();
		ex1.join();
		Example ex2 = new Example();
		ex2.start();
	}
}
