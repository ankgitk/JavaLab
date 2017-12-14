public class Student2 {

	 String name;
	 int rollno ;
	 double marks ;
	//public Student
	public Student2(int r,String n,double m )
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
	int n;
	System.out.printin("Enter n"+n)
	Student2[] s = new Student2[n];
	for(int i=0;i<n ; i++)
	{	
		String name = Stdln.readString();
		int rollno = Stdln.readInt();
		double marks = Stdln.readDouble();
		s[i] = new Student2(rollno,name,marks);




	}
	//s = new Student(101,"Amit",95.0);
	for(i=0;i<n;i++)
	{
		StdOut.println(s[i]);
	}
		}


	}
