package optional;

import java.util.Optional;

public class OptionalEx1 {
	
	public void java8() {
		Student student = getStudent();
		Optional<Student> opt = Optional.of(student);
		opt.ifPresent(s -> System.out.println(s));
	}
	
	private Student getStudent() {
		Student student = new Student();
		student.setName("thangnd");
		return student;
	}
	public static void main(String[] args) {
		OptionalEx1 ex1 = new OptionalEx1();
		ex1.java8();
	}

}
