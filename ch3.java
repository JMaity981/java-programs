import java.util.*;
class ch3
{
   public static void main(String args[])
   {
       String s;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a string");
	   s=sc.nextLine();
	   int n=s.length();
	   String p="";
	   System.out.println("new string is:    ");
		for(int i=0;i<n;i++)
		{
		    int x=(int)s.charAt(i);
			char y=(char)(x+3);
			p=p+y;
		}
		System.out.println(p);
	}
}