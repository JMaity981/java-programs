import java.util.*;
class BubbleSort{
        public static void main(String[]args)
		{ 
		    int []a=new int [10];
			int i,j,temp;
			System.out.println("How many number u like to use");
			   Scanner sc=new Scanner(System.in);
			   int n= sc.nextInt();
			System.out.println("Enter the numbers");
			   for(i=0;i<n;i++)
			      a[i]=sc.nextInt();
			for(i=0;i<n-1;i++)
			{ 
			     for(j=0;j<n-i-1;j++)
				 {  
				    if(a[j]>a[j+1])
					{
				     temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				    }
		    	 }
			}
			System.out.println("Sorted array is");
			 for(i=0;i<n;i++)
			 System.out.print("\t"+a[i]);
		}
	}	
			