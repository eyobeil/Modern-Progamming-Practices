package lesson3.prob2;

import java.util.List;

public class Building {
	
	private double mCosts;
	
	private List<Apartment> apartList;

	public Building(double mCosts, List<Apartment> apts) {
		this.mCosts = mCosts;
		apartList = apts;
	}

	public double profitCalculation() {
		double sumProfit = 0.0;
		for (Apartment apt : apartList) {
			sumProfit += apt.getRent();
		}
		return sumProfit - mCosts;
	}

}
