import java.util.Scanner;
class PrimeorNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the range");
      int n=sc.nextInt();
      int count=0;
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
            }
          }
      if(count==2)
      {
        System.out.println("prime number");
        }
        else
      {
        System.out.println("its not");
        }
      }
  }
     