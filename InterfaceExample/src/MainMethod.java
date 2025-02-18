
public class MainMethod {

	public static void main(String[] args) {
		Bike b = new BikeImpl2();
		b.engine();
		b.mirror();
		b.tire();
		b.petrolTank();
		b.stand();
		
		Bike b1 = new BikeImpl();
		b1.engine();
		b1.mirror();
		b1.tire();
		b1.petrolTank();
		b1.stand();
	}
}
