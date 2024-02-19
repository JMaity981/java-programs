import java.util.*;
import java..*;
class Amstrong
{
 public static void main(String[]args)
 {
    int a=0,r,i=0,digit,s,j,n;
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
    digit=n;
	s=n;
    while(n!=0)
    {
      r=n%10;
      i++;
      n=n/10;
    }
    while(digit!=0)
    {
      r=digit%10;
      a=a+pow(r,i);
      digit=digit/10;
    }
    if(s==a)
     System.out.println("This number is Amstrong number");
  }
}