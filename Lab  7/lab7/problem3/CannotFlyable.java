package problem3;

public interface CannotFlyable extends Flyable {
	default void fly() {
		System.out.println("  cannot fly");
	}

}
