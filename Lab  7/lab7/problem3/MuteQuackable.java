package problem3;

public interface MuteQuackable extends Quackable {
	@Override
	default void quack() {
		// TODO Auto-generated method stub
		System.out.println("  cannot quack");
	}
}
