// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

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
	private JLabel _sandiwchAmountLabel;
		
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
		_cheeseList = ListFactory(cheeseListModel);				
						
		// Make Sandwich Button
		JButton makeSandwichButton = new JButton("Make My Sandwich");				
		makeSandwichButton.addActionListener(this);
		
		// Sandwich Amount
		_sandiwchAmountLabel = LabelFactory("$0.00", _labelFont);
		
		// Sandwich choices panel.  Contains bread, meat, and cheese panel
		JPanel sandwichChoicesPanel = new JPanel();		
		sandwichChoicesPanel.add(PanelFactory("Bread", _breadList));
		sandwichChoicesPanel.add(PanelFactory("Meat", _meatList));
		sandwichChoicesPanel.add(PanelFactory("Cheese", _cheeseList));
		add(sandwichChoicesPanel);				
							
		// Button panel.  Contains the "Make Sandwich" button
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(makeSandwichButton);		
		add(buttonPanel);			
				
		// Sandwich Amount panel.  Contains the amount prompt and amount labels.
		JPanel sandwichAmountPanel = new JPanel();		
		sandwichAmountPanel.add(LabelFactory("Your sandwich costs: ", _labelFont));
		sandwichAmountPanel.add(_sandiwchAmountLabel);
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
		
	public void valueChanged(ListSelectionEvent e) 
	{
		JOptionPane.showMessageDialog(null, "List Select");
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "Sandwich Make");
	}
			
	public static void main(String[] args) 
	{		
		JSandwich jSandwich = new JSandwich();
	}
			
}