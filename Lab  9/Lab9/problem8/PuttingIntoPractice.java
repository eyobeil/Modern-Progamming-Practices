package problem8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		
		transactions.stream().filter(t->t.getYear()==2011).
		sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
	    
        // Query 2: What are all the unique cities where the traders work?
		List<Trader>list=Arrays.asList(raoul,mario,alan,brian);
		list.stream().map(x->x.getCity()).distinct().forEach(System.out::println);;
        

        // Query 3: Find all traders from Cambridge and sort them by name.
        list.stream().filter(x->x.getCity().equals("Cambridge")).
        sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
      System.out.println(list.stream().map(x->x.getName()).sorted().
      collect(Collectors.joining(",")));

        // Query 5: Are there any trader based in Milan?
      Optional<Trader> traderInMilan=list.stream().filter(t->t.getCity().equals("Milan")).findAny();
      if(traderInMilan.isPresent()) System.out.println("yes"+ traderInMilan.get());
 
        
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
     list.stream().filter(x->x.getCity().equals("Milan")).forEach((Trader t)->t.setCity("Cambridge"));
      System.out.println(list);
        
        // Query 7: What's the highest value in all the transactions?
     DoubleSummaryStatistics result=transactions.stream().
     collect(Collectors.summarizingDouble( Transaction::getValue));
     System.out.println(result.getMax());
    }
}
