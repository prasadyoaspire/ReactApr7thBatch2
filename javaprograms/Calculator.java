
 class Calculator {

   public static void main(String[] args) {

     int a = 10;
     int b = 20;    

     sum(a,b); //method calling for void type

     int result = multiple(a,b);  // method calling for int return type

     System.out.println("Result:"+result);
  }
   
   static void sum(int x, int y) {  // method definition
   
      int c = x+y;

     System.out.println("Sum:"+c);
   }  

   static int multiple(int x, int y) {  // method definition

    int z = x*y;

    return z;
  }

}








