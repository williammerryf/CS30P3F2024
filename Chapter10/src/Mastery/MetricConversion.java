package Mastery;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 230, 133);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//Create combo box
	    String[] conversion = {"Select Conversion", "Inches to centimeters", "Feet to meters", "Gallons to litres", "Pounds to kilograms"};
		JComboBox conversionType = new JComboBox(conversion);
		conversionType.setModel(new DefaultComboBoxModel(new String[] {"Select Conversion", "Inches to centimeters", "Feet to meters", "Gallons to litres", "Pounds to kilograms"}));
		conversionType.setBounds(10, 11, 194, 22);
		panel.add(conversionType);
		
		//Displays output
		
		JLabel output = new JLabel("");
		output.setBackground(new Color(255, 255, 255));
		output.setBounds(10, 44, 201, 22);
		panel.add(output);

		//Action listener 
		
		conversionType.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent e) 
			{
				JComboBox comboBox = (JComboBox)e.getSource();
				String selection = (String)comboBox.getSelectedItem();
			
				//Conditionals for what user selects from combo box
				
				if (selection == "Inches to centimeters") {
					output.setText("1 inch = 2.54 centimetres");
				
				} else if (selection == "Feet to meters") {
					output.setText("1 foot = 0.3048 metres");
					
				} else if (selection == "Gallons to litres") {
					output.setText("1 gallon = 4.5461 metres");
					
				} else if (selection == "Pounds to kilograms") {
					output.setText("1 pound = 0.4536 kilograms");
				} else {
					output.setText("");
				}
				
			}
			
		});	
	}	
}

