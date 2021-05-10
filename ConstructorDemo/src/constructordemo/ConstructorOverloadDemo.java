package constructordemo;
class Employee
{
	int eid;
	String name;
	int salary;
	Employee()
	{
		System.out.println("Default constructor");
	}
	Employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	Employee(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("eid="+eid);
		System.out.println("emp name="+name);
		System.out.println("emp salary="+salary);
	}
}
public class ConstructorOverloadDemo {
	public static void main(String[] args)
{
	Employee e1=new Employee();
	e1.display();
	Employee e2=new Employee(2928,"Tejaswini");
	e2.display();
	Employee e3=new Employee(2928,"Tejaswini",100000);
	e3.display();
	
	
}
}
