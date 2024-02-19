import java.util.*;
class Star4{
    public static void main(String[]args)
    {
       int i,j,k,n;
       System.out.println("Enter the value of n");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(i=0;i<=n;i++)
       {
         for(j=1;j<=(n-i);j++)
         {
            System.out.print("*");
         }
         for(k=1;k<=i;k++)
         {
            System.out.print(" ");
         }
         System.out.println();
      }
   }
}