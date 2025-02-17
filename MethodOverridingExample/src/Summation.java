//child
public class Summation extends Addition {

	public void welcome() {
		System.out.println("Welcome to spring");
	}

//	@Override
//	public void add(int a, int b) {
//		int x = a - b;
//		System.out.println(x);
//	}
	
	@Override
	public void add(int a, int b) {
		super.add(a, b);
		int x = a - b;
		System.out.println(x);
	}
}
