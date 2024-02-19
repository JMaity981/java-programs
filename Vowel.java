import java.util.*;
class Vowel
{ 
   public static void main(String[]args)
   {
      int n,v=0,i;
	  System.out.println("Enter a string");
	  Scanner sc = new Scanner(System.in);
	  String s=sc.nextLine();
	  s=s.toLowerCase();
	  for(i=0;i<s.length();i++)
	  {
	     char c=s.charAt(i);
 	     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		 v++;
	  }
	  System.out.println("Number of vowel="+v);
	}
}