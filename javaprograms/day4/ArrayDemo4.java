
class ArrayDemo4 {

 public static void main(String[] args) {  

     int[] nums = {10,20,30,40};

     int result = sumOfAll(nums); //method calling
     System.out.println("Sum:"+result);

     int[] ary = multiple(nums); // method calling
     for(int k : ary) {
         System.out.println(k);
     }        
  }
  static int sumOfAll(int[] n) {    
     int sum = 0;
     for(int i=0;i<n.length;i++) {
        sum = sum + n[i];
     }
     return sum;
  }
 static int[] multiple(int[] n) {
    int[] ary = new int[n.length];
    for(int i=0;i<n.length;i++) {
         ary[i] = n[i]*2;
    }  
    return ary;
 }

}