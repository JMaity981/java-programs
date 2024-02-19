class variableLengthArgument{
void display(String  ...a)
{
  for(int i=0;i<a.length;i++)
  System.out.println(a[i]);
  }
  }
class Array{
public static void main(String []args)
{
variableLengthArgument sc=new variableLengthArgument();
sc.display("amit");
sc.display("amit","sumit");
sc.display("amit","sumit","rohit");
}
}  