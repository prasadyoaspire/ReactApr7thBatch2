class Employee {

   int empId;
   String name;
   double salary;
   

   Employee(int empId, String name,double salary) {   
    this.empId = empId;
    this.name = name;
    this.salary = salary;
  }

  void displayEmp() {    
   System.out.println("EmployeeId:"+empId);
   System.out.println("Name :"+name);
   System.out.println("Salary:"+salary);
  }

}  

class EmployeeMain {

   public static void main(String[] args) {     
   
   Employee emp1 = new Employee(101,"abc",50000);
   emp1.displayEmp();

   Employee emp2 = new Employee(102,"bbb",60000);
   emp2.displayEmp();

   Employee emp3 = new Employee(103,"ccc",40000);
   emp3.displayEmp();




 }

} 
  

   