package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class LocalBank {

	private JFrame frame;
	private JTextField addAccFN;
	private JTextField addAccLN;
	private JTextField enterID;
	private JTextField withdraw;
	private JTextField deposit;
	private JTextField balance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
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
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 714, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 678, 336);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		String[] acc = {"fN" , "lN" , "bal", "iD"};
		
		String[] accList = {  };
		
		addAccFN = new JTextField();
		addAccFN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				addAccFN.setText("");
				
			}
		});
		addAccFN.setForeground(new Color(128, 128, 128));
		addAccFN.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addAccFN.setText("First name");
		addAccFN.setBounds(10, 44, 125, 22);
		panel.add(addAccFN);
		addAccFN.setColumns(10);
		
		addAccLN = new JTextField();
		addAccLN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
				addAccLN.setText("");
			
			}
		});
		addAccLN.setText("Last name");
		addAccLN.setForeground(Color.GRAY);
		addAccLN.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addAccLN.setColumns(10);
		addAccLN.setBounds(10, 77, 125, 22);
		panel.add(addAccLN);
		
		enterID = new JTextField();
		enterID.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				enterID.setText("");
				
			}
		});
		enterID.setForeground(new Color(128, 128, 128));
		enterID.setText("Enter account ID");
		enterID.setBounds(10, 110, 125, 20);
		panel.add(enterID);
		enterID.setColumns(10);
		
		withdraw = new JTextField();
		withdraw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				withdraw.setText("");
				
			}
		});
		withdraw.setForeground(new Color(128, 128, 128));
		withdraw.setText("Withdraw Amount");
		withdraw.setBounds(10, 172, 125, 20);
		panel.add(withdraw);
		withdraw.setColumns(10);
		
		deposit = new JTextField();
		deposit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
				deposit.setText("");
			
			}
		});
		deposit.setText("Deposit Amount");
		deposit.setForeground(Color.GRAY);
		deposit.setColumns(10);
		deposit.setBounds(10, 203, 125, 20);
		panel.add(deposit);
		
		balance = new JTextField();
		balance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
				balance.setText("");
			
			}
		});
		balance.setText("Account Balance");
		balance.setForeground(Color.GRAY);
		balance.setColumns(10);
		balance.setBounds(10, 141, 125, 20);
		panel.add(balance);
		
		JComboBox action = new JComboBox();

		action.setModel(new DefaultComboBoxModel(new String[] {"Deposit", "Withdrawal", "Check Balance", "Add Account", "Remove Account"}));
		action.setBounds(10, 11, 125, 22);
		panel.add(action);
		
		JLabel lNLabel = new JLabel("Last Name");
		lNLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lNLabel.setBounds(145, 81, 72, 14);
		panel.add(lNLabel);
		
		JLabel fNLabel = new JLabel("First Name");
		fNLabel.setForeground(new Color(0, 0, 0));
		fNLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		fNLabel.setBounds(145, 48, 72, 14);
		panel.add(fNLabel);
		
		JLabel iDLabel = new JLabel("ID");
		iDLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		iDLabel.setBounds(145, 113, 46, 14);
		panel.add(iDLabel);
		
		JLabel balLabel = new JLabel("Balance");
		balLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		balLabel.setBounds(145, 144, 46, 14);
		panel.add(balLabel);
		
		JLabel withLabel = new JLabel("Withdraw");
		withLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		withLabel.setBounds(145, 175, 72, 14);
		panel.add(withLabel);
		
		JLabel depLabel = new JLabel("Deposit");
		depLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		depLabel.setBounds(145, 206, 46, 14);
		panel.add(depLabel);
		
		JLabel lblNewLabel = new JLabel("Edit textboxes next\r");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(145, 0, 103, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("to red labels");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(144, 15, 73, 14);
		panel.add(lblNewLabel_1);
		
		JTextArea disp = new JTextArea();
		disp.setBounds(10, 268, 658, 57);
		panel.add(disp);
		
		action.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(action.getSelectedItem().equals("Add Account"))
				{
					
					// Highlights required first name, last name, and balance text boxes in red
					
					fNLabel.setForeground(Color.red);
					lNLabel.setForeground(Color.red);
					balLabel.setForeground(Color.red);
					
					iDLabel.setForeground(Color.black);
					depLabel.setForeground(Color.black);
					withLabel.setForeground(Color.black);
				}
				
				else if(action.getSelectedItem().equals("Remove Account"))
				{
					// Highlights required ID text box in red
					
					iDLabel.setForeground(Color.red);
					
					fNLabel.setForeground(Color.black);
					lNLabel.setForeground(Color.black);
					balLabel.setForeground(Color.black);
					depLabel.setForeground(Color.black);
					withLabel.setForeground(Color.black);
				}
				
				else if(action.getSelectedItem().equals("Deposit")) 
				{
					// Highlights required ID and deposit text boxes in red
					
					iDLabel.setForeground(Color.red);
					depLabel.setForeground(Color.red);
					
					fNLabel.setForeground(Color.black);
					lNLabel.setForeground(Color.black);
					balLabel.setForeground(Color.black);
					withLabel.setForeground(Color.black);
					
				}
				
				else if(action.getSelectedItem().equals("Withdrawal"))
				{
					// Highlights required ID and withdrawal text boxes in red
					
					iDLabel.setForeground(Color.red);
					withLabel.setForeground(Color.red);
					
					fNLabel.setForeground(Color.black);
					lNLabel.setForeground(Color.black);
					balLabel.setForeground(Color.black);
					depLabel.setForeground(Color.black);

				}
				
				else if(action.getSelectedItem().equals("Check Balance"))
				{
					// Highlights required ID text box in red
					
					iDLabel.setForeground(Color.red);
					
					fNLabel.setForeground(Color.black);
					lNLabel.setForeground(Color.black);
					balLabel.setForeground(Color.black);
					withLabel.setForeground(Color.black);
					depLabel.setForeground(Color.black);

				}
				
			}
		});
		
		Bank easySave = new Bank();
		
		JButton performAction = new JButton("Submit");
		performAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Adding an account
				if(action.getSelectedItem().equals("Add Account"))
				{

					easySave.addAcc(addAccFN.getText(), addAccLN.getText(), Double.parseDouble(balance.getText()));
					disp.setText(easySave.addAcc(addAccFN.getText(), addAccLN.getText(), Double.parseDouble(balance.getText())));

				}
				
				//Removing an account
				else if(action.getSelectedItem().equals("Remove Account"))
				{
					
					easySave.rmvAcc(enterID.getText());
					disp.setText(easySave.rmvAcc(enterID.getText()));
					
				}
				
				// Making a deposit
				else if(action.getSelectedItem().equals("Deposit")) 
				{

					easySave.Transaction(1, enterID.getText(), Double.parseDouble(deposit.getText()));
					disp.setText(easySave.Transaction(1, enterID.getText(), Double.parseDouble(deposit.getText())));
					
				}
				
				// Making a withdrawal
				else if(action.getSelectedItem().equals("Withdrawal"))
				{
					
					easySave.Transaction(2, enterID.getText(), Double.parseDouble(withdraw.getText()));
					disp.setText(easySave.Transaction(2, enterID.getText(), Double.parseDouble(withdraw.getText())));
				}
				
				// Checking balance
				else 
				{
					
					easySave.accessAcc(enterID.getText());
					disp.setText(easySave.accessAcc(enterID.getText()));
					
				}
				
			}
		});
		
		performAction.setBounds(10, 234, 125, 23);
		panel.add(performAction);
		
	}
}
