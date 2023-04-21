package AbstractDemo;

public class Bike implements Engine, Wheels {

	@Override
	public void startEngine() {
	System.out.println("Bike engine is started..");

	}

	@Override
	public void Noofwheels() {
       System.out.println("Car is two wheelers...");
	}

}
