import java.util.*;
class FeboSeries
{
   public static void main(String[]args)
   {
     int a=0;
	 int b=1;
	 System.out.print("Enter the limit of series:");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.print("Febonacci series:");
	 System.out.print(a+"\t");
	 System.out.print(b+"\t");
	 int c=a+b;
	 while(c<=n)
	 {
	   System.out.print(c+"\t");
	   a=b;
	   b=c;
	   c=a+b;
	 }
   }
}	