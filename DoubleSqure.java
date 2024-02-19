import java.lang.*;
import java.util.*;
class DoubleSqure
{
   public static void main(String[]args)
   {  
      System.out.println("Enter a four digit number");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int r=n/100;
	  int s=n%100;
	  int m=r;
	  int v=s;
	  double x=(int)(Math.sqrt(r));
	  double y=(int)(Math.sqrt(s));
	  if(x*x==m && y*y==v)
	     System.out.println("This number is double squre");
	  else
         System.out.println("This number is not double squre");
    }
}	
	  