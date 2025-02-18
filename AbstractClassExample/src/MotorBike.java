
public abstract class MotorBike extends Bike {

	@Override
	public void tire() {

		System.out.println("Inside tire");
	}

	@Override
	public void petrolTank() {
		System.out.println("inside petrol tank");

	}

	public abstract void mirror();

	public abstract void stand();

}
