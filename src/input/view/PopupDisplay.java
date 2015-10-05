package input.view;
import javax.swing.JOptionPane;

public class PopupDisplay
{
public String getAnswer(String input)
{
	String answer = "";
	
	answer = JOptionPane.showInputDialog(null, input);
	
	return answer;
}
/**
 * This displays all the data. 
 * @param input the text to be displayed.
 */
public void displayResponse(String input)
{
	JOptionPane.showMessageDialog(null, input);
}

}



