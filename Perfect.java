import java.util.Scanner;
class Perfect
  {
    public static void main(String args[])
    Scanner sc=new Scanner(System.in);
    System.out.println("value of n:");
    int n=sc.nextInt();
    int sum=0;
   for(int i=1;i<=6;i++)
  {
    if(n%i==0)
    {
      sum=sum+i;
      }
    }
if(sum==n)
{
  System.out.println("perfect number");
  }
else
{
  System.out.println("its not");
}
}
}
 