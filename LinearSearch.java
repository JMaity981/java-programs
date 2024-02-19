import java.util.*;
class LinearSearch{
     public static void main(String[] args)
     {
          int flag=0,i;
          int []a=new int [10];
          System.out.print("How many number u like to use: ");
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      System.out.print("Enter values of array: ");
	      for(i=0;i<n;i++)
	      {
	        a[i]=sc.nextInt();
	      }
          System.out.print("Enter the value that u want to search: ");
          int key=sc.nextInt();
          for(i=0;i<n;i++)
          {
             if(a[i]==key)
			 {
	         flag=1;
		     break;
			 }
          }
          if(flag==1)
              System.out.println("Found at the possition:"+(i+1));
          else
              System.out.println("Not found");
   	  }
}
   