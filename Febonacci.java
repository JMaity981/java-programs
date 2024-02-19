import java.util.*;
class Febonacci{
static void febo(int n,int a,int b)
{
   int c;
   c=a+b;
   if(c<=n)
   {
      System.out.println(c);
      a=b;
      b=c;
      febo(n,a,b);
   }
}
public static void main(String[] args)
 {
   int n,a=0,b=1;
   System.out.print("Enter the value of a No.=");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   System.out.println(a);
   System.out.println(b);
   febo(n,a,b);
   }
}
