package learn3;
import java.util.*;


public class SetTreeDemo {
	

	  public static void main(String[] args) {
	    // Create a new TreeSet
	    TreeSet<Integer> numbers = new TreeSet<>(new DescendingComparator());

	    // Add some elements to the TreeSet
	    numbers.add(10);
	    numbers.add(5);
	    numbers.add(20);
	    numbers.add(15);

	    // Print the elements in descending order
	    
	      System.out.println(numbers);
	    
	  }
	}

	class DescendingComparator implements Comparator<Integer> {
	  public int compare(Integer num1, Integer num2) {
	    // Sort the numbers in descending order
	    return num2.compareTo(num1);
	  }
	}


