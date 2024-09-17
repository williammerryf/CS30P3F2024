package Skillbuilders;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class LatinPlantNames{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 103);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel latinPlant = DefaultComponentFactory.getInstance().createLabel("");
		latinPlant.setBounds(114, 34, 98, 22);
		panel.add(latinPlant);
		
		JLabel lblNewLabel = new JLabel("Select a plant name:");
		lblNewLabel.setBounds(10, 11, 119, 14);
		panel.add(lblNewLabel);
		
		String[] names = {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"};
		
		JComboBox comboBox = new JComboBox(names);
		comboBox.setBounds(10, 34, 98, 22);
		panel.add(comboBox);

		comboBox.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent e) 
			{
				JComboBox comboBox = (JComboBox)e.getSource();
				String plant = (String)comboBox.getSelectedItem();
			
				if (plant == "basil") {
					latinPlant.setText("Ocimum");
				
				} else if (plant == "lavender") {
					latinPlant.setText("Lavandula spica");
					
				} else if (plant == "parsley") {
					latinPlant.setText("Apium");
					
				} else if (plant == "perppermint") {
					latinPlant.setText("Mentha piperita");
		     		
				} else if (plant == "saffron") {
					latinPlant.setText("Crocus");
					
				} else if (plant == "sage") {
					latinPlant.setText("Salvia");
				}
			}});
		}}
		





















