import java.util.Scanner;
class fact
{
public static void main(String args[])
{
int f=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
f=f*i;
System.out.println("factorial number="+f);
}
}