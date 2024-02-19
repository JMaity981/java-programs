import java.util.*;
class SurName
{
   public static void main(String[]args)
   {
       int i;
       System.out.println("Enter a string:");
	   Scanner sc = new Scanner(System.in);
	   String s=sc.nextLine();
System.out.println("Sur-name will be:");
	   System.out.print(s.charAt(0)+".");
	   int n=s.length();
	   int p=s.lastIndexOf(" ");
	   for(i=0;i<p-1;i++)
	   {
	     char ch=s.charAt(i);
	     if(Character.isWhitespace(ch))
	     System.out.print(" "+s.charAt(i+1)+". ");
	   }
	   
	   System.out.print(s.substring((p+1),n));
    }
}	
	 