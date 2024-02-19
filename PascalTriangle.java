import java.util.*;
class PascalTriangle{
          static int fact(int x)
		  {
		     if(x==0||x==1)
			 return(1);
			 else
			 return(x*fact(x-1));
		  }
		  public static void main(String[]args)
		  {
		     int i,n,c,x;
			 System.out.println("Enter the nuber of row");
			 Scanner sc=new Scanner(System.in);
			 n=sc.nextInt();
			 for(i=0;i<n;i++)
			 {
			    for(c=0;c<=(n-i-2);c++)
				System.out.print("  ");
				for(c=0;c<=i;c++)
				System.out.print("   "+fact(i)/(fact(c)*fact(i-c)));				 
				System.out.println();
			 }
		  }
     }
			 