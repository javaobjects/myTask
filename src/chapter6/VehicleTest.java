package chapter6;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("benz", "black");
		System.out.println(vehicle);
		vehicle.run();
	}
}
