interface SimpleCalc {
 	
	int add(int a, int b);
 	int i = 10;
 }

class Calc implements SimpleCalc {
	
	public int add(int a, int b){
	   return a + b;
	}
}

class InterfaceDemo {

   public static void main(String[] args) {

    Calc cal = new Calc();

    int result =  cal.add(20,30);

    System.out.println("Result:"+result);
  }
 }