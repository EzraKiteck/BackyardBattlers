import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class UI extends JFrame{
	
	DefaultListModel<Item> listModel = new DefaultListModel<>();

	public JPanel mainPanel = new JPanel();
	public JLabel mainLabel = new JLabel("Game window goes here.");
	
	public JPanel inventoryPanel = new JPanel();
	public JList inventoryList = new JList(listModel);
	public JTextArea statField = new JTextArea(5, 13);
	public JTextArea descriptionField = new JTextArea(5, 13);

	public JPanel southPanel = new JPanel();
	public JPanel buttonPanel = new JPanel();
	public JButton attackButton = new JButton("Attack");
	public JButton useButton = new JButton("Use");
	public JButton equipButton =  new JButton("Equip");
	
	public JLabel resultField = new JLabel(">You look around.");
	public JTextField actionField = new JTextField();
	
	public UI() {
		listModel.addElement(new Weapon("Sword", "A common sword", 8, 10));
		listModel.addElement(new Item("Sandwich", "A sandwich"));
		listModel.addElement(new Item("Sandwich", "A sandwich"));
		listModel.addElement(new Item("Sandwich", "A sandwich"));
		listModel.addElement(new Item("Sandwich", "A sandwich"));

		this.setName("Backyard Battlers");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.add(inventoryPanel, BorderLayout.EAST);
		inventoryPanel.setBorder(new TitledBorder("Inventory"));
		inventoryPanel.setLayout(new BoxLayout(inventoryPanel, BoxLayout.PAGE_AXIS));
		inventoryPanel.add(inventoryList);
		inventoryPanel.add(descriptionField);
		this.add(mainPanel, BorderLayout.CENTER);
		mainPanel.add(mainLabel);
		mainLabel.setPreferredSize(new Dimension(400, 400));
		this.add(statField, BorderLayout.WEST);
		statField.setBorder(new TitledBorder("Stats"));
		this.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.PAGE_AXIS));
		southPanel.add(resultField);
		southPanel.add(actionField);
		southPanel.add(buttonPanel);
		buttonPanel.setBorder(new TitledBorder("Actions"));
		buttonPanel.add(attackButton);
		buttonPanel.add(useButton);
		buttonPanel.add(equipButton);
		
		descriptionField.setEditable(false);
		descriptionField.setLineWrap(true);
		descriptionField.setText("Name: Sword of Awesomeness \n 'A legendary blade forged from the scales of the great dragon Zaros. All who wield this weapon are said to be imbued by the spirit of the Last Hero.");
		
		statField.setEditable(false);
		statField.setLineWrap(true);
		statField.setText("Name: Malaki\nHP: 15/25\nATK: 6\nDEF: 7\nSPD: 4");
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		UI userInterface = new UI();
	}
}
