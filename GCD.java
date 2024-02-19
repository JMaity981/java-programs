import java.util.*;
class GCD{
       public static int gcd(int a,int b){
	      if(b==0)
		  return a;
		else
		  return gcd(b,a%b);
	   }
	   public static void main(String[] args)
	   { 
	        int x,y,z;
			System.out.println("enter two number");
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
			y=sc.nextInt();
                        z=gcd(x,y);
			System.out.println("gcd=" +z);
	   }
	}   