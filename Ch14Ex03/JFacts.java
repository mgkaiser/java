// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFacts extends JFrame implements ActionListener
{
	final int NUM_LABELS = 6;
	final int FRAME_WIDTH = 650;
	final int FRAME_HEIGHT = 200;
	
	private JLabel[] _factLabels = new JLabel[NUM_LABELS];
	private Font _labelFont = new Font("Arial", Font.BOLD, 16);
	private String[] _otterFacts = new String[]{
		"Otters are part of the Mustelidae family.",
		"Approximately 90 percent of the sea otters in the world live in coastal Alaska.",
		"U.S. and international law protects threatened sea otters.",
		"Sea otters eat 25 percent of their body weight in food every day.",
		"Sea otters have the thickest fur of any animal.",
		"Sea otters can have a pup any time of the year.",
		"Do not challenge otters to a breath holding competition.",
		"Otters are an essential keystone species.",
		"The otter is one of the few mammals that use tools",
		"A group of resting otters is called a raft.",
		"Otters might look soft and cuddly but remain dangerous wild animals."		
	};		
	private int _nextFact = 0;
	private int _nextLabelToReplace = 0;
	
	public JFacts()
	{
		// Setup the frame
		super("Facts About Otters");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		// Add the labels
		for (int i=0; i < NUM_LABELS; i ++)
		{
			_factLabels[i] = new JLabel(GetNextOtterFact());
			_factLabels[i].setFont(_labelFont);
			add(_factLabels[i]);
		}
		
		// Add the button
		JButton factsButton = new JButton("Click for more facts");
		factsButton.addActionListener(this);
		add(factsButton);
		
		// Make it visible
		setVisible(true);
	}
	
	private String GetNextOtterFact()
	{
		String otterFact = _otterFacts[_nextFact];
		_nextFact++;
		if (_nextFact >= _otterFacts.length) _nextFact = 0;
		return otterFact;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		_factLabels[_nextLabelToReplace].setText(GetNextOtterFact());
		_nextLabelToReplace++;
		if (_nextLabelToReplace >= NUM_LABELS) _nextLabelToReplace = 0;		
	}
	
	public static void main(String[] args) 
	{		
		JFacts jFacts = new JFacts();
	}
			
}