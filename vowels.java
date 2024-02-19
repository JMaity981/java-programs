import java.util.*;
class vowels
{
public static void main(String args[])
{
String s;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
s=sc.nextLine();
int n=s.length();
for(int i=0;i<n;i++)
{
char c=s.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
count++;
}
System.out.println(" Total vowels= "+count);
}
}