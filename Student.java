public class Student {

	 String name;
	 int rollno ;
	 double marks ;
	//public Student
	public Student(int r,String n,double m )
	{
	rollno = r ;
        name = n;
        marks = m;


	}

	void getData(int rollno,String name,double marks ) {

	//	this.name = name ;
	
	this.rollno = rollno ;
	this.name = name;
	this.marks = marks; 
	
	}

	void showData(){

	System.out.print("Name:"+name+"rollno :"+rollno+" MArks : "+marks);


			}
 
	
	}
	
	class StudentDemo{
	public static void main(String[] args) {
	
	Student s;
	s = new Student(101,"Amit",95.0);
	s.showData();

		}


	}
