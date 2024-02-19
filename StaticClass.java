class Employee{
static int count;
int k=0;
Employee()
{
count++;
k++;
}
}
class StaticClass{
public static void main(String []args)
{
System.out.println("Befor creating object value of count= " +Employee.count+"value of k is"+k);
Employee sc1=new Employee();
Employee sc2=new Employee();
Employee sc3=new Employee();
System.out.println("After creating object value of count= "+Employee.count+ "and value of k is"+Employee.k);
}
}