/*
abstract class Figure
{
double dim1,dim2;
Figure(double dim1,double dim2)
{

this.dim1=dim1;
this.dim2=dim2 ;

}

abstract void Area();



}

class Rectangle extends Figure
{


Rectangle(double dim1,double dim2)
{

super(dim1,dim2);

}

void Area()
{


System.out.println("Area  of rectangle :"+(dim1*dim2));

}

}

class Triangle extends Figure
{
Triangle(double dim1,double dim2)

{

super(dim1,dim2);


}

void Area()
{

System.out.println("Area of triangle : "+((0.5)*(dim1*dim2)));

}

}

class Abc
{
public static void main(String args[])
{

Figure f;
Rectangle r = new Rectangle(3,2);
r.Area();
Triangle t = new Triangle(5,3);
t.Area();
//f= r;
//f.Area() ;
//f=t;
//f.Area() ; 
}





}



//abstract.java



*/


/*
interface Figure
{
void Area();



}

class Rectangle implements Figure
{

double dim1,dim2 ;
Rectangle(double dim1,double dim2)
{

this.dim1= dim1;
this.dim2=dim2;

}

public void Area()
{


System.out.println("Area  of rectangle :"+(dim1*dim2));

}

}

class Triangle implements Figure
{

double dim1,dim2 ;
Triangle(double dim1,double dim2)

{

this.dim1 = dim1;
this.dim2=dim2 ;


}

public void Area()
{

System.out.println("Area of triangle : "+((0.5)*(dim1*dim2)));

}

}

class Circle implements Figure
{

        double dim1 ;
        Circle(double dim1)

        {
                                            
                this.dim1 = dim1;
               // this.dim2=dim2 ;


        }

        public void Area()
        {

                System.out.println("Area of Circle : "+((3.14)*(dim1*dim1)));

        }

}

class Abcd
{
public static void main(String args[])
{

Figure f;
Rectangle r = new Rectangle(3,2);
r.Area();
Triangle t = new Triangle(5,3);
t.Area();
Circle c = new Circle(7);
c.Area();
f= r;
f.Area() ;
f=t;
f.Area() ; 
f=c ;
f.Area();
}

}


//interface.java

*/



/*
import java.io.*;
//import java.lang.*;
class Person 
{ 
      private String name; 
      Person(String s) 
      {   
            setName(s); 
      } 
      public void setName(String s) 
      { 
        name = s; 
      } 
      public String getName() 
      { 
        return name; 
      } 
      public void display() 
      { 
        System.out.println("Name = " + name); 
      } 
} 
    class Employee extends Person 
  {   
       private int empid; 
       Employee(String sname,int id) //Constructor Method 
       { 
         super(sname); 
         setEmpid(id); 
       } 
       public void setEmpid(int id) 
       { 
         empid = id; 
       } 
       public int getEmpid() 
       { 
         return empid; 
       } 
       public void display() 
       { 
         super.display(); 
         System.out.println("Empid = " + empid); 
       } 
   } 
    class Manager extends Employee 
  { 
      //private double hourlyRate; 
      private String Designation ; 
private int experience; 
      Manager(String sname,int id,String D,int exp) 
      {      
         super(sname,id); 
         Designation = D; 
         experience = exp; 
      } 
      public void display() 
      { 
        super.display(); 
        System.out.println("Designation = " + Designation); 
        System.out.println("Experience = " + experience); 
        //System.out.println("Gross pay = " + GetGrosspay()); 
      } 
  }
    class MultilevelInheritance 
 { 
      public static void main(String[] args) throws IOException 
      { 
         Manager m = new Manager("John Smith",1,"Sr. Manager",7); 
         m.display(); 
      } 
 }




//person.java
*/


