
public class Example3 {

	public void display_3() {
		int i = 20;
		int j = i++ + i++ + ++i - --i + i-- + ++i - --i; // 20 + (20+1)++ + ++(21+1) - 21 + 21 + 22 - 21 == 66
		// 20 + 23 + 22
		System.out.println(j);
	}
}
