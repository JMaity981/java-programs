import java.util.*;
class PrimeFactor
{
  public static void main(String[]args)
  {
    System.out.print("Enter a number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Prime factor are:");
	for(int i=2;i<=n;i++)
	{
	   if(n%i==0)
	   {
	     int flag=0;
		 for(int j=2;j<i;j++)
		 {
		   if(i%j==0)
		   flag=1;
		 }
		 if(flag==0)
		  System.out.println(i);
	   }
	 }
   }
}   