import java.util.*;
class InsertionSort{
        public static void main(String[]args)
		{ 
		    int []a=new int [10];
			int i,j,key;
			System.out.println("How many number u like to use");
			   Scanner sc=new Scanner(System.in);
			   int n= sc.nextInt();
			System.out.println("Enter the numbers");
			   for(i=0;i<n;i++)
			      a[i]=sc.nextInt();
               for(j=1;j<n;j++)
               {
                  key=a[j];
                  i=j-1;
                  while((i>-1)&&(a[i]>key))
                  {
	                 a[i+1]=a[i];
	                 i=i-1;
                  }
                  a[i+1]=key;
               }

			 System.out.println("Sorted array is");
			 for(i=0;i<n;i++)
			 System.out.print("\t"+a[i]);
		}
	}	
			