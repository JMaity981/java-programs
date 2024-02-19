class Demo
{
  int empId;
  String empName,empAddress;
  Demo(int id,String name,String address)
  {
     this empId=id;
	 this empName=name;
	 this empAddress=address;
  }
  void display()
  {
     System.out.println(empId);
	 System.out.println(empName);
	 System.out.println(empAddress);
  }
}
class EmployeeThis
{
  public static void main(String []args)
  {
    Demo sc=new Demo();
    sc.display();
  }
}  
  
	 