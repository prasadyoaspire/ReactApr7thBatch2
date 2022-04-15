class StringDemo2 {

  public static void main(String[] args) {

   String st1 = new String("abc");

   String st2 = new String("abc");

  String st3 = st1;

  if(st1 == st2) {
    System.out.println("both refer to same obj");
  }
  else {
     System.out.println("both refer to different obj");
  }

  String s1 = "abc";
  String s2 = "zyx";
  String s3 = "abc";
  
  if(s1==s3) {
   System.out.println("both s1,s2 refer to same obj");
  }
  else {
    System.out.println("both s1,s2 refer to diff obj");
  }
   

 }

}