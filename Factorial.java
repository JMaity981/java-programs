import java.util.*;
class Factorial{
        static int fact(int n)
		{
		  if(n==0||n==1)
		    return(1);
		  else
		    return(n*fact(n-1));
		}
		public static void main(String[]args)
		{
		   int y,x;
		   System.out.println("Enter the number");
		   Scanner sc=new Scanner(System.in);
		    x=sc.nextInt();
		    y=fact(x);
		   System.out.println("Result is:"+y);
		}
	}
	