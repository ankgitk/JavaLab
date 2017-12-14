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

	}
}
