class Outer{
String name="amit";
class Inner{
String name1="manna";
void display()
{
System.out.println(name1);
}
}
void putdata()
{
System.out.println(name);
Inner sc1=new Inner();
sc1.display();
}
}
class InnerClass{
public static void main(String []args)
{
Outer sc=new Outer();
sc.putdata();
}
}
