import java.util.*;
class PalindromSeries{
public static void main(String[] args)
{
   int p,r,m,s=0;
   System.out.println("Entr the limits:");
   Scanner sc=new Scanner(System.in);
   p=sc.nextInt();
   for(int i=0;i<p;i++)
   {
     m=i;
     while(i!=0)
     {
       r=i%10;
       s=s*10+r;
       i=i/10;
     }
     if(m==s)
     {
	   if(m%2==0)  
       System.out.println(m);
     }
    }
  }
}  
