class Employee{
String empName;
String empAddress;
int empId;
Employee(String name,String add,int id)
{
this.empId=id;
this.empName=name;
this.empAddress=add;
}
void display()
{
System.out.println(empId);
System.out.println(empAddress);
System.out.println(empName);
}
}
class This{
public static void main(String []args)
{
Employee sc=new Employee();
Employee("amit","mahishadal","100");
sc.display();
}
}
