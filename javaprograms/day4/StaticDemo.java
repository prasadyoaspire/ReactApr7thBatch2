class A {

  int i;
  static int counter;

  A() {
   counter++;
  }
  
  static void m1() {
    System.out.println("m1 method...");
  }

}

class StaticDemo {

  public static void main(String[] args) {

    A.m1();

   A a1 = new A();

   System.out.println("Objects of Class A:"+ A.counter);

   A a2 = new A();
  
  System.out.println("Objects of Class A:"+ A.counter);
   
   A a3 = new A();

  System.out.println("Objects of Class A:"+ A.counter);

 }

}