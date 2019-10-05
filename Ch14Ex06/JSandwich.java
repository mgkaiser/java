// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
import java.text.NumberFormat;
import java.util.Locale;

public class JSandwich extends JFrame implements ListSelectionListener, ActionListener
{	
	final int FRAME_WIDTH = 650;
	final int FRAME_HEIGHT = 300;
	
	private Font _labelFont = new Font("Arial", Font.PLAIN, 16);
	private Font _listLabelFont = new Font("Arial", Font.BOLD, 14);
	private Font _buttonFont = new Font("Arial", Font.BOLD, 16);
	
	private JList _breadList;
	private JList _meatList;
	private JList _cheeseList;
	private JLabel _sandwichAmountLabel;
	private JButton _makeSandwichButton;
		
	public JSandwich()
	{
		// Setup the frame
		super("Sublime Sandwich Shop");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);	
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		// Bread List
		DefaultListModel<JSandwichItems> breadListModel = new DefaultListModel<>();
		breadListModel.addElement(new JSandwichItems("White", 0.50));
		breadListModel.addElement(new JSandwichItems("Wheat", 0.75));
		breadListModel.addElement(new JSandwichItems("Rye", 0.90));
		breadListModel.addElement(new JSandwichItems("Sourdough", 1.00));
		_breadList = ListFactory(breadListModel);						
		
		// Meat List
		DefaultListModel<JSandwichItems> meatListModel = new DefaultListModel<>();
		meatListModel.addElement(new JSandwichItems("Roast Beef", 1.50));
		meatListModel.addElement(new JSandwichItems("Turkey", 0.75));
		meatListModel.addElement(new JSandwichItems("Ham", 1.00));
		_meatList = ListFactory(meatListModel);		
				
		// Cheese List
		DefaultListModel<JSandwichItems> cheeseListModel = new DefaultListModel<>();
		cheeseListModel.addElement(new JSandwichItems("American", 0.50));
		cheeseListModel.addElement(new JSandwichItems("Provolone", 0.75));
		cheeseListModel.addElement(new JSandwichItems("Cheddar", 1.25));
		cheeseListModel.addElement(new JSandwichItems("Swiss", 0.65));
		_cheeseList = ListFactory(cheeseListModel);				
						
		// Make Sandwich Button
		_makeSandwichButton = new JButton("Make My Sandwich");				
		_makeSandwichButton.addActionListener(this);
		_makeSandwichButton.setEnabled(false);
		
		// Sandwich Amount
		_sandwichAmountLabel = LabelFactory("$0.00", _labelFont);
		
		// Sandwich choices panel.  Contains bread, meat, and cheese panel
		JPanel sandwichChoicesPanel = new JPanel();		
		sandwichChoicesPanel.add(PanelFactory("Bread", _breadList));
		sandwichChoicesPanel.add(PanelFactory("Meat", _meatList));
		sandwichChoicesPanel.add(PanelFactory("Cheese", _cheeseList));
		add(sandwichChoicesPanel);				
							
		// Button panel.  Contains the "Make Sandwich" button
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(_makeSandwichButton);		
		add(buttonPanel);			
				
		// Sandwich Amount panel.  Contains the amount prompt and amount labels.
		JPanel sandwichAmountPanel = new JPanel();		
		sandwichAmountPanel.add(LabelFactory("Your sandwich costs: ", _labelFont));
		sandwichAmountPanel.add(_sandwichAmountLabel);
		add(sandwichAmountPanel);
		
		// Make it visible
		setVisible(true);
	}
	
	private JPanel PanelFactory(String caption, JList list)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));				
		panel.add(LabelFactory(caption, _listLabelFont));	
		panel.add(new JScrollPane(list));
		return panel;
	}

	private JList ListFactory(ListModel model)
	{
		JList list = new JList(model);
		list.addListSelectionListener(this); 
		list.setFixedCellHeight(15);
        list.setFixedCellWidth(200);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setVisibleRowCount(5);  
		return list;
	} 	
		
	private JLabel LabelFactory(String text, Font font)
	{
		JLabel label = new JLabel(text);
		label.setFont(font);
		return label;
	}
	
	private double GetPriceFromList(JList list)
	{
		double price = 0;
		JSandwichItems selectedItem = (JSandwichItems)list.getSelectedValue();
		if (selectedItem != null) price = selectedItem.getPrice();
		return price;
	}
	
	private void CalculateThePrice()
	{
		// Calculate the price
		double breadPrice = GetPriceFromList(_breadList);
		double meatPrice = GetPriceFromList(_meatList);
		double cheesePrice = GetPriceFromList(_cheeseList);		
		double price = breadPrice + meatPrice + cheesePrice;

		// Change the label
		_sandwichAmountLabel.setText(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(price));
		
		// If there is a selection in all 3 boxes, enable the "Make Sandwich" button.
		_makeSandwichButton.setEnabled((breadPrice > 0) && (meatPrice > 0) && (cheesePrice > 0));
	}
	
	private String GetDescriptionFromList(JList list)
	{
		return ((JSandwichItems)list.getSelectedValue()).getDescription();
	}
	
	private void MakeTheSandwich()
	{
		// Gather the selections
		String selectedBread = GetDescriptionFromList(_breadList);
		String selectedMeat = GetDescriptionFromList(_meatList);
		String selectedCheese = GetDescriptionFromList(_cheeseList);
		
		// Display the message
		String message = "Making your " + selectedMeat + " and " + selectedCheese + " on " + selectedBread + ".";
		JOptionPane.showMessageDialog(null, message	);
		
		// Clear the selection
		_breadList.clearSelection();
		_meatList.clearSelection();
		_cheeseList.clearSelection();
	}
		
	public void valueChanged(ListSelectionEvent e) 
	{
		CalculateThePrice();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		MakeTheSandwich();
	}
			
	public static void main(String[] args) 
	{		
		JSandwich jSandwich = new JSandwich();
	}
			
}