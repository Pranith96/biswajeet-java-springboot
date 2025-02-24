
public class Example2 implements Runnable {

	public void run() {
		for (int i = 0; i <= 15; i++) {
			System.out.println(i);
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());


	}
}