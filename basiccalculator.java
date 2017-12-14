import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class basiccalculator extends JFrame {


	private final long serialVersionUID = 1L;

	
	
	
	private final Font BIGGER_FONT=new Font("monspaced",Font.ITALIC,24);
	private JTextField textfield;
	private boolean number=true;
	private String equalop="=";
	//calls calculatorop class for operator
	 private CalculatorOp op = new CalculatorOp(); 
	 public basiccalculator()//constructor start
	 {
		 textfield=new JTextField("0",12);
		 textfield.setHorizontalAlignment(JTextField.LEFT);
		 textfield.setFont(BIGGER_FONT);
		 
		////////////////////////////////////
		// textfield2=new JTextField("0",12);
                // textfield2.setHorizontalAlignment(JTextField.RIGHT);
                // textfield2.setFont(BIGGER_FONT);
		 //calls numberlistner class
		 ActionListener numberlistner=new NumberListner();
		 
		 String buttonorder="1234567890 ";
		 JPanel buttonpanel=new JPanel();
		 buttonpanel.setLayout(new GridLayout(4,3,3,2));
		 for (int i = 0; i < buttonorder.length(); i++) {
			String key=buttonorder.substring(i, i+1);
			if(key.equals(" ")){
				buttonpanel.add(new JLabel(""));
			}//if
			else
			{
				JButton button=new JButton(key);
				button.addActionListener(numberlistner);
				button.setFont(BIGGER_FONT);
				buttonpanel.add(button);
			}//else
		}//for finished
		 //calls operatorlistner class
		 ActionListener operatorlistner=new OperatorListner();
		 JPanel panel=new JPanel();
		 panel.setLayout(new GridLayout(4,4,4,4));
		 String[] oporder={"Cler","+","-","*","/","Anser"};
		 for (int i = 0; i < oporder.length; i++) {
			JButton button=new JButton(oporder[i]);
            button.addActionListener(operatorlistner);
            button.setFont(BIGGER_FONT);
            panel.add(button);
		}//for inished
		 
		JPanel pan=new JPanel();
		pan.setLayout(new BorderLayout(4,4));
		pan.add(textfield,BorderLayout.NORTH);
		pan.add(buttonpanel,BorderLayout.CENTER);
		pan.add(panel,BorderLayout.EAST);
		this.setContentPane(pan);
		this.pack();
		this.setTitle("Calculator BY ankit");
		//this.setResizable(false);
		 
	 }//constructor finished
	 private void action()
	 {
		 number=true;
		 textfield.setText("0");
		 equalop= "=";
		 op.setTotal("0");
		 
	 }
	 class OperatorListner implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(number)
				{
					action();
					textfield.setText("0");
				}
				else
				{
					number=true;
					String displaytext=textfield.getText();
					if(equalop.equals("="))
					{
						op.setTotal(displaytext);
					}else if(equalop.equals("+")){
					op.add(displaytext);
					}else if(equalop.equals("-"))
					{
						op.subtarct(displaytext);
					}else if(equalop.equals("*"))
					{
						op.multiply(displaytext);
					}else if(equalop.equals("/"))
					{
						op.divide(displaytext);
					}
					
					textfield.setText("" + op.GetTotalString());
					 equalop = e.getActionCommand();
				}
				
			}//method finished

			

		}
	 //operatorlistner class finished
	 
	 class NumberListner implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			String digit=e.getActionCommand();
			if(number)
			{
				textfield.setText(digit);
				number=false;
			}else{
				textfield.setText(textfield.getText()+digit);
			}
			
		}//method
		 
	 }//numberlistner finished

}


