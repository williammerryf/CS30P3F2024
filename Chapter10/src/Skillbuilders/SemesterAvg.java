package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class SemesterAvg {

	private JFrame frame;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 1);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel gr1 = DefaultComponentFactory.getInstance().createLabel("Grade 1");
		gr1.setBounds(10, 26, 49, 33);
		frame.getContentPane().add(gr1);
		
		grade1 = new JTextField();
		grade1.setBounds(58, 32, 86, 20);
		frame.getContentPane().add(grade1);
		grade1.setColumns(10);
		
		JLabel gr2 = DefaultComponentFactory.getInstance().createLabel("Grade 2");
		gr2.setBounds(10, 64, 49, 33);
		frame.getContentPane().add(gr2);
		
		JLabel gr3 = DefaultComponentFactory.getInstance().createLabel("Grade 3");
		gr3.setBounds(10, 101, 49, 33);
		frame.getContentPane().add(gr3);
		
		grade2 = new JTextField();
		grade2.setBounds(58, 70, 86, 20);
		frame.getContentPane().add(grade2);
		grade2.setColumns(10);
		
		grade3 = new JTextField();
		grade3.setBounds(58, 106, 86, 20);
		frame.getContentPane().add(grade3);
		grade3.setColumns(10);
		
		JLabel disp = DefaultComponentFactory.getInstance().createLabel("");
		disp.setBackground(new Color(0, 0, 0));
		disp.setBounds(210, 26, 92, 142);
		frame.getContentPane().add(disp);
		
		JButton btn = new JButton("Submit");
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			
				DecimalFormat dc = new DecimalFormat("0.00");
				
				double gradeTxt1 = Double.parseDouble(grade1.getText());
				double gradeTxt2 = Double.parseDouble(grade2.getText());
				double gradeTxt3 = Double.parseDouble(grade3.getText());
				
				double avg = (gradeTxt1 + gradeTxt2 + gradeTxt3)/3;
				
				disp.setText((dc.format(avg)));
			
			}
		});
		btn.setBounds(58, 145, 89, 23);
		frame.getContentPane().add(btn);
		
	}
}
