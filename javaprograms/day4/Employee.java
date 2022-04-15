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