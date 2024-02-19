import java.util.*;
class chsort
{
   public static void main(String[] args)
   {
       String s;
	   int i;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a string");
	   s=sc.nextLine();
	   int n=s.length();
	   int a[]=new int[20];
	   for(i=0;i<n;i++)
	   {
	   a[i]=(int)s.charAt(i);
	   }
	   for( i=0;i<n-1;i++)
	   {
	       for(int j=0;j<n-i-1;j++)
		   {
			   if(a[j]>a[j+1])
			   {
			      int temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
				}
			}
		}
		System.out.println("alphabatically order is :       ");
		String p="";
		for(int k=0;k<n;k++)
		{
		     char z=(char)a[k];
			 p=p+z;
		}
		System.out.println(p);
	}
}