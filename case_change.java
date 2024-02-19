import java.io.*;
import java.lang.Character;
class case_change { 
public static void main (String args[]) {
InputStreamReader read=new InputStreamReader(System.in); 
BufferedReader in=new BufferedReader(read);
StringBuffer str1=new StringBuffer("dRagON");  
int n=str1.length();
for(int i=0;i<n;i++)
{
char x=str1.charAt(i);
boolean c=Character.isLowerCase(x);
if(c==true)
str1.setCharAt(i,Character.toUpperCase(x));
else
str1.setCharAt(i,Character.toLowerCase(x));
}
System.out.println("new="+str1);
}
}