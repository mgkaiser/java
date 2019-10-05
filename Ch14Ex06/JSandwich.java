// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSandwich extends JFrame
{	
	final int FRAME_WIDTH = 650;
	final int FRAME_HEIGHT = 400;
	
	private Font _labelFont = new Font("Arial", Font.PLAIN, 16);
	private Font _buttonFont = new Font("Arial", Font.BOLD, 16);
		
	public JSandwich()
	{
		// Setup the frame
		super("Create Your Sandwich");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
				
		// Bread Panel
		JPanel breadPanel = new JPanel();
		breadPanel.setLayout(new BoxLayout(breadPanel, BoxLayout.Y_AXIS));				
		breadPanel.add(new Label("Bread"));	
		breadPanel.add(new Label("Test2"));
		
		// Meat Panel
		JPanel meatPanel = new JPanel();
		meatPanel.setLayout(new BoxLayout(meatPanel, BoxLayout.Y_AXIS));				
		meatPanel.add(new Label("Meat"));	
		meatPanel.add(new Label("Test2"));
				
		// Cheese Panel
		JPanel cheesePanel = new JPanel();		
		cheesePanel.setLayout(new BoxLayout(cheesePanel, BoxLayout.Y_AXIS));				
		cheesePanel.add(new Label("Cheese"));	
		cheesePanel.add(new Label("Test2"));
		
		// Make Sandwich Button
		JButton makeSandwichButton = new JButton("Make My Sandwich");
		makeSandwichButton.setFont(_buttonFont);
				
		// Sandwich Amount Prompt
		JLabel sandwichAmountPromptLabel = new JLabel("Your sandwich costs: ");
		sandwichAmountPromptLabel.setFont(_labelFont);
		
		// Sandwich Amount
		JLabel sandiwchAmountLabel = new JLabel("Test");
		sandiwchAmountLabel.setFont(_labelFont);
		
		// Sandwich choices panel.  Contains bread, meat, and cheese panel
		JPanel sandwichChoicesPanel = new JPanel();		
		sandwichChoicesPanel.add(breadPanel);
		sandwichChoicesPanel.add(meatPanel);
		sandwichChoicesPanel.add(cheesePanel);
		add(sandwichChoicesPanel);				
							
		// Button panel.  Contains the "Make Sandwich" button
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(makeSandwichButton);
		add(buttonPanel);			
		
		// Sandwich Amount panel.  Contains the amount prompt and amount labels.
		JPanel sandwichAmountPanel = new JPanel();		
		sandwichAmountPanel.add(sandwichAmountPromptLabel);
		sandwichAmountPanel.add(sandiwchAmountLabel);
		add(sandwichAmountPanel);
		
		// Make it visible
		setVisible(true);
	}
			
	public static void main(String[] args) 
	{		
		JSandwich jSandwich = new JSandwich();
	}
			
}