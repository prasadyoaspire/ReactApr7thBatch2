class Account  {
   int accno;
   String name;
   double balance;

   void setAccount(int ano,String aname,double abal) {
      accno = ano;
      name = aname;
      balance = abal;  
   }
   void withdraw(double amount) {
      balance = balance-amount;
   }
   void deposit(double amount) {
     balance = balance+amount;
   }
   void displayAccount() {
      System.out.println("A/c no:"+accno);
      System.out.println("Name:"+name);
      System.out.println("Balance:"+balance);
   }

 }