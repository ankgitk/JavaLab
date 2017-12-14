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
