class StringDemo {

  public static void main(String[] args) {

   String st1 = new String("Hello");

   String st2 = new String("Java");

   st1.concat(st2);

   System.out.println(st1);

  StringBuffer st3 = new StringBuffer("Java");

  StringBuffer st4 = new StringBuffer("Program");

   st3.append(st4);

   System.out.println(st3);

 }

}