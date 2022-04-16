package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buy extends JFrame {

	

	private JPanel contentPane;
	private JTextField txtEnterTheNumber;
	private JTextField txtBuying;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy frame = new Buy();
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
	public Buy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterTheNumber = new JTextField();
		txtEnterTheNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEnterTheNumber.setText("enter the number of shares");
		txtEnterTheNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEnterTheNumber.getText().equals("enter the number of shares")) {
					txtEnterTheNumber.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEnterTheNumber.getText().equals("")) {
					txtEnterTheNumber.setText("enter the number of shares");
			}}
		});
		txtEnterTheNumber.setBounds(10, 47, 261, 50);
		contentPane.add(txtEnterTheNumber);
		txtEnterTheNumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Buy Stock");
		btnNewButton.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.Buy_Stock(Integer.parseInt(txtEnterTheNumber.getText()));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(209, 107, 139, 21);
		contentPane.add(btnNewButton);
		
		txtBuying = new JTextField();
		txtBuying.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBuying.setEditable(false);
		txtBuying.setText("BUY Shares:");
		txtBuying.setBounds(10, 18, 130, 19);
		contentPane.add(txtBuying);
		txtBuying.setColumns(10);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage fr=new Homepage();
				fr.setVisible(true);
				Buy.super.dispose();
			}
		});
		btnNewButton_1.setBounds(323, 232, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