/*



import java.io.*;
//import java.lang.*;
class PersonAbstract 
{ 
      private String name; 
      PersonAbstract(String s) 
      {   
            setName(s); 
      } 
      public void setName(String s) 
      { 
        name = s; 
      } 
      public String getName() 
      { 
        return name; 
      } 
      public void display() 
      { 
        System.out.println("Name = " + name); 
      } 
} 
  abstract  class Employee extends PersonAbstract 
  {   
       private int empid; 
       Employee(String sname,int id) //Constructor Method 
       { 
         super(sname); 
         setEmpid(id); 
       } 
       public void setEmpid(int id) 
       { 
         empid = id; 
       } 
       public int getEmpid() 
       { 
         return empid; 
       } 
       public void display() 
       { 
         super.display(); 
         System.out.println("Empid = " + empid); 
       } 
   } 
    class Manager extends Employee 
  { 
      //private double hourlyRate; 
      private String Designation ; 
private int experience; 
      Manager(String sname,int id,String D,int exp) 
      {      
         super(sname,id); 
         Designation = D; 
         experience = exp; 
      } 
      public void display() 
      { 
        super.display(); 
        System.out.println("Designation = " + Designation); 
        System.out.println("Experience = " + experience); 
        //System.out.println("Gross pay = " + GetGrosspay()); 
      } 
  }
    class MultilevelInheritance 
 { 
      public static void main(String[] args) throws IOException 
      { 
         //Manager m = new Manager("John Smith",1,"Sr. Manager",7); 
        // m.display(); 

Employee obj = new Manager("JOhn Smith",1,"SR. DEv",7);
obj.display();
      } 
 } 






//personabstract.java
*/

/*

import java.io.*;
//import java.lang.*;
final class PersonFinal 
{ 
      private String name; 
      PersonFinal(String s) 
      {   
            setName(s); 
      } 
      public void setName(String s) 
      { 
        name = s; 
      } 
      public String getName() 
      { 
        return name; 
      } 
      final public void display() 
      { 
        System.out.println("Name = " + name); 
      } 
} 
    class Employee extends PersonFinal 
  {   
       private int empid; 
       Employee(String sname,int id) //Constructor Method 
       { 
         super(sname); 
         setEmpid(id); 
       } 
       public void setEmpid(int id) 
       { 
         empid = id; 
       } 
       public int getEmpid() 
       { 
         return empid; 
       } 
       public void display() 
       { 
         super.display(); 
         System.out.println("Empid = " + empid); 
       } 
   } 
    class Manager extends Employee 
  { 
      //private double hourlyRate; 
      private String Designation ; 
private int experience; 
      Manager(String sname,int id,String D,int exp) 
      {      
         super(sname,id); 
         Designation = D; 
         experience = exp; 
      } 
      public void display() 
      { 
        super.display(); 
        System.out.println("Designation = " + Designation); 
        System.out.println("Experience = " + experience); 
        //System.out.println("Gross pay = " + GetGrosspay()); 
      } 
  }
    class MultilevelInheritance 
 { 
      public static void main(String[] args) throws IOException 
      { 
         Manager m = new Manager("John Smith",1,"Sr. Manager",7); 
         m.display(); 
      } 
 } 





//PersonFinal.java

*/


/*


import java.io.*;
//import java.lang.*;
class PersonSuper
{ 
      private String name; 
      PersonSuper(String s) 
      {   
            setName(s); 
      } 
      public void setName(String s) 
      { 
        name = s; 
      } 
      public String getName() 
      { 
        return name; 
      } 
      public void display() 
      { 
        System.out.println("Name = " + name); 
      } 
} 
    class Employee extends PersonSuper 
  {   
       private int empid; 
       Employee(String sname,int id) //Constructor Method 
       { 
         super(sname); 
         setEmpid(id); 
       } 
       public void setEmpid(int id) 
       { 
         empid = id; 
       } 
       public int getEmpid() 
       { 
         return empid; 
       } 
       public void display() 
       { 
         super.display(); 
         System.out.println("Empid = " + empid); 
       } 
   } 
    class Manager extends Employee 
  { 
      //private double hourlyRate; 
      private String Designation ; 
private int experience; 
      Manager(String sname,int id,String D,int exp) 
      {      
         super(sname,id); 
         Designation = D; 
         experience = exp; 
      } 
      public void display() 
      { 
        super.display(); 
        System.out.println("Designation = " + Designation); 
        System.out.println("Experience = " + experience); 
        //System.out.println("Gross pay = " + GetGrosspay()); 
      } 
  }
    class MultilevelInheritance 
 { 
      public static void main(String[] args) throws IOException 
      { 
         Manager m = new Manager("John Smith",1,"Sr. Manager",7); 
         m.display(); 
      } 
 } 

//PerspnSuper.java

*/

/*
import java.io.*;
//import java.lang.*;
class PersonSuperO
{ 
      private String name; 
      PersonSuperO(String s) 
      {   
            setName(s); 
      } 
      public void setName(String s) 
      { 
        name = s; 
      } 
      public String getName() 
      { 
        return name; 
      } 
      public void display() 
      { 
        System.out.println("Name = " + name); 
      } 
} 
    class Employee extends PersonSuperO 
  {   
       private int empid; 
       Employee(String sname,int id) //Constructor Method 
       { 
         super(sname); 
         setEmpid(id); 
       } 
       public void setEmpid(int id) 
       { 
         empid = id; 
       } 
       public int getEmpid() 
       { 
         return empid; 
       } 
       public void display() 
       { 
         super.display(); 
         System.out.println("Empid = " + empid); 
       } 
   } 
    class Manager extends Employee 
  { 
      //private double hourlyRate; 
      private String Designation ; 
private int experience; 
      Manager(String sname,int id,String D,int exp) 
      {      
         super(sname,id); 
         Designation = D; 
         experience = exp; 
      } 
      public void display() 
      { 
        super.display(); 
        System.out.println("Designation = " + Designation); 
        System.out.println("Experience = " + experience); 
        //System.out.println("Gross pay = " + GetGrosspay()); 
      } 
  }
    class MultilevelInheritance 
 { 
      public static void main(String[] args) throws IOException 
      { 
         Manager m = new Manager("John Smith",1,"Sr. Manager",7); 
         m.display(); 
      } 
 } 

//personsupero.java


*/

/*



*/

/*


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

//this.name = name ;

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
*/


/*
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

//this.name = name ;

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
//StudentdDemo.java


*/

/*
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class JavaThread
{

public static void main(String args[])
{
int[] ar1 ;
ar1 = new int[20];
//int i ;
for(int i = 0; i< ar1.length ; i++)

{
ar1[i] = (int)(Math.random() * 100);
System.out.println(ar1[i]+ " " );
}

Arrays.sort(ar1);
 //for(int j = 0; j< ar1.length ; j++)


 System.out.println("SOrted Array  :" );
 for(int j = 0; j< ar1.length ; j++)
{
//System.out.println("SOrted Array  :" );
                       // ar1[i] = (int)(Math.random() * 100);
                        System.out.println(ar1[j]+ "  " );
                        }

Scanner in = new Scanner(System.in);
System.out.println("Enter the number to search")
d = in.nextInt() ;


for(int j = 0; j< ar1.length ; j++)
                        {
                                //System.out.println("SOrted Array  :" );
                       // ar1[i] = (int)(Math.random() * 100);
if(ar1[i] == d) {
                        System.out.println("Found "+ d );
                        }


}



}

}

*/
/*
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class JavaThread
{

public static void main(String args[])
{
int[] ar1 ;
ar1 = new int[20];
//int i ;
for(int i = 0; i< ar1.length ; i++)

{
ar1[i] = (int)(Math.random() * 100);
System.out.println(ar1[i]+ " " );
}

Arrays.sort(ar1);
 //for(int j = 0; j< ar1.length ; j++)


 System.out.println("SOrted Array  :" );
 for(int j = 0; j< ar1.length ; j++)
{
//System.out.println("SOrted Array  :" );
                       // ar1[i] = (int)(Math.random() * 100);
                        System.out.println(ar1[j]+ "  " );
                        }

Scanner in = new Scanner(System.in);
System.out.println("Enter the number to search")
d = in.nextInt() ;


for(int j = 0; j< ar1.length ; j++)
                        {
                                //System.out.println("SOrted Array  :" );
                       // ar1[i] = (int)(Math.random() * 100);
if(ar1[i] == d) {
                        System.out.println("Found "+ d );
                        }


}



}

}





//JavaThread.java
*/


