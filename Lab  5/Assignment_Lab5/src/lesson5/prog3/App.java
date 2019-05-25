package lesson5.prog3;



public class App {
	public static void main(String[] args) {
		VehicleFactory.getVehicle("bus").startEngine();
		VehicleFactory.getVehicle("car").startEngine();
		VehicleFactory.getVehicle("eleCar").startEngine();
		VehicleFactory.getVehicle("t").startEngine();
	}
}
