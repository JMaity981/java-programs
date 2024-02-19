import java.util.*;
class EvenPalindromSeries{
public static void main(String[] args)
{
   int r,m,p;
   System.out.println("Entr the limits:");
   Scanner sc=new Scanner(System.in);
   p=sc.nextInt();
   for(int i=1;i<p;i++)
   {
     m=i;
	 int s=0;
	 int n=i;
     while(n!=0)
     {
       r=n%10;
       s=s*10+r;
       n=n/10;
     }
     if(m==s)
     {
	   if(s%2==0)  
       System.out.println(s);
     }
    }
  }
}  
