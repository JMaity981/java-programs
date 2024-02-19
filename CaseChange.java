import java.util.*;
class CaseChange
{
    public static void main(String []args) 
    {
       System.out.println("Enter a string:");
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
       int n=s.length();
       System.out.println("After changing the case the new string is:");
       for(int i=0;i<n;i++)
       {
          char x=s.charAt(i);
          if(Character.isLowerCase(x))
             System.out.print(Character.toUpperCase(x));
          else
             System.out.print(Character.toLowerCase(x));
       }
	   //System.out.println("After change the new string is:");
       //System.out.println(s);
    }
}