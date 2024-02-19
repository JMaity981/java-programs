import java.util.*;
class prime
{
public static void main(String args[])
{
int n,m,flag=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
n=sc.nextInt();
for(m=2;m<n;m++)
{
    if(n%m==0)
{
    flag=0;
    break;
}
}
if(flag==0)
System.out.println("the no is not prime");
else
System.out.println("the no is prime");
}
}