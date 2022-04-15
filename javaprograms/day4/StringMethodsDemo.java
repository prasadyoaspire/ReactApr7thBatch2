class StringMethodsDemo {

  public static void main(String[] args) {

    String s1 = "Hello Java";

    char ch = s1.charAt(6);

    System.out.println(ch);

    String s2 = "Hello Java. How are you?";

    boolean result1 = s2.contains("Javadfdfd");

    System.out.println(result1);

    String s3 = "This summer is hot";

    String result2 = s3.replace('i', '#');

    System.out.println(result2);

    String s4 = "Hi how are you. Hi how";
   
    String result3 = s4.replace("Hi", "123");

    System.out.println(result3);

    String s5 = "Hi how are you. Hi how";
   
    String result4 = s5.substring(3,8);

    System.out.println(result4);   
    

  }

 }