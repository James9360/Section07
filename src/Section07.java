import java.util.HashSet;
import java.util.Set;

/*
 * HashSets with user defined objects and generic types
 */
public class Section07 {

	public static void main(String[] args) {
		
		//Part 2: Simple user defined type
		Set<Person> people = new HashSet<>();
		Person person1 = new Person(1, "Grace", "Hopper");
		Person person2 = new Person(2, "Anita", "Borg");
		Person person3 = new Person(3, "Alan", "Turing");
		people.add(person1);
		people.add(person2);
		people.add(person3);
		System.out.println("HashSet with a user defined type, Person:\n" + people);
		
		// Elements that are equal must be ignored.
		Person person1same = new Person(1, "Grace", "Hopper");
		people.add(person1same);
		System.out.println("\nThe same set after trying "
				+ "to add duplicates:\n" + people);
		
		// PART 3: MyBag is a generic class so it can hold any type.
		// E is replaced with the concrete type, Integer.
		
		Set<MyBag<Integer>> bagOfInts = new HashSet<>();
		MyBag<Integer> int1 = new MyBag<>(100);
		MyBag<Integer> int2 = new MyBag<>(200);
		MyBag<Integer> int3 = new MyBag<>(300);
		bagOfInts.add(int1);
		bagOfInts.add(int2);
		bagOfInts.add(int3);
		// Duplicate values must be ignored.
		MyBag<Integer> int1same = new MyBag<>(100);
		bagOfInts.add(int1same);
		System.out.println("\nMyBag as a generic type, using ints:\n" + bagOfInts);
		
		// Another example using generics. E is replaced with String
		Set<MyBag<String>> bagOfStrs = new HashSet<>();
		MyBag<String> str1 = new MyBag<>("abc");
		MyBag<String> str2 = new MyBag<>("rst");
		MyBag<String> str3 = new MyBag<>("xyz");
		bagOfStrs.add(str1);
		bagOfStrs.add(str2);
		bagOfStrs.add(str3);
		System.out.println("\nMyBag as a generic type, using strings:\n" + bagOfStrs);
		
	}
	
}
