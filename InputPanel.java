import javax.swing.JPanel;
import javax.swing.JTextField;
public class InputPanel extends JPanel
{
	private JTextField Number; 
	
	public InputPanel()
	{
		Number = new JTextField(3); 
		
		add(Number); 
	}
	
	public double getNumber()
	{
		String input; 
		double number; 
		
		input = Number.getText(); 
		number = Double.parseDouble(input); 
		
		return number; 
	}
}