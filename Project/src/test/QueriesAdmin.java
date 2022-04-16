package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class QueriesAdmin extends JFrame {

	private JPanel contentPane1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueriesAdmin frame = new QueriesAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QueriesAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Decrease/increase the share price of X by %%", "Retrieve name of all investors who bought more than ten stocks of Microsoft at once.", "Retrieve the name of all investors who don\u2019t invest in at least one stock.", "Retrieve the names of people using multiple bank accounts", "Retrieve the price of stock for company X", "Retrieve the average stocks bought", "Retrieve the amount of stocks in the table", "Retrieve the count of each investor that belongs to each of the investor types", "Retrieve the amount of shares each investor has bought in total."}));
		comboBox.setBounds(10, 10, 426, 56);
		contentPane1.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setLabelFor(comboBox);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 79, 416, 109);
		contentPane1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("TRY!");
		btnNewButton.setBounds(10, 232, 85, 21);
		contentPane1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(341, 232, 85, 21);
		contentPane1.add(btnNewButton_1);
	}
}
