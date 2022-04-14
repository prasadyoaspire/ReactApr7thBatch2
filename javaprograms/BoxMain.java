class Box {
   int width;
   int depth;
   int height;
   Box() {

   }
   Box(int w,int d, int h) {
      width = w;
      depth = d;
      height = h;
   }
   int calVolume() {
      int vol = width*height*depth;     
      return vol;
   }
 }
class BoxMain {
   public static void main(String[] args) {

    Box box2 = new Box();
    int result2 = box2.calVolume();
    System.out.println("Volume of Box2:"+result2);

    Box box1 = new Box(10,5,5);   
    int result = box1.calVolume();
    System.out.println("Box Volume:"+result);   
  }

}
