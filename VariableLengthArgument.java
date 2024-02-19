class Demo 
{
   void display(String ...a)
   {
      for(int i=0;i<a.length;i++)
	  System.out.println(a[i]);
   }
}
class VariableLengthArgument
{
  public static void main(String[]args)
  {
     Demo sc=new Demo();
	 sc.display("amit");
	 sc.display("amit","sumit");
	 sc.display("amit","sumit","rohit");
  }
}  