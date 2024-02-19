import java.util.*;
class StringReverse
{
   public static void main(String args[])
   {
       String s;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a string");
	   s=sc.nextLine();
	   int n=s.length();
	   String p="";
	   System.out.println("REVERSE string is:    ");
	   for(int i=n-1;i>=0;i--)
	   {
		    System.out.print(s.charAt(i));
		}
	}
}	