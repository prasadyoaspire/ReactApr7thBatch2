package java8project;

public class InterfaceMain {

	public static void main(String[] args) {
		
		//option-1 
		
		//MyInterface myInterface = new MyClass();		
		
		//myInterface.m1();
		
		//option-2 (using anonymous class)
		
//		MyInterface myInterface = new MyInterface() {
//
//			@Override
//			public void m1() {
//				
//				System.out.println("m1 implemetation ....");
//			}
//			
//		};
//		
//		myInterface.m1();
		
		//option3 (using lambda expression) but we can write lambda expression only for functional interface
		
		MyInterface myInterface = () -> System.out.println("m1 implementation using lambda");
		
		myInterface.m1();
		
		
	}

}
