package problem9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
   
    // 1
    public static Optional<Dish>vegeteriandishes=menu.stream().filter(t->t.isVegetarian()).findAny();
    
    //  2
    public static Optional<Dish>caloriesLessthan100= menu.stream().filter(t->t.getCalories()<1000).findAny();
    
    //3
    public static Optional<Dish>caloriesGreaterThan1000=menu.stream().filter(t->t.getCalories()>1000).findAny();
    
    //4
    public static Optional<Dish> firstMeat=menu.stream().filter(t->t.getType().equals(Type.MEAT)).findFirst();
   
    //5
    public static Optional<Integer>total=menu.stream().map(t->t.getCalories()).reduce((a,b)->a+b);
  
    //6
    public static Optional<Integer>totalCalories=menu.stream().map(Dish::getCalories).reduce(Integer::sum);
    
    public static void main(String[] args) {
    	
		System.out.println(vegeteriandishes.isPresent());
		System.out.println(caloriesLessthan100.isPresent());
		System.out.println(caloriesGreaterThan1000.isPresent());
		System.out.println(firstMeat.get());
		System.out.println(total.get());
		System.out.println(totalCalories.get());
	}
    
}