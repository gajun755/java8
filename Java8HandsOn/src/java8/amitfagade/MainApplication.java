package java8.amitfagade;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainApplication {

	public static void main(String[] args) {
		
		
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");

		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000),
			new Transaction(raoul, 2011, 200),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700),
			new Transaction(alan, 2012, 950)
		      );
		
		
			//Q1 Find all transactions in the year 2011 and sort them by value (small to high)
		
			List<Transaction> transactions2011 = transactions.stream().filter(x->x.getYear()==2011).collect(Collectors.toList());
		
			//transactions2011.stream().sorted(Comparator.comparing(Transaction::getValue)).forEach(x->System.out.println(x));
			

		//Q2  What are all the unique cities where the traders work?
		//transactions.stream().map(x->x.getTrader().getCity()).distinct().forEach(x->System.out.println(x));;
		
		//Q 3 Find all traders from Cambridge and sort them by name
			
			//transactions.stream().map(x->x.getTrader()).sorted(Comparator.comparing(Trader::getName)).filter(x->x.getCity().equals("Cambridge")).forEach(x->System.out.println(x));
		
	//Q 4 Return a string of all traders’ names sorted alphabetically
			//transactions.stream().map(x->x.getTrader()).sorted(Comparator.comparing(Trader::getName)).forEach(x->System.out.println(x));
			
	
	//Q 5 Are any traders based in Milan?
		
		//System.out.println(transactions.stream().anyMatch(x->x.getTrader().getCity().equals("Milan")));
			
	//Q 6  Print all transactions’ values from the traders living in Cambridge
		//transactions.stream().filter(x->x.getTrader().getCity().equals("Cambridge")).forEach(x->System.out.println(x));
			
	//Q 7. What’s the highest value of all the transactions?
		System.out.println(transactions.stream().max(Comparator.comparing(Transaction::getValue)));
	
	//Q 8 Find the transaction with the smallest value.
		
		System.out.println(transactions.stream().min(Comparator.comparing(Transaction::getValue)));
	
	}

}
