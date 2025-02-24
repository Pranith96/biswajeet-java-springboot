
public class ThreadClass1 extends Thread {

	Example1 example;

	ThreadClass1(Example1 example) {
		this.example = example;
	}

	public void run() {
		example.printNum(5);
	}
}