/*

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
class Gen extends Thread
{
int i,array1[],array2[],array3[];
public Gen(int array1[],int array2[],int array3[])
{
this.array1=array1;
this.array2=array2;
this.array3=array3;
}
public void run()
{
Random rand=new Random();
System.out.println("Generated Random Numbers");
System.out.println("\tArray1 ");

for(i=0;i<20;i++)
{
array1[i]=rand.nextInt(1000);
 System.out.println("\n");
System.out.println(array1[i]);
}

 System.out.println("\tArray2 ");

                for(i=0;i<20;i++)
                {
                        array2[i]=rand.nextInt(1000);
                        System.out.println("\n");

System.out.println(array2[i]);
                }

System.out.println("\tArray3 ");

                for(i=0;i<20;i++)
                {
                        array3[i]=rand.nextInt(1000);
                        System.out.println("\n");

                        System.out.println(array3[i]);
                }

System.out.println("\n");
}
}
class Sort extends Thread
{
private int array1[],array2[],array3[];
public Sort(int array1[],int array2[],int array3[])
{
//this.array=array;

this.array1=array1;
                this.array2=array2;
                this.array3=array3;
}
public void run()
{
int i;
Arrays.sort(array1);
 Arrays.sort(array2);
 Arrays.sort(array3);
System.out.println("Sorted Array 1");
for(i=0;i<20;i++)
{
System.out.println(array1[i]);
}

System.out.println("Sorted Array 2");
                for(i=0;i<20;i++)
                {
                        System.out.println(array2[i]);
                }

System.out.println("Sorted Array 3");
                for(i=0;i<20;i++)
                {
                        System.out.println(array3[i]);
                }



System.out.println("\n");
}
}
class Search extends Thread
{
private int array1[],array2[],array3[],ele1,ele2,ele3;
public Search(int array1[],int array2[],int array3[])
{
this.array1=array1;
this.array2=array2;
                this.array3=array3;


}
public void run()
{
int i,f1=0,f2=0,f3=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter Element to search for array1");
ele1=s.nextInt();
for(i=0;i<20;i++)
{
if(array1[i]==ele1)
{
f1=1;
System.out.println("Element "+ele1+" found at index "+i);
break;
}
}
if(f1==0)
System.out.println("Element "+ele1+" not found in array1");








System.out.println("Enter Element to search for array2");
                ele2=s.nextInt();
                for(i=0;i<20;i++)
                {
                        if(array2[i]==ele2)
                        {
                                f2=1;
                                System.out.println("Element "+ele2+" found at index "+i);
                                break;
                        }
                }
                if(f2==0)
                        System.out.println("Element "+ele2+" not found in array1");




System.out.println("Enter Element to search for array3");
                ele3=s.nextInt();
                for(i=0;i<20;i++)
                {
                        if(array3[i]==ele3)
                        {
                                f3=1;
                                System.out.println("Element "+ele3+" found at index "+i);
                                break;
                        }
                }
                if(f3==0)
                        System.out.println("Element "+ele3+" not found in array3");


}
}
class ThreadDemo
{
public static void main(String args[])
{
int i;
int array1[]= new int[20];
int array2[] = new int[20];
int array3[] = new int[20];
Gen g=new Gen(array1,array2,array3);
Sort s=new Sort(array1,array2,array3);
Search sea=new Search(array1,array2,array3);
                

//int array2[]= new int[20];
                //Gen g2=new Gen(array2);
                //Sort s2=new Sort(array2);
                //Search sea2=new Search(array2);

//int array3[]= new int[20];
                //Gen g3=new Gen(array3);
                //Sort s3=new Sort(array3);
                //Search sea3=new Search(array3);
g.start();
try
{
s.sleep(100);
}catch(InterruptedException e){}
s.start();
try
{
sea.sleep(100);

}catch(InterruptedException e){}
sea.start();
/*for(i=10;i<20;i++)
{
System.out.println(array1[i]);
}*/

/*int array2[]= new int[20];
                Gen g2=new Gen(array2);
                Sort s2=new Sort(array2);
                Search sea2=new Search(array2);

g2.start();
                try
                {
                        s2.sleep(100);
                }catch(InterruptedException e){}
                s2.start();
                try
                {
                        sea2.sleep(100);

                }catch(InterruptedException e){}
                sea2.start();

int array3[]= new int[20];
                Gen g3=new Gen(array3);
                Sort s3=new Sort(array3);
                Search sea3=new Search(array3);


g3.start();
                try
                {
                        s3.sleep(100);
                }catch(InterruptedException e){}
                s3.start();
                try
                {
                        sea3.sleep(100);

                }catch(InterruptedException e){}
                sea3.start();
*/
/*
}
}

*/



