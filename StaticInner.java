class Outer
{
  String name="amit";
  static class Inner
  {
     static String name1="manna";
	 static void display()
	 {
	   System.out.println(name1);
	 }
   }
   void putdata()
   {
      System.out.println(name);
	  Inner.display();
    }
}
class StaticInner
{
  public static void main(String []args)
  {  
    Outer sc=new Outer();
	sc.putdata();
   }
}   