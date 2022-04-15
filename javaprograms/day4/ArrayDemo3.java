class ArrayDemo3 {

   public static void main(String[] args) {
       
       Employee emp1 = new Employee(101,"aaa",5000);
       Employee emp2 = new Employee(102,"bbb",4000);
       Employee emp3 = new Employee(103,"ccc",5000);
       Employee emp4 = new Employee(104,"ddd",6000);

       Employee[] emps = new Employee[4];
       emps[0] = emp1;
       emps[1] = emp2;
       emps[2] = emp3;
       emps[3] = emp4;

       for(int i=0;i<emps.length;i++) {
         // System.out.println(emps[i]);
          emps[i].displayEmp();

       }
   }

}