package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.random.*;
import javax.swing.JTextArea;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Images
		ImageIcon placeholder = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\plateImages\\placeholder.gif");
		ImageIcon allBroken = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\plateImages\\plates_all_broken.gif");
		ImageIcon twoBroken = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\plateImages\\plates_two_broken.gif");
		ImageIcon plates = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\plateImages\\plates.gif");
		ImageIcon prize1 = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\plateImages\\sticker.gif");
		ImageIcon prize2 = new ImageIcon("C:\\Users\\27074009\\git\\CS30P3F2024\\Chapter10\\src\\plateImages\\tiger_plush.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Displays game name
		JLabel lblNewLabel = new JLabel("BreakAPlate");
		lblNewLabel.setBounds(10, 11, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		//Displays image of plates
		JLabel imgPlates = new JLabel("");
		imgPlates.setBounds(10, 25, 285, 124);
		frame.getContentPane().add(imgPlates);
		
		//Displays prize won message
		JTextArea disp = new JTextArea();
		disp.setBounds(78, 174, 136, 23);
		frame.getContentPane().add(disp);
		
		//Displays image of prize
		JLabel imgPrize = new JLabel("");
		imgPrize.setBounds(88, 209, 136, 124);
		frame.getContentPane().add(imgPrize);
		
		imgPlates.setIcon(plates);
		
		JButton btn = new JButton("Play");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				// Generate 3 random numbers
				Random r = new Random();
				int num1 = r.nextInt(2);
				int num2 = r.nextInt(2);
				int num3 = r.nextInt(2);
				
				//Conditional for winning
				if(num1 == num2 && num2 == num3) 
				{
					
					imgPlates.setIcon(allBroken);
					imgPrize.setIcon(prize2);
					disp.setText("You win: Tiger Plush!");
				
				//Else statement for losing
				} else {
				
					imgPlates.setIcon(twoBroken);
					imgPrize.setIcon(prize1);
					disp.setText("You win: Sticker!");
					
				}
				
			}
		});
		btn.setBounds(102, 140, 89, 23);
		frame.getContentPane().add(btn);
		
	}
}
