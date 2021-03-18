package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class Opearation {

	//filter 
	public static  void FileterExample() {
		Stream.iterate(1, count -> count + 1).limit(10)
				.filter(number -> number % 2 == 0)
				.forEach(System.out::println);
		long count = Stream.iterate(1, i -> i + 1).limit(10)
				.filter(number -> number % 2 == 0).count();
		System.out.println("count value: " + count);
	}
	//skip, limit;
	public static void LimitStream() {
		List<String> data = Arrays.asList("1","2","3", "4", "5");
		data.stream().skip(1).limit(3).forEach(System.out::println);
	}
	//map
	public static void MapStream() {
		List<String> data = Arrays.asList("a","b","c", "d", "e");
		data.stream().map(String::toUpperCase).forEach(System.out::print);
	}
	//sort
	public static void SortStream() {
		List<String> data = Arrays.asList("a","c","b","a");
		data.stream().sorted().forEach(System.out::println);
		System.out.println("--------------------------------------");
		data.stream().sorted((s1,s2)-> s2.length() - s1.length()).forEach(System.out::println);
		
		List<Integer> data1 = Arrays.asList(1,4,5,3,5,10,6,12);
		data1.stream().sorted((s1,s2)-> s1-s2).forEach(System.out::println);
		System.out.println("--------------------------------------");
		data1.stream().sorted((s1,s2)-> s2-s1).forEach(System.out::println);
		
	}
	
	
	
	public static void main(String[] args) {
//		FileterExample();
//		LimitStream();
//		MapStream();
//		SortStream();
		BiFunction< Integer, Integer, Double> func1 = (a1, a2) -> Math.pow(a1, a2);
		Function<Double, String> func2 = (input) -> "Result " + String.valueOf(input);
//		String result = func1.andThen(after)
	}
	
}
