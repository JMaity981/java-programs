import java.util.*;
import java.lang.Character;
class case_change1
 { 
     public static void main (String args[]) {
     System.out.println("Enter a string:");
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     int n=s.length();
     for(int i=0;i<n;i++)
     {
        char x=s.charAt(i);
        boolean c=Character.isLowerCase(x);
        if(c==true)
        s.setCharAt(i,Character.toUpperCase(x));
        else
        s.setCharAt(i,Character.toLowerCase(x));
     }
     System.out.println("new="+s);
   }
}