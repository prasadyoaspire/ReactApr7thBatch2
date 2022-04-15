class ArrayDemo2 {

   public static void main(String[] args) {
       
      String[] courses = new String[4];
      courses[0] = "java";
      courses[1] = "c++";
      courses[2] = "sql";
      courses[3] = "git";

      for(int i=0;i<courses.length;i++) {
            System.out.println(courses[i]);
      }
      
       //for each loop
      for(String s:courses) {
           System.out.println(s);
      }     
  
   }

}