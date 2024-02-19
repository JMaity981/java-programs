import java.util.*;
class btoO
{
  public static void main(String []args)
  {
    System.out.println("Enter a binarry");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int oct[]=new int[30];
	int i=1;
	while(n!=0)
	{
	  oct[i]=n%8;
      i++;
      n=n/8;
    }
     System.out.print("Equivalent octal number is:");
     for(int j=i-1;j>0;j--)
        System.out.print(oct[j]);
    }
}	