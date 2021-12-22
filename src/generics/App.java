package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		//using generic class
		Container<String, Integer> container = new Container<>("Hello", 100);
		
		String val1 = container.getItem1();
		Integer val2 = container.getItem2();
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("computer");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("keyboard");
		
		Set<String> resultSet = union(mySet1, mySet2);
		
		// Iterator is another way to iterate over COLLECTIONS instead of for loop
		Iterator<String> itr = resultSet.iterator();
		while (itr.hasNext()) {
			String var = itr.next();
			System.out.println(var);
		}
		
		
	}
	
	
	
	// How to create a Generic method 
	//<E> (Element)--> Generic type parameter, that means generic and usable for any data type 
	public static <E, canBeAnyLetterOrWord> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
		
		
		
	}

}
