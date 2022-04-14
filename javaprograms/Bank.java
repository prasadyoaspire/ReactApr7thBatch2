class Bank {

  public static void main(String[] args) {

   int i; // declaration
   i = 10; // assign value to the var.

   int k = 10; // initialization

   Account acc1 = new Account();  
   acc1.setAccount(111,"Krish",50000);

   System.out.println("A/c details:");
   acc1.displayAccount();
   
   double amount = 5000;
   acc1.withdraw(amount);

   System.out.println("After withdraw:");
  acc1.displayAccount();
   
 }

}







