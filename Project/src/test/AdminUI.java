package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdminUI extends JFrame {
	public static int company_id;

	private JPanel contentPane;
	private JTextField txtEnterTheUnique;
	private JTextField txtEnterTheCompany;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField txtEnterTheUnique_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUI frame = new AdminUI();
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
	public AdminUI() {
		admin ex=new admin();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello admin, you are adding company info for id="+(ex.NextCompanyID+1));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 0, 395, 51);
		contentPane.add(lblNewLabel);
		
		txtEnterTheUnique = new JTextField();
		txtEnterTheUnique.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtEnterTheUnique.setText("Enter the unique company name");
		txtEnterTheUnique.setBounds(10, 40, 299, 27);
		contentPane.add(txtEnterTheUnique);
		txtEnterTheUnique.setColumns(10);
		
		txtEnterTheCompany = new JTextField();
		txtEnterTheCompany.setText("Enter the company address");
		txtEnterTheCompany.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtEnterTheCompany.setColumns(10);
		txtEnterTheCompany.setBounds(10, 77, 299, 27);
		contentPane.add(txtEnterTheCompany);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex.Insert_Company(txtEnterTheUnique.getText(),txtEnterTheCompany.getText());
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(341, 111, 85, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("______OR______");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 114, 161, 27);
		contentPane.add(lblNewLabel_1);
		
		textField =  new JTextField();
		textField.setText("Enter the unique company name");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBounds(10, 169, 299, 27);
		contentPane.add(textField);
		
		txtEnterTheUnique_1 = new JTextField();
		txtEnterTheUnique_1.setText("Enter the unique ID");
		txtEnterTheUnique_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtEnterTheUnique_1.setColumns(10);
		txtEnterTheUnique_1.setBounds(10, 206, 299, 27);
		contentPane.add(txtEnterTheUnique_1);
		
		lblNewLabel_2 = new JLabel("Edit Stock Prices for existing company");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 142, 344, 21);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Company Not Found");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(10, 243, 267, 20);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ex.Check(textField.getText(),Integer.parseInt(txtEnterTheUnique_1.getText()))) {
					company_id=Integer.parseInt(txtEnterTheUnique_1.getText());
					AdminStock fr=new AdminStock();
					fr.setVisible(true);
					AdminUI.super.dispose();
					
				}
				else {
					lblNewLabel_3.setVisible(true);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(341, 243, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
