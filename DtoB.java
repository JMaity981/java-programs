import java.util.*;
import java.lang.*;
class DecimltoBinary
{
  public static void main(String[]args)
  {  
    int r,i=0;
	double b=0;
    System.out.print("Enter a decimal number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0)
	{
	  r=n%2;
	  b=b+r*Math.pow(10,i);
	  n=n/2;
	  i++;
	}
    System.out.print("Binary equivalent="+b);
  }
}   
	  