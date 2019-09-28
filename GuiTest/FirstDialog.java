import javax.swing.JOptionPane;
public class FirstDialog
{
	static final float PRICE_PER_DOZEN = 3.25f;
	static final float PRICE_PER_EGG = 0.45f;	
		
	public static void main(String[] args)
	{
		
		
		// Ask the user how many eggs they want
		int numberOfEggs;
		numberOfEggs = Integer.parseInt(JOptionPane.showInputDialog(null, "How many eggs would you like?"));
		
		
		JOptionPane.showMessageDialog(null, "You ordered " + numberOfEggs + " eggs.");
	}
}