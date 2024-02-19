import java.util.*;
class perfect
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number...: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int x=0;
		for(int i=1;i<a;i++)
		{
		    if(a%i==0)
			x=x+i;
		}
		if(x==a)
		System.out.println("Perfect no.");
		else
		System.out.println("not Perfect no.");
	}
}