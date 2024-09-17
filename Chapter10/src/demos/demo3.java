package demos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class demo3 {

	private JFrame frame;
	private JTextField fnt;
	private JTextField lnt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo3 window = new demo3();
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
	public demo3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon cres = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\images\\chhs.png");
		ImageIcon pear = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\images\\pearson.png");
		ImageIcon wes = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\images\\western.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 596, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 560, 596);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fnt = new JTextField();
		fnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
				fnt.setText("");
			
			}
		});
		fnt.setForeground(new Color(128, 128, 128));
		fnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fnt.setText("first name");
		fnt.setBounds(10, 11, 151, 33);
		panel.add(fnt);
		fnt.setColumns(10);
		
		lnt = new JTextField();
		lnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
				lnt.setText("");
			
			}
		});
		lnt.setForeground(new Color(128, 128, 128));
		lnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lnt.setText("last name");
		lnt.setColumns(10);
		lnt.setBounds(171, 11, 151, 33);
		panel.add(lnt);
		

		
		JLabel img = new JLabel("");
		img.setBounds(10, 297, 312, 288);
		panel.add(img);
		
		JTextArea disp = new JTextArea();
		disp.setBounds(10, 126, 308, 153);
		panel.add(disp);
		
		JComboBox grades = new JComboBox();
		grades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "10", "11", "12"}));
		grades.setBounds(10, 58, 151, 33);
		panel.add(grades);
		
		JComboBox schools = new JComboBox();
		schools.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Crescent", "Pearson", "Western"}));
		schools.setFont(new Font("Tahoma", Font.PLAIN, 16));
		schools.setBounds(171, 58, 151, 33);
		panel.add(schools);
		
		JButton btn = new JButton("Submit");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				String grade = " ";
				String school = " ";
				String fN = fnt.getText();
				String lN = lnt.getText();
				
				//Grade selection
				
				if (grades.getSelectedItem().equals("10")) 
				{
					grade = "10";
				} else if (grades.getSelectedItem().equals("11")) 
				{
					grade = "11";
				} else {
					grade = "12";
				}
				
				//School Selection
				
				if (schools.getSelectedItem().equals("Crescent")) 
				{
					school = "Crescent";
					img.setIcon(cres);
					
				} else if (schools.getSelectedItem().equals("Western")) 
				{
					school = "Western";
					img.setIcon(wes);
				} else {
					school = "Pearson";
					img.setIcon(pear);
				}
				
				//Display information
				
				disp.setText
				(
					fN + " " + 
					lN + " is in grade " + 
					grade + " and goes to " +
					school + "."
				);
			
			}
		});
		
		btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn.setBounds(350, 11, 200, 300);
		panel.add(btn);
		
	}
}
