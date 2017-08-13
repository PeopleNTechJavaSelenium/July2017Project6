package keyword;

public class Car {
    String carModel;
	public Car(String carModel) {
		this.carModel = carModel;
		System.out.println(carModel);
	}
	public void start() {
		System.out.println("It should have start feature in order to move the vehicle");
	}
	public void stop() {
		System.out.println("It must have break feature to stop the vehicle, public safety is our concern");
	}
	
	public void electricCar() {
		System.out.println();
	}
	
}
