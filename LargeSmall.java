import java.util.*;
class LargeSmall{
      public static void main(String[]args)
	  {
	       int []a=new int [10];
		   int i,larg,small;
		   System.out.println("Enter the number of cell");
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   System.out.println("Enter the value of array");
		   for(i=0;i<n;i++)
		       a[i]=sc.nextInt();
		   larg=a[0];
		   small=a[0];
		   for(i=0;i<n;i++)
		   {
		        if(larg<a[i])
				  larg=a[i];
                if(small>a[i])
                  small=a[i];
           }
           System.out.println("Large number is:"+larg+"Small is:"+small);
      }
}	  
		    