class Account  {

   int accno;
   String name;
   double balance;

   void withdraw(double amount) {
      balance = balance-amount;
   }

  void deposit(double amount) {
     balance = balance+amount;
  }

 }