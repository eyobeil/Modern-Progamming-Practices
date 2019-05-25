package problem2;

public class EquilateralTriangle implements Polygon {
	private double side;

	public EquilateralTriangle(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[] { side, side, side };
	}

}
