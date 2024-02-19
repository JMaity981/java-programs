import java.io.*;
class case_change { 
public static void main (String args[]) {
InputStreamReader read=new InputStreamReader(System.in); 
BufferedReader in=new BufferedReader(read);
String str1="dRagON";  
int n=str1.length(),x=0,i;
for(i=0;i<n;i++)
{
boolean c=Character.islower(str1.charAt(i));
if(c==true)
charcter.toupper(str1.charAt(i));
else
Charcter.tolower(str1.charAt(i));

}
System.out.println("new="+str1);
}
}