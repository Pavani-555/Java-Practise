class Countdigits
  {
    public static void main(String args[])
    {
      int Count=0, num=0003452;
      while(num !=0)
        {
          num /=10;
          ++Count;
          }
      System.out.println("Number of  digits:" +Count);
      }
  }
          
          
       