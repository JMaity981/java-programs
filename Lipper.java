import java.util.*;
class Lipper{
public static void main(String[]args)
{
System.out.println("Enter YEAR...: ");
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
if(y%100!=0&&y%4==0)
System.out.println("This year is lipper");
else if(y%100==0&&y%400==0)
System.out.println("This year is lipper");
else
System.out.println("This year is not lipper");
}
}
