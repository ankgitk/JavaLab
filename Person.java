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

