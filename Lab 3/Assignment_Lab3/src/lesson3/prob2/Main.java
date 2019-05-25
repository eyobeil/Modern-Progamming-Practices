package lesson3.prob2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Apartment[] apart1 = { new Apartment(350), 
				new Apartment(600), 
				new Apartment(700) };
		
		Apartment[] apart2 = { new Apartment(100), 
				new Apartment(300), 
				new Apartment(800) };

		
		
		
		
		Building[] building = { new Building(150, Arrays.asList(apart1)), new Building(175, Arrays.asList(apart2))};

		Landlord ll = new Landlord(Arrays.asList(building));
		System.out.println(ll.profitCalculation());

	}
}
