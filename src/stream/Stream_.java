//package stream;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//import java.util.stream.Stream;
//
//public class Stream_ {
//
//	public static void main(String[] args) throws IOException {
//
//		String contents = new String(Files.readAllBytes(Paths.get("D:\\test.txt")), StandardCharsets.UTF_8);
//		List<String> words = List.of(contents.split("\\PL+"));
////		Long count = words.stream().filter(w -> w.length() > 12).count();
////		System.out.println("count value: " + count);
////		Long count_ = words.stream().parallel().filter(w -> w.length() > 12).count();
////		System.out.println("count_ value: " + count_);
//
//		Stream<String> lowStream = words.stream().map(s -> s.toUpperCase());
//		lowStream.forEach(s -> System.out.println(s));
//
//
////		Stream<Stream<String>> result = words.stream().map(w -> codePoints(w));
////		Stream<String> flatResult = words.stream().flatMap(w -> codePoints(w));
////		flatResult.forEach(s -> System.out.print(s));
//		Object[] powers = Stream.iterate(2.0, p -> p * 2).peek(e -> System.out.println("Fetching " + e)).limit(20).toArray();
//		System.out.println(powers.toString());
//	}
//
//
//	public static Stream<String> codePoints(String s){
//		List<String> result = new ArrayList<>();
//		int i = 0;
//		while (i < s.length()) {
//			int j = s.offsetByCodePoints(i, 1);
//			result.add(s.substring(i , j));
//			i = j;
//		}
//		return result.stream();
//	}
//
//}
