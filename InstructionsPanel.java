import javax.swing.*; 
public class InstructionsPanel extends JPanel
{
	
	private JLabel instructions; 
	
	public InstructionsPanel()
	{
		instructions = new JLabel("Please enter two numbers in each " + 
							"\nbox. Then, click a math function."); 
		
		add(instructions); 
	}
}
