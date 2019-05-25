package lesson5.prog3;

public class VehicleFactory {
	public static Vehicle getVehicle(String v) {
		if (v.equals("bus")) {
			return new Bus();
		} else if (v.equals("car")) {
			return new Car();
		} else if (v.equals("eleCar")) {
			return new ElectricCar();
		} else {
			return new Truck();
		}
	}

}
