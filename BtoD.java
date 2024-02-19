import java.util.*;
import java.lang.*;
class BinarytoDecimal
{
  public static void main(String[]args)
  {  
    int r,i=0;
	double d=0;
    System.out.println("Enter a binary number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0)
	{
	  r=n%10;
	  d=d+r*Math.pow(2,i);
	  n=n/10;
	  i++;
	}
    System.out.println("Decimal equivalent number ="+d);
  }
}   
	  