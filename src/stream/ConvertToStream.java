package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ConvertToStream {
	
	public static void streamFromArray() {
		String [] languages =  {"Vietname", "English", "Java", "C#"};
		Stream<String> test1 = Arrays.stream(languages);
		System.out.println("----------------");
		test1.forEach(x -> System.out.println(x));
		
		Stream<String> test2 = Stream.of(languages);
		System.out.println("----------------");
		test2.forEach(x -> System.out.println(x));
		
	}
	public static void streamFromCollection() {
		List<String> items = new ArrayList<String>();
		items.add("Vietnam");
		items.add("English");
		items.add("java");
		items.add("c#");
		System.out.println("----------------");
		items.stream().forEach(x -> System.out.println(x));
	}
	
	public static void streamUsingGenanrate() {
		Stream<String> stream = Stream.generate(() -> "thangnd").limit(10);
		String[] test = stream.toArray(String[]:: new);
		System.out.println("----------------");
		System.out.println(Arrays.toString(test));
	}
	
	public static void streamUsingIterate() {
		Stream<Long> iterateNumber = Stream.iterate(1L, n -> n + 1).limit(30);
		System.out.println("----------------");
		iterateNumber.forEach(x -> System.out.println(x));
	}
	public static void streamUsingRegex() {
		String str = "Thang,Nguyen,Dinh";
		Pattern.compile(",").splitAsStream(str).forEach(System.out::print);
		
	}
	public static void main(String[] args) {
//		streamFromArray();
//		streamFromCollection();
//		streamUsingGenanrate();
//		streamUsingIterate();
		streamUsingRegex();
	}

}
