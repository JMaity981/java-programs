import java.util.*;
class Palindrom{
public static void main(String[] args)
{
   int n,r,m,s=0;
   System.out.println("Entr a number:");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   m=n;
   while(n!=0)
   {
     r=n%10;
     s=s*10+r;
     n=n/10;
   }
   if(m==s)
     System.out.println("This number is palindrom");
   else
     System.out.println("This number is not palindrom");
   }
}
