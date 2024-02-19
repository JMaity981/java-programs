import java.util.*;
class Nonfebonacci
{
   public static void main(String[]args)
   {
     int i=0,j=1,k,p,n;
	 
	 System.out.println("Enter the limits");
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 k=i+j;
	 while(k<=n)
	 {
	  for(p=j+1;p<k;p++)
	  {  
	    int flag=0;
	    for(int x=2;x<p;x++)
		{
		  if(p%x==0)
		  flag=1;
		}
         if(flag==0)		
	     System.out.println(p);
		 }
	  i=j;
	  j=k;
	  k=i+j;
	 }
	 for(p=j+1;p<=n;p++)
	 {
	    int flag=0; 
	    for(int x=2;x<p;x++)
		{
		  if(p%x==0)
		  flag=1;
		}
         if(flag==0)
		 
     System.out.println(p);
    }	 
    }
}
	 