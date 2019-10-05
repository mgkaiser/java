// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import javax.swing.event.*; 
import java.awt.*; 
import javax.swing.*; 

public class JCapitals extends JFrame implements ListSelectionListener
{	
	final int FRAME_WIDTH = 350;
	final int FRAME_HEIGHT = 200;
	
	private Font _labelFont = new Font("Arial", Font.PLAIN, 16);
	private Font _listLabelFont = new Font("Arial", Font.BOLD, 14);

	private JList _capitalList;	
	private JLabel _capitalLabel;
	
	public JCapitals()
	{
		// Setup the frame
		super("Countries and Capitals");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);	
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		// Country/Capital list
		DefaultListModel<JCapitalsItems> capitalListModel = new DefaultListModel<>();
		capitalListModel.addElement(new JCapitalsItems("Canada", "Ottawa"));		
		capitalListModel.addElement(new JCapitalsItems("France", "Paris"));		
		capitalListModel.addElement(new JCapitalsItems("Germany", "Berlin"));		
		capitalListModel.addElement(new JCapitalsItems("India", "New Delhi"));		
		capitalListModel.addElement(new JCapitalsItems("Mexico", "Mexico City"));
		capitalListModel.addElement(new JCapitalsItems("United Kingdom", "London"));					
		capitalListModel.addElement(new JCapitalsItems("United States", "Washington"));		
		_capitalList = ListFactory(capitalListModel);						
				
		// Sandwich Amount
		_capitalLabel = LabelFactory("", _labelFont);
		
		// Country Choices panel
		JPanel countryChoicesPanel = new JPanel();		
		countryChoicesPanel.add(PanelFactory("Countries", _capitalList));		
		add(countryChoicesPanel);				
							
		// Sandwich Amount panel.  Contains the amount prompt and amount labels.
		JPanel capitalPanel = new JPanel();				
		capitalPanel.add(_capitalLabel);
		add(capitalPanel);
		
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
		JCapitalsItems selectedItem = (JCapitalsItems)_capitalList.getSelectedValue();
		_capitalLabel.setText("The capital of " + selectedItem.getCountry() + " is " + selectedItem.getCapital() + ".");
	}
	
	public static void main(String[] args) 
	{		
		JCapitals jCapitals = new JCapitals();
	}
			
}