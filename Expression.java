import java.util.Scanner;
    class Expression
    {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
    int b= a-- - --a;
    int c=a--;
    int d=a>>2;
    int e=a&b;
    System.out.println(" a-- - --a is:");
    System.out.println(b);
    System.out.println("a-- is:");
    System.out.println("c");
    System.out.println("a>>2 is:");
    System.out.println("d");
    System.out.println("a&b is:");
    System.out.println("e");
    }
  }
  
  
  
  
    
