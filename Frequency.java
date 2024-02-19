import java.util.*;
class Frequency
{
   public static void main(String[]args)
   { 
      int i,k;
	  char c,ch;
	  System.out.println("Enter a string:");
	  Scanner sc = new Scanner(System.in);
	  String s=sc.nextLine();
	  for(c='A';c<='z';c++)
	  {
	    k=0;
		for(i=0;i<s.length();i++)
		 {
		   ch=s.charAt(i);
		   if(ch==c)
		   k++;
		 }
	   if(k>0)
	   System.out.println("The character '"+c+"' frequency is: "+k);
	  }
	}
 }	