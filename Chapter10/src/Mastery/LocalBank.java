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
		frame.setBounds(100, 100, 417, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 381, 251);
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
		addAccFN.setBounds(10, 36, 125, 22);
		panel.add(addAccFN);
		addAccFN.setColumns(10);
		
		JButton addAcc = new JButton("Submit");
		addAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				
			}
		});
		addAcc.setBounds(280, 36, 89, 23);
		panel.add(addAcc);
		
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
		addAccLN.setBounds(145, 36, 125, 22);
		panel.add(addAccLN);
		
		JLabel lblNewLabel = new JLabel("Add Account");
		lblNewLabel.setBounds(10, 11, 156, 14);
		panel.add(lblNewLabel);
		
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
		enterID.setBounds(10, 98, 125, 20);
		panel.add(enterID);
		enterID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Access Account");
		lblNewLabel_1.setBounds(10, 73, 125, 14);
		panel.add(lblNewLabel_1);
		
		JButton accessAcc = new JButton("Submit");
		accessAcc.setBounds(145, 97, 89, 23);
		panel.add(accessAcc);
		
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
		withdraw.setBounds(10, 181, 125, 20);
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
		deposit.setBounds(10, 212, 125, 20);
		panel.add(deposit);
		
		balance = new JTextField();
		balance.setText("Account Balance");
		balance.setForeground(Color.GRAY);
		balance.setColumns(10);
		balance.setBounds(10, 150, 125, 20);
		panel.add(balance);
		
		JButton submitWithdraw = new JButton("Submit");
		submitWithdraw.setBounds(145, 180, 89, 23);
		panel.add(submitWithdraw);
		
		JButton submitDeposit = new JButton("Submit");
		submitDeposit.setBounds(145, 211, 89, 23);
		panel.add(submitDeposit);
		
		JButton rmvAcc = new JButton("Remove Account");
		rmvAcc.setBounds(244, 97, 125, 23);
		panel.add(rmvAcc);
		
		JLabel outputMsg = new JLabel("test");
		outputMsg.setBounds(254, 181, 115, 51);
		panel.add(outputMsg);
	}
}
