public class test {

  public static void main(String[] args) 
  {
    int n=10,first=0,second=1,next,i;
    System.out.println("Printing first " + n + " numbers in Fibonacci Series \n");
    for(i=0;i<n;i++)
    {
      if(i<=1)
      next=i;
      else
      {
        next = first + second;
        first = second;
        second = next;
      }
    System.out.print(next + "  ");
    }
  }
}
