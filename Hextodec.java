import java.util.*;
class Hextodec
{
  publi  void main(String []args)
  {
     int r,i=0;
	 double d=0;
	 System.out.println(static"Enter a hexadecimal number");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 while(n!=0)
	 {
	    r=n%10;
		d=d+r*Math.pow(16,i);
		n=n/10;
		i++;
	 }
     r=0;
     int b=0;
     i=0;	 
	 while(d!=0)
	 {
	    r=d%2;
		b=b+r*Math.pow(10,i);
		d=d/2;
		i++;
	 }
	 