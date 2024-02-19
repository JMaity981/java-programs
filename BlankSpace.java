import java.util.*;
class BlankSpace
{
   public static void main(String[]args)
   {
     int n,sp=0,w=0,ch=0,i;
	 System.out.println("Enter a string");
	 Scanner sc = new Scanner(System.in);
	 String s=sc.nextLine();
	 n=s.length();
	 for(i=0;i<n;i++)
	 {
	    if(s.charAt(i)==' ')
		sp++;
	 }
	 System.out.println("Number of space="+sp);
	 System.out.println("Number of Word="+(sp+1));
	 System.out.println("Number of character="+(n-sp));
   }
 }