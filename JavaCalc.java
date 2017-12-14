import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaCalc extends JFrame 
{
	private JTextField tfin,tfin1,tfout;
	private JButton plbtn,minbtn,mulbtn,divbtn,eqbtn,clrbtn;
	private int result=0;
	private char flag='F';
	private int f = 0 ;

	public JavaCalc()
	{
		Container cp= getContentPane();
		cp.setLayout(new GridLayout());

		cp.add(new JLabel ("Input1"));
		tfin1=new JTextField(10);
		cp.add(tfin1);

		cp.add(new JLabel ("Input2"));
		tfin=new JTextField(10);
		cp.add(tfin);

		plbtn=new JButton("ADD");
		cp.add(plbtn);

		minbtn=new JButton("SUB");
		cp.add(minbtn);

		mulbtn=new JButton("MUL");
		cp.add(mulbtn);

		divbtn=new JButton("DIV");
		cp.add(divbtn);

		eqbtn=new JButton("ANS");
		cp.add(eqbtn);

		clrbtn=new JButton("C");
		cp.add(clrbtn);

		cp.add(new JLabel ("Result"));
		tfout=new JTextField(10);
		tfout.setEditable(false);
		cp.add(tfout);

		//Action Listeners
		plbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='+';
			}
		});

		minbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='-';
			}
		});

		mulbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='*';
			}
		});

		divbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				flag='/';
			}
		});

		clrbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				tfin.setText("");
				tfin1.setText("");
				tfout.setText("");
			}
		});

		eqbtn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				int num1=Integer.parseInt(tfin1.getText());
				int num2=Integer.parseInt(tfin.getText());
				switch(flag)
				{
					case '+':result=num1+num2;break;
					case '-':result=num1-num2;break;
					case '*':result=num1*num2;break;
					case '/'://result=num1/num2;break;
						try{
                                                int result=num1/num2;
                                                }catch(ArithmeticException e)
                                                {
                                                        f = 1;
                                                //System.out.println(e);
                                                        //System.out.println("C$
                                                }

				}
				//tfout.setText(result+"");
				 if(f == 1)
                                {
                                        f=0 ;
                                      tfout.setText("Cant divide by Zero");


                                }
                                else

                                        {


                                                tfout.setText(result+"");

                                        }


			}
		});

		tfin.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				int num1=Integer.parseInt(tfin1.getText());
				int num2=Integer.parseInt(tfin.getText());
				switch(flag)
				{
					case '+':result=num1+num2;break;
					case '-':result=num1-num2;break;
					case '/':try{
						int result=num1/num2;
						}catch(ArithmeticException e)
						{
							int f = 1;
						//System.out.println(e);
							//System.out.println("Cant ddivide by zero");
						}
					case '*':result=num1*num2;break;
				}
				//tfout.setText(result+"");
				if(f == 1)
                                {
					f=0 ;
                                      tfout.setText("Cant divide by Zero");


                                }
				else

					{


						tfout.setText(result+"");

					}
	
			}
		});

		//frame.setIconImage(ImageIO.read(new File("/Downloads/cal.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator By Ankit ");
		setSize(5000,150);
		setVisible(true);
		setResizable(true);
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new JavaCalc();
				//if(f == 1)
				//{

				//	System.out.println("Cant divide by Zero");


				//}
			}
		});
	}
}
