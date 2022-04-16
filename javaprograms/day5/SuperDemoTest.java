class Base {

  int i = 10;
  Base() {
     System.out.println("Base zero args constructor....");
  }  
  Base(int i) {
     System.out.println("Base int args constructor....");
  }

}

class Derived extends Base {

  int j = 20;

  Derived() {
    super(20);
    System.out.println("Derived zero args constructor....");
  }

  Derived(int k) {     
    System.out.println("Derived int args constructor....");
  }

  void m1() {
    System.out.println("i="+i);
    System.out.println("j="+j);
  }
}

class SuperDemoTest {

  public static void main(String[] args) {

     Derived d1 = new Derived(50);
     
  }

 }