
public class Example2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { // Rows
			for (int j = 0; j <= i; j++) { // Columns 0-3, 1-3, 2-3, 3-3
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 4; i++) { // Rows
			for (int j = i; j < 4; j++) { // Columns 0-3, 1-3, 2-3, 3-3
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
