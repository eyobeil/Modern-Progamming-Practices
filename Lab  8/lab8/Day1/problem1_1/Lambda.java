package problem1_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Lambda {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 1, 5, 6, 9);
		list.forEach(s -> System.out.print(s+" "));
		BiFunction<Integer,Integer,Integer>func=(x,y)->2*x-y;
		int z=func.apply(3, 4);
		System.out.println(z);
		BiFunction<Double,Double,Double>fun= new BiFunction<Double,Double,Double>(){

			@Override
			public Double apply(Double x, Double y) {
				// TODO Auto-generated method stub
				return 2*x-y ;
			}
			
		};
		double a= fun.apply(3.0, 5.0);
		System.out.println(a);

	}

}
