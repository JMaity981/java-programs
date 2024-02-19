import java.util.*;
class Series1
{
  public static void main(String[]args)
  {
    double sum=0;
    System.out.println("Enter the limits");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
      sum=sum+(1.0/i);	  
	System.out.println("Sum of the series is:"+sum);
  }
}  