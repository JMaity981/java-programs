import java.util.*;
class ReverseString
{
   public static void main(String[]args)
   {
       int i;
       System.out.println("Enter a string");
	   Scanner sc = new Scanner(System.in);
	   String s=sc.nextLine();
	   String p="";
	   int n=s.length();
	   for(i=n-1;i>=0;i--)
	   {
	      p=p+s.charAt(i);
	   }
	   System.out.println("Reverse string is:"+p);
	}
}