import java.util.*;
class LcmHcf
{
   public static void main(String[]args)
   {
      int lcm,hcf;
	 System.out.println("Enter two number: ");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int m=sc.nextInt();
	 int x=n;
	 int y=m;
	 while(y!=0)
	 {
	   int t=y;
	   y=x%y;
	   x=t;
	 }
	 hcf=x;
	 lcm=(n*m)/hcf;
	 System.out.println("Lcm="+lcm);
	 System.out.println("HCF="+hcf);
   }
}   