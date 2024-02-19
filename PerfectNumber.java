import java.util.*;
class PerfectNumber
{
   public static void main(String[]args)
   {
      System.out.print("Enter a number:");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int m=n;
	  int s=0;
	  for(int i=1;i<n;i++)
	  {
	     if(n%i==0)
		   s=s+i;
	  }
      if(m==s)
        System.out.println("This number is perfect number");
	  else
        System.out.println("This number is not perfect number");	  
   }
}   