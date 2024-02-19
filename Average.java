import java.util.*;
class Average{
      public static void main(String[]args)
      {
          float avg;
		  int []a=new int [10];
		  int s=0,i;
		  System.out.println("Enter the values of cell");
		  Scanner sc=new Scanner (System.in);
		  int n=sc.nextInt();
		  System.out.println("Enter the value of array");
		  for(i=0;i<n;i++)
		     a[i]=sc.nextInt();
		  for(i=0;i<n;i++)
		     s=s+a[i];
		  avg=s/n;
		  System.out.println("avg="+avg);
	  }
	}
		      