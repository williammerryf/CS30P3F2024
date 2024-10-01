package TeacherLocalBankGUI;

import java.text.NumberFormat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LocalBankGUI {

	private JFrame frame;
	private JTextField acctNum;
	private JTextField amt;
	private JTextField fName;
	private JTextField lName;
	private JTextField begBalance;
	
	Bank easySave = new Bank();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBankGUI window = new LocalBankGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LocalBankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		acctNum = new JTextField();
		acctNum.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				acctNum.setText(null);
			}
		});
		acctNum.setForeground(Color.GRAY);
		acctNum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		acctNum.setText("Enter account Number:");
		acctNum.setBounds(34, 106, 436, 19);
		frame.getContentPane().add(acctNum);
		acctNum.setColumns(10);
		
		amt = new JTextField();
		amt.setText("Enter amount:");
		amt.setForeground(Color.GRAY);
		amt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amt.setColumns(10);
		amt.setBounds(34, 140, 436, 19);
		frame.getContentPane().add(amt);
		
		fName = new JTextField();
		fName.setText("Enter first name:");
		fName.setForeground(Color.GRAY);
		fName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fName.setColumns(10);
		fName.setBounds(34, 179, 436, 19);
		frame.getContentPane().add(fName);
		
		lName = new JTextField();
		lName.setText("Enter last name:");
		lName.setForeground(Color.GRAY);
		lName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lName.setColumns(10);
		lName.setBounds(34, 214, 436, 19);
		frame.getContentPane().add(lName);
		
		begBalance = new JTextField();
		begBalance.setText("Enter beginning balance:");
		begBalance.setForeground(Color.GRAY);
		begBalance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		begBalance.setColumns(10);
		begBalance.setBounds(34, 253, 436, 19);
		frame.getContentPane().add(begBalance);
		
		JLabel acctinfo = new JLabel("Account info displayed here");
		acctinfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		acctinfo.setBounds(34, 296, 436, 52);
		frame.getContentPane().add(acctinfo);
		
		JComboBox bankActivities = new JComboBox();
		
		JButton btnNewButton = new JButton("Process Transaction");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String amount, message;
				
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					amount = amt.getText();
					message = easySave.transaction(1, acctNum.getText(), Double.parseDouble(amount));
				}
				else if(bankActivities.getSelectedItem().equals("Widhdrawal"))
				{
					amount = amt.getText();
					message = easySave.transaction(2, acctNum.getText(), Double.parseDouble(amount));
				}
				else if(bankActivities.getSelectedItem().equals("Check Balance"))
				{
					//You have complete this method
				}
				else if(bankActivities.getSelectedItem().equals("Add Account"))
				{
					amount = begBalance.getText();
					message = easySave.addAccount(fName.getText(),lName.getText(), Double.parseDouble(amount));
					acctinfo.setText("New Account ID: " + message);
				}
				else if(bankActivities.getSelectedItem().equals("Remove Account"))
				{
					//You have complete this method
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(34, 358, 210, 54);
		frame.getContentPane().add(btnNewButton);
		
		
		
		bankActivities.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					acctNum.setForeground(Color.red);
					amt.setForeground(Color.red);
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawal"))
				{
					
				}
					
				
				
			}
		});
		bankActivities.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bankActivities.setModel(new DefaultComboBoxModel(new String[] {"Select an action:", "Deposit", "Widhdrawal", "Check Balance", "Add Account", "Remove Account"}));
		bankActivities.setBounds(34, 24, 436, 46);
		frame.getContentPane().add(bankActivities);
	}
}
	
	/*
	private JFrame frame;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBankGUI window = new LocalBankGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 *//*
	public LocalBankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 *//*
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}*/
