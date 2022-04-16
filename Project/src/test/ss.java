package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class ss extends JFrame {

	private JPanel contentPane;
	private JTextField txtSsn;
	private JTextField txtLastname;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */

	private JLabel lblNewLabel_1;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ss frame = new ss();
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
	

	public ss() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtSsn = new JTextField();
		txtSsn.setForeground(Color.GRAY);
		txtSsn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSsn.setText("Enter your SSN");
		txtSsn.setBounds(120, 54, 154, 39);
		contentPane.add(txtSsn);
		txtSsn.setColumns(10);

		txtLastname = new JTextField();
		txtLastname.setForeground(Color.GRAY);
		txtLastname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLastname.setText("Enter your Last Name\r\n");
		txtLastname.setBounds(120, 100, 152, 39);
		contentPane.add(txtLastname);
		txtLastname.setColumns(10);

		btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (GUI.Check(txtSsn.getText(), txtLastname.getText())) {
					Homepage fra=new Homepage();
					fra.setVisible(true);
					ss.super.dispose();
					

				}
				else {
					lblNewLabel_1.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(154, 183, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Don't have an account? ");
		lblNewLabel.setBounds(80, 214, 147, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Register Now");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main fr = new Main();
				fr.setVisible(true);
				ss.super.dispose();
				
		
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(226, 210, 120, 21);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("Combination of SSN and Last Name not found!!");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(80, 160, 255, 13);
		lblNewLabel_1.setVisible(false);
		contentPane.add(lblNewLabel_1);
	}
}
