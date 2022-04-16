class Shape {
   void area() {
    System.out.println("Shape area ....");
  }
 }

 class Circle extends Shape {
   void area() {
    System.out.println("Circle area ...");
  }
 }

 class Triangle extends Shape {
   void area() {
    System.out.println("Triangle area ...");
  }
 }

  class DynamicMethodDispatchingDemo {
   
    public static void main(String[] args) {
 
        String choice = args[0];

        Shape shape = null;

        if(choice.equals("circle")) {            
          shape = new Circle();         
        }
        else if(choice.equals("triangle")) {
          shape = new Triangle();          
        }
        else {
           System.out.println("Invalid option");
        }  

        if(shape!=null) {
            shape.area();   
        }       
    }
 }

