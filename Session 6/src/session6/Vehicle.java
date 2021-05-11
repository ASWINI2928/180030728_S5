package session6;
class TypesOfMethods
{
void type()
{
	System.out.println("this has 0 args");
}
void type(int a)
{
	System.out.println("this has 1 args");
}
void type(int a,int b)
{
	System.out.println("this has 2 args");
}
void type(short a,short b)
{
	System.out.println("this has 2 float args");
}
}
public class Vehicle {
public static void main(String args[]) {
	TypesOfMethods t=new TypesOfMethods();
	t.type(20,30);//widening the memory
}
}
