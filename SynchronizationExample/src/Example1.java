
public class Example1 {

	// public synchronized void printNum(int num) {
	// public static synchronized void printNum(int num) {

	public void printNum(int num) {
		synchronized (this) {
			for (int i = 0; i < num; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		// logic
		// logic
	}
}
