class Bank {

  public static void main(String[] args) {

   Account acc1 = new Account();
   acc1.accno = 101;
   acc1.name = "Krish";
   acc1.balance = 50000;

   acc1.withdraw(5000);

   System.out.println("Final Balance: "+acc1.balance);
 }

}







