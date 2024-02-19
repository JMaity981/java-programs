import java.util.*;
class BinarySearch{
         public static void main(String[]args)
		 {
		     int []a=new int [10];
			 int i,key,beg,end,mid;
			 System.out.println("Enter value of cell");
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 System.out.println("Enter values of array");
			 for(i=0;i<n;i++)
			 {
			    a[i]=sc.nextInt();
			 }
			 System.out.println("Enter value that u want to search");
			 key=sc.nextInt();
             beg=0;
             end=n-1;
			 mid=(beg+n)/2;
			 while(a[mid]!=key&&beg<=end)
			 {
			     if(key>a[mid])
				     beg=mid+1;
				 else
				     end=mid-1;
				 mid=(beg+end)/2;
			 }
			 if(a[mid]==key)
			      System.out.println("Found at the possition:"+(mid+1));
			 else
			      System.out.println("Not found");
	     }
	 }