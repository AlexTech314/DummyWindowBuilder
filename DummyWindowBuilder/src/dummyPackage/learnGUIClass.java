package dummyPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class learnGUIClass {

	private JFrame frame;
	private JTextField txtWelcomeToThe;
	private JLabel lblTestBox;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					learnGUIClass window = new learnGUIClass();
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
	public learnGUIClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Show Message");
		btnNewButton.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Hi. We are learning here, in this Dummy Repo");
				lblTestBox.setBounds(50, 180, 160, 64);
				
				lblTestBox.setText("aaaaand now its changed up");
				
				
			}
		});
		btnNewButton.setBounds(262, 306, 185, 81);
		frame.getContentPane().add(btnNewButton);
		
		txtWelcomeToThe = new JTextField();
		txtWelcomeToThe.setText("Welcome to the party");
		txtWelcomeToThe.setBounds(34, 28, 185, 81);
		frame.getContentPane().add(txtWelcomeToThe);
		txtWelcomeToThe.setColumns(10);
		
		lblTestBox = new JLabel("My test box^");
		lblTestBox.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblTestBox.setBackground(Color.CYAN);
		lblTestBox.setBounds(34, 120, 81, 32);
		frame.getContentPane().add(lblTestBox);
	}
}
