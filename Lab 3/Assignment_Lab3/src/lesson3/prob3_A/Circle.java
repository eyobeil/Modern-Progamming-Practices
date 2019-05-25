package lesson3.prob3_A;

public class Circle extends Cylinder {

	public Circle(double radius) {
		super(radius, 0);
	}

	public double computeArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	public static void main(String[] args) {
		System.out.println(new Cylinder(2, 3).computeVolume());
		System.out.println(new Circle(1).computeArea());

	}

}