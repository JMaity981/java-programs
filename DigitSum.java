import java.util.*;
class DigitSum{
        public static void main(String[]args)
		{
		      int n,r,s=0;
			  System.out.println("Enter a number");
			  Scanner sc=new Scanner(System.in);
			  int n=sc.nextInt();
			  pp:while(n!=0)
			  { 
			     r=n%10;
				 s=s+r;
                 n=n/10;
			  }
			  if(s>9)
			  {
			     n=s;
				 s=0;
			     goto pp;
			  }
			  System.out.println("sum of digit=:"+s);
			  
		}
    }