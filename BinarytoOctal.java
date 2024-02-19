import java.util.*;
import java.lang.*;
class BinarytoOctal
{
  public static void main(String []args)
  {
    System.out.print("Enter the Binary number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=0;
	double d=0;
	while(n!=0)
	{
	   d=d+(n%10)*Math.pow(2,i);
	   n=n/10;
	   i++;
	}
	i=0;
	double o=0;
	while(d!=0)
	{
	   o=o+(d%8)*Math.pow(10,i);
	   d=d/8;
	   i++;
	}
	System.out.print("Octal equivalent=" +o);
   }
}   