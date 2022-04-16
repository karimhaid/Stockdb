package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bank extends JFrame {

	private JPanel contentPane;
	private JTextField Accountnum;
	private JTextField routingnum;
	private JTextField Bankname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank frame = new Bank();
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
	public Bank() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Accountnum = new JTextField();
		Accountnum.setForeground(Color.GRAY);
		Accountnum.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Accountnum.setText("Enter you bank account #");
		Accountnum.setBounds(34, 31, 317, 40);
		contentPane.add(Accountnum);
		Accountnum.setColumns(10);
		
		routingnum = new JTextField();
		routingnum.setText("Enter you bank account routing#");
		routingnum.setForeground(Color.GRAY);
		routingnum.setFont(new Font("Tahoma", Font.PLAIN, 17));
		routingnum.setColumns(10);
		routingnum.setBounds(34, 85, 317, 40);
		contentPane.add(routingnum);
		
		Bankname = new JTextField();
		Bankname.setText("Enter your bank name");
		Bankname.setForeground(Color.GRAY);
		Bankname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Bankname.setColumns(10);
		Bankname.setBounds(34, 135, 317, 40);
		contentPane.add(Bankname);
		
		JComboBox Accounttype = new JComboBox();
		Accounttype.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Accounttype.setModel(new DefaultComboBoxModel(new String[] {"Savings Account", "Checking Account"}));
		Accounttype.setBounds(34, 185, 317, 40);
		contentPane.add(Accounttype);
		
		JButton Add = new JButton("ADD");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.InsertBank(Integer.parseInt(Accountnum.getText()),Integer.parseInt(routingnum.getText()),Bankname.getText(), Accounttype.getSelectedItem().toString());
			}
		});
		Add.setBounds(269, 235, 85, 21);
		contentPane.add(Add);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage fr=new Homepage();
				fr.setVisible(true);
				Bank.super.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(409, 395, 96, 31);
		contentPane.add(btnNewButton);
	}
}
