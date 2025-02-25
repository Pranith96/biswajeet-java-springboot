public class Main {

	public static void main(String[] args) {

		// primitive to object without autoboxing
		int i = 10;
		Integer in = Integer.valueOf(i);
		System.out.println(in);

		Integer in2 = i;
		System.out.println(in2);

		long l = 20l;
		Long l1 = Long.valueOf(l);
		System.out.println(l1);

		Long l2 = l;
		System.out.println(l2);

		// Object to primitive conversion without unboxing

		Integer in3 = new Integer(5);
		int aa = in3.intValue();
		System.out.println(aa);

		int aa1 = in3;
		System.out.println(aa1);

		Long ll = new Long(123l);
		long l3 = ll.longValue();
		System.out.println(l3);

		long l5 = ll;
		System.out.println(l5);
	}
}
