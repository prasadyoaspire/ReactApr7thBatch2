  class A {
       void m1() {
           System.out.println("m1 inside A");
       }
    }

    class B extends A {
    
      void m1() {
           System.out.println("m1 is overridden inside B");
       }

     void m2() {
         System.out.println("m2 inside B");
      }
    }

class SuperRefSubObjDemo {

  public static void main(String[] args) {

    A a1= new B();
    a1.m1();   
  }
 }