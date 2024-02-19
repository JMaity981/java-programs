import java.util.*;
class AlphabaticalyOrder
{
   public static void main(String[]args)
   {
       System.out.println("Enter a string");
	   Scanner sc = new Scanner(System.in);
	   String s=sc.nextLine();
	   char[] a=s.toCharArray();
	   Arrays.sort(a);
	   String p=new String(a);
           System.out.println("Alphabaticaly order wise string is:");
	   System.out.println(p);
	}
}
	   