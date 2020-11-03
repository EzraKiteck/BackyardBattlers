import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class UI extends JFrame{
	
	DefaultListModel<Item> listModel = new DefaultListModel<>();

	public JList inventoryList = new JList(listModel);
	public JLabel statField = new JLabel("NAME: Joe");
	
	public JPanel southPanel = new JPanel();
	public JPanel buttonPanel = new JPanel();
	public JButton attackButton = new JButton("Attack");
	public JButton useButton = new JButton("Use");
	public JButton equipButton =  new JButton("Equip");
	
	public JLabel resultField = new JLabel(">You look around.");
	public JTextField actionField = new JTextField(">_");
	
	public UI() {
		listModel.addElement(new Weapon("Sword", "A common sword", 8, 10));
		listModel.addElement(new Item("Sandwich", "A sandwich"));
		
		this.setName("Backyard Battlers");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 600);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.add(inventoryList, BorderLayout.EAST);
		inventoryList.setBorder(new TitledBorder("Inventory"));
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
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		UI userInterface = new UI();
	}
}
