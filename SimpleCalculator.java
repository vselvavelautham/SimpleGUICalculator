import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame
{
	private InstructionsPanel intro; 
	private InputPanel number1; 
	private InputPanel number2; 
	private JTextField answer; 
	private JLabel equalsSign;
	private JPanel operationPanel;
	private JButton addButton; 
	private JButton subtractButton; 
	
	public SimpleCalculator()
	{
		setTitle("Vithusha's Simple Calculator");  
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		setLayout(new BorderLayout()); 
		
		intro = new InstructionsPanel(); 
		number1 = new InputPanel(); 
		number2 = new InputPanel(); 
		answer = new JTextField(4); 
		equalsSign = new JLabel("=");
		
		buildOperationPanel(); 
		
		add(intro, BorderLayout.NORTH); 
		add(number1, BorderLayout.WEST);
		add(operationPanel, BorderLayout.CENTER);
		add(answer, BorderLayout.SOUTH);
		add(number2, BorderLayout.EAST); 
		
		 
		
		pack(); 
		setVisible(true); 
	}
	
	private void buildOperationPanel()
	{
		operationPanel = new JPanel(); 
		
		addButton = new JButton("+"); 
		subtractButton = new JButton("-"); 
		
		addButton.addActionListener(new AddButtonListener());
		subtractButton.addActionListener(new SubtractButtonListener());
		
		operationPanel.add(addButton); 
		operationPanel.add(subtractButton); 
	}
	
	private class AddButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double total;
			
			total = number1.getNumber() + number2.getNumber(); 
			
			 answer.getText(); 
			 answer.setText("= " + String.valueOf(total));
		}
	}
	
	private class SubtractButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double difference; 
			
			difference = number1.getNumber() - number2.getNumber(); 
			
			answer.getText(); 
			 answer.setText("= " + String.valueOf(difference)); 
		}
	}
	
	public static void main(String[] args)
	{
		new SimpleCalculator(); 
	}
}
