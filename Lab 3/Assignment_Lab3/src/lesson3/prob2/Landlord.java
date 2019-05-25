package lesson3.prob2;

import java.util.List;

public class Landlord {

	private List<Building> builList;

	public Landlord(List<Building> bList) {
		builList = bList;
	}

	public double profitCalculation() {
		double sumProfit = 0.0;
		for (Building build : builList) {
			sumProfit += build.profitCalculation();
		}
		return sumProfit;
	}

}
