package java8project;

public class FaxFinderMain {

	public static void main(String[] args) {
		
		//option 1:
		
//		MaxFinder maxFinder = new MaxFinderImpl();
//		int result = maxFinder.findMax(60, 20);
//		System.out.println("Max: "+result);
		
		//option 2:
		
//		MaxFinder maxFinder2 = new MaxFinder() {
//
//			@Override
//			public int findMax(int num1, int num2) {
//				int max = num1>num2 ?num1:num2;
//				return max;
//			}			
//		};
//		
//		int result2 = maxFinder2.findMax(60, 20);
//		System.out.println("Max: "+result2);
		
		//option 3.
		
		MaxFinder maxFinder3 = (a,b) -> {
			int max = a > b ? a : b;
			return max;
		};
		
		int result3 = maxFinder3.findMax(60, 20);
		System.out.println("Max: "+result3);
	}

}
