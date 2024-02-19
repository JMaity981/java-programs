class Employee{
String empName;
int empId;
String empAddress;
}
class EmployeeDemo{
public static void main(String []args)
{
Employee sc=new Employee();
sc.empName="Ram";
sc.empId=20;
sc.empAddress="Mahishadla";
System.out.println("Employee name is:"+sc.empName);
System.out.println("Employee Id ="+sc.empId);
System.out.println("Employee address is:"+sc.empAddress);
}
}