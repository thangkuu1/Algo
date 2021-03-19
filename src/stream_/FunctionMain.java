package stream_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import module.Member;
import module.User;

public class FunctionMain {
	
	/*
	 * Function<T,R> -> chuyển đổi đối tượng từ 1 kiểu dữ liệu này sang dữ liệu khác một cách dễ dàng
	 * Function<V,R> compose(Function<? super V, ? extends T> before): Phương thức trả về 1 function gộp mà nó đã áp dụng lên đối số đầu vào
	 * 																	sau đó áp dụng lên đối số đầu ra
	 * Function<T, V> andThen(Function<? super V, ? extends T> before): trả về 1 function gộp mà nó đã áp dụng function lên dữ liệu đầu vào và 
	 * 																	sau đó áp dụng tiếp after function lên kết quả đầu ra
	 * Function<T, T> identity(): phương thức trả về 1 function luôn trả về đối số đầu vào của nó.
	 * 
	 */
	//convert String to number
	public static Integer convertNumber(String number) {
		Function<String, Integer> value = (v) -> Integer.parseInt(v);
		return value.apply(number);
	}
	//convert localdate to string with pattern
	public static String convertDate(LocalDate localDate, String pattern) {
		Function<LocalDate, String> date = (d) -> d.format(DateTimeFormatter.ofPattern(pattern));
		return date.apply(localDate);
	}
	//convert object to object
	public static Member convertMember(User user) {
		Function<User, Member> convert = (u) -> new Member(u.getUser(), u.getEmail());
		return convert.apply(user);
	}
	//convert List<A> to List<B>
	public static List<Member> convertListMember(List<User> listUser){
		Function<User, Member> convert = (u) -> new Member(u.getUser(), u.getEmail());
		return listUser.stream().map(convert).collect(Collectors.toList());
		
	}
	
	

	public static void main(String[] args) {
//		convertNumber("1231");
		System.out.println(convertDate(LocalDate.now(), "dd/MM/yyyy"));
		User user = new User();
		user.setUser("thang");
		user.setEmail("dinhthanghust@gmail.com");
		user.setPassword("axvfedg112ssdawdcxv");
		User user1 = new User();
		user1.setUser("duc");
		user1.setEmail("dinhduchmu92@gmail.com");
		user1.setPassword("23123@123ds");
		List<User> listUser = Arrays.asList(user, user1);
		List<Member> listMember = convertListMember(listUser);
		listMember.forEach(System.out::println);
		Member m = convertMember(user);
		System.out.println(m.toString());
	}
}
