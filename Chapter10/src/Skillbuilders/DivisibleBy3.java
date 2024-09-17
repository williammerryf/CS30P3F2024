package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 323, 138);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel output = new JLabel("");
		output.setBounds(121, 61, 174, 23);
		panel.add(output);
		
		JButton checkbtn = new JButton("Check");
		checkbtn.setBounds(22, 61, 89, 23);
		checkbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				int inputTxt = Integer.parseInt(input.getText());
				
				if (inputTxt % 3 == 0) {
					output.setText("Number is divisible by 3");
				} else {
					output.setText("Number is not divisible by 3");
				}
				
			}
		});
		panel.setLayout(null);
		panel.add(checkbtn);
		
		JLabel lblNewLabel = new JLabel("Enter an integer:");
		lblNewLabel.setBounds(22, 36, 177, 14);
		panel.add(lblNewLabel);
		
		input = new JTextField();
		input.setBounds(121, 33, 86, 20);
		panel.add(input);
		input.setColumns(10);
		
	}
}
