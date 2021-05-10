package constructordemo;
class Employee
{
	int eid;
	String name;
	int salary;
	Employee(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(eid+name+"salary is"+salary);
	}
}
public class EmployeeDemo {
	public static void main(String[] args) 
	{
		Employee e1=new Employee(101,"Tejaswini",50000);
		e1.display();
		Employee e2=new Employee(102,"Mahitha",50000);
		e2.display();
	}

}
