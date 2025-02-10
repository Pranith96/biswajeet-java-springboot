
public class Example {

	public void displayNum(int num) {
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}

	public void displayEvenNum(int num) {
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
