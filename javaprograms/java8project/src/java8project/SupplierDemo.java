package java8project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		//display current date in dd/mm/yyyy string format
		
		Supplier<String>  supplier = () -> {
			
			LocalDate date = LocalDate.now();
			String dateString = date.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
			return dateString;
		};
		
		String result = supplier.get();
		System.out.println(result);

	}

}
