package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Stock Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SSNLable = new JLabel("SSN:");
		SSNLable.setFont(new Font("Tahoma", Font.PLAIN, 17));
		SSNLable.setBounds(10, 10, 244, 42);
		contentPane.add(SSNLable);
		
		JTextPane SSNtext = new JTextPane();
		SSNtext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		SSNtext.setText("Enter your 9-digits SSN");
		SSNtext.setForeground(Color.GRAY);
		SSNtext.setBounds(79, 11, 211, 42);
		contentPane.add(SSNtext);
		
		JLabel Flabel = new JLabel("F.name");
		Flabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Flabel.setBounds(10, 62, 244, 42);
		contentPane.add(Flabel);
		
		JTextPane Ftext = new JTextPane();
		Ftext.setText("Enter your F.name");
		Ftext.setForeground(Color.GRAY);
		Ftext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Ftext.setBounds(79, 61, 211, 42);
		contentPane.add(Ftext);
		
		JLabel lblNewLabel_2 = new JLabel("L.name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 114, 244, 42);
		contentPane.add(lblNewLabel_2);
		
		JTextPane Ltext = new JTextPane();
		Ltext.setText("Enter your L.Name");
		Ltext.setForeground(Color.GRAY);
		Ltext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Ltext.setBounds(79, 114, 212, 42);
		contentPane.add(Ltext);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 166, 244, 42);
		contentPane.add(lblNewLabel_3);
		
		JTextPane Etext = new JTextPane();
		Etext.setText("Enter your email address");
		Etext.setForeground(Color.GRAY);
		Etext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Etext.setBounds(79, 166, 211, 42);
		contentPane.add(Etext);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(10, 218, 244, 42);
		contentPane.add(lblNewLabel_4);
		
		JTextPane Atext = new JTextPane();
		Atext.setText("Enter your address");
		Atext.setForeground(Color.GRAY);
		Atext.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Atext.setBounds(79, 218, 211, 42);
		contentPane.add(Atext);
		
		JLabel lblNewLabel_4_1 = new JLabel("Acc type");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(10, 270, 244, 42);
		contentPane.add(lblNewLabel_4_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Standard brokerage account", "Retirement accounts", "Education accounts", "Investment accounts for kids"}));
		comboBox.setBounds(79, 270, 211, 42);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("ADD ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.Insert(SSNtext.getText(), Ftext.getText(), Ltext.getText(), Etext.getText(), Atext.getText(), comboBox.getSelectedItem().toString());
				Homepage fra=new Homepage();
				fra.setVisible(true);
				Main.super.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(255, 358, 149, 42);
		contentPane.add(btnNewButton);
	}
}
