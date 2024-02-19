import java.util.*;
import java.lang.*;
class DtoOctal
{
  public static void main(String[]args)
  {  
    int r,i=0;
	double o=0;
    System.out.println("Enter a decimal number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0)
	{
	  r=n%8;
	  o=o+r*Math.pow(10,i);
	  n=n/8;
	  i++;
	}
    System.out.println("Octal equivalent=" +o);
  }
}   
	  