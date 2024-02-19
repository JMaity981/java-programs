import java.util.*;
class StringPalindrom
{
   public static void main(String[]args)
   {
       int i;
	   String p="";
       System.out.println("Enter a string");
	   Scanner sc = new Scanner(System.in);
	   String s=sc.nextLine();
	   int n=s.length();
	   for(i=n-1;i>=0;i--)
	   {
	      p=p+s.charAt(i);
	   }
	   if(s.equalsIgnoreCase(p))
	      System.out.println("This string is palindrom");
	   else
	       System.out.println("This string is not palindrom");
    }
}