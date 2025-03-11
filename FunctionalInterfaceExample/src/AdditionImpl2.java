
public class AdditionImpl2 implements Addition {

	@Override
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void hello() {
		System.out.println("hello impl");
	}
	
}
