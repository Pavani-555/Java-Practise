import java.util.Scanner;
class ATM
  {
    int balance;
    void withdraw(int amt)
    {
      if(balance>amt)
      {
        balance>=balance_amt;
        System.out.println("Withdraw Sucessfully");
        else
      {
        System.out.println("Insufficient balance");
        }
      }
    void deposit(int amt)
    {
      balance=balance+amt;
      System.out.println("Deposit Sucessfully");
      }
    void check Balance()
    {
      System.out.println("Balance");
    }
  }
class Bitlabs
  {
    public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    ATm atm=new ATM();
    atm.balance=100000;
    char ch='y';
    do
    {
      System.out.println("1.withdraw\n 2.Deposit\n 3.CheckBalance");
      System.out.println("Select Option");
      int option=sc.nextInt();
      switch(option)
        {
          case 1:
          System.out.println("Enter amount");
          int amount1=sc.nextInt();
          atm.deposit(amount1);
          break;
          case 2:
          atm.checkBalance();
          break;
          default:
            System.out.println("Invalid option");
        }
      System.out.println("Do you want to continue");
      ch=sc.next().char At(0);
      }
      while(ch=='y');
      }
  }
      
      
            
          
       