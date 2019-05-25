package lesson5.prog1;

public class RubberDuck extends Duck {
	public RubberDuck() {
		setQuackBehavior(new Squeak());
		setFlyBehavior(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("Displaying");
		
	}
}