
public class MainMethod {

	public static void main(String[] args) {
		Example2 ex = new Example2();
		Thread th1 = new Thread(ex);
		th1.start();
		
		Example2 ex1 = new Example2();
		Thread th2 = new Thread(ex1);
		th2.start();
		
		th2.setPriority(8);
		
		Thread th3 = new Thread(ex1);
		th3.start();
		th3.setPriority(2);
		
		th3.setName("ABC");
	}
}
