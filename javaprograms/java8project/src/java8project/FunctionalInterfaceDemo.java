package java8project;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		//display string into uppercase
		Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
		consumer.accept("hello World");
		
		BiConsumer<String,String> consumer2 = (s1,s2) -> System.out.println(s1+s2);
		consumer2.accept("Hello", "java");
		
		BiConsumer<Integer,Integer> biConsumer3 = (a,b) -> System.out.println("Sum: "+(a+b));
		biConsumer3.accept(100, 200);
		
		List<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("sql");
		courses.add("c++");
		courses.add("git");
		
		String couseName = "sql";
		
		courses.forEach(c-> {
			
			System.out.println(c);
		});
			

	}

}
