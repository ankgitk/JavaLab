import java.io.* ;
import java.lang.* ;
class Person
{
	int id;
	String name;
	Person(){}
	Person(int id,String name)
	{
		this.id = id ;
		this.name = name ;



}

	void showPerson(){
	System.out.println(id+""+name);
			
	}

}

class Employee extends Person
{

int salary;
Employee(){ }
Employee(int id,String n,int s)
{

	super(id,n);
	salary=s;



} 

void showEmployee()
{

super.showData();
System.out.println(salary);
}

}

class Manager extends Employee
{

String designation; 
Manager(){}
Manager(int id,String n,int s,String D)
{

        super(id,n);
        salary=s;






