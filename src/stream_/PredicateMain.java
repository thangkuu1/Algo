package stream_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
	
	public static void main(String[] args) {
		
		List<String> user = Arrays.asList("Dad", "Mother", "Brother", "Me");
		Predicate<String> p1 = s -> s.startsWith("D");
		Predicate<String> p2 = s -> s.endsWith("e");
//		user.stream().filter(p1.and(p2)).forEach(System.out::println);
//		user.stream().filter(p1.or(p2)).forEach(System.out::println);
		user.stream().filter(p1.negate()).forEach(System.out::println);
		
		
	}

}
