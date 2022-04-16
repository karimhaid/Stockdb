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

public class AdminStock extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterStockPrice;
	private JTextField txtOrModifyThe;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminStock frame = new AdminStock();
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
	public AdminStock() {
		admin ex=new admin();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterStockPrice = new JTextField();
		txtEnterStockPrice.setBounds(5, 5, 426, 19);
		txtEnterStockPrice.setText("Enter Stock Price of the company");
		contentPane.add(txtEnterStockPrice);
		txtEnterStockPrice.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminUI fr=new AdminUI();
				fr.setVisible(true);
				AdminStock.super.dispose();
			}
		});
		btnNewButton.setBounds(5, 237, 426, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add price");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex.Insert_Stock(Double.parseDouble(txtEnterStockPrice.getText()),AdminUI.company_id);
				
			}
		});
		btnNewButton_1.setBounds(346, 37, 85, 21);
		contentPane.add(btnNewButton_1);
		
		txtOrModifyThe = new JTextField();
		txtOrModifyThe.setText("Or modify the price if already existed");
		txtOrModifyThe.setBounds(5, 94, 312, 19);
		contentPane.add(txtOrModifyThe);
		txtOrModifyThe.setColumns(10);
		
		btnNewButton_2 = new JButton("modify");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ex.UpdatePrice(AdminUI.company_id, Double.parseDouble(txtOrModifyThe.getText()));
			}
		});
		btnNewButton_2.setBounds(346, 122, 85, 21);
		contentPane.add(btnNewButton_2);
	}

}
