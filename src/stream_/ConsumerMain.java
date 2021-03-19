package stream_;

import java.util.function.Consumer;

public class ConsumerMain {
	/*
	 * Thao tác trên đối số đã cho
	 * 
	 * void accept(T t)  là phương thức trừu tượng có thể được sử dụng với lambda expression hoặc method reference cho một mục đích cụ thể nào đó
	 * Phương thức accept() thực hiện 1 hành động cụ thể nào đó trên đối số đã cho
	 * 
	 * 
	 * default Consumer<T> andThen(Consumer<?super T> after): phương thức này trả về 1 Consumer thực hiện 2 hành động theo thứ tự, trước tiên là 
	 * hành động của Consumer mà phương thức được gọi và theo sau bởi hành động của Consumer được truyền với đối số
	 */
	
	public static void printValue(int value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String name) {
				// TODO Auto-generated method stub
				System.out.println("Hello, " + name);
			}
		};
		
		consumer.accept("thangnd");
		
		Consumer<String> consumer1 = (name) -> System.out.println(name);
		consumer1.accept("thangnd123");
		
		Consumer<Integer> consumer2 = ConsumerMain::printValue;
		consumer2.accept(123123);
	}


}
