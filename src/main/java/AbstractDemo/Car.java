package AbstractDemo;

public class Car implements Engine,Wheels {

	@Override
	public void startEngine() {
		System.out.println("Car Engine is start....");
		
	}

	@Override
	public void Noofwheels() {
		System.out.println("Car is 4 wheelers...");
		
	}
	

}
