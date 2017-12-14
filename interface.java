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
