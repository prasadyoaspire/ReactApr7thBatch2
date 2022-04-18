abstract class Shape {
 abstract double area(); 
 }

 class Circle extends Shape {
   
   private int radius;

   Circle(int radius) {
    this.radius = radius;
   }

   double area() {    
    double result = 3.14*radius*radius;
    return result;
  }
 }

 class Triangle extends Shape {
   
    private int base;
    private int height;

    Triangle(int base,int height) {
      this.base = base;
      this.height = height;
    }
  
   double area() {
    double result = 0.5*base*height;
    return result;
  }
 }

 class AbstractClassDemo {
   
    public static void main(String[] args) {
 
       Shape shape = null;

       shape = new Circle(5);

       double circleArea = shape.area();

       System.out.println("Circle Area:"+circleArea);

       shape = new Triangle(5,3);

       double triangleArea = shape.area();

       System.out.println("Triangle Area:"+triangleArea);
       
    }
 }

