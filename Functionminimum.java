import java.util.*;
class FunctionMinimum{
       static void minimum(int []a)
	   {
	      int min=a[0],i;
		   for(i=0;i<a.length;i++)
		   {
		      if(a[i]<a[0])
			  min=a[i];
		   }
		   System.out.println("Minimum number is:"+min);
	   }
	   public static void main(String[]args)
	   {
	       int []b={10,20,30,40};
		   minimum(b);
	   } 
    }	   
		   