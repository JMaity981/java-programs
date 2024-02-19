import java.util.*;
class Reverse{
       public static void main(String[]args)
	   {
	        int n,r,s=0;
			System.out.println("Enter a number");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			while(n!=0)
			{
			    r=n%10;
				s=s*10+r;
				n=n/10;
		    }
			System.out.println("The reverse number is:"+s);
	   }
	}
			 
			