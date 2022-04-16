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

  class OverridingDemo {
   public static void main(String[] args) {

      Circle circle = new Circle();
      circle.area();

      Triangle triangle = new Triangle();
      triangle.area();
  }
 }

