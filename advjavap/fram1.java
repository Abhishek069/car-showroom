package advjavap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
//import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import java.awt.event.*;

public class fram1 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtFristName;
	private JTextField txtLastName;
	private JTextField txtEmailId;
	private JTextField txtNewPassord;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fram1 window = new fram1();
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
	public fram1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBounds(100, 100, 1200, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(281, 215, 297, 394);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\All Java p\\popnt.jpg"));
		lblNewLabel.setBounds(10, 0, 251, 435);
		panel.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Create a new Account");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 35));
		lblNewLabel_1.setBounds(598, 212, 361, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtFristName = new JTextField();
		txtFristName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFristName.setText("Frist Name");
		txtFristName.setBounds(608, 250, 158, 26);
		frame.getContentPane().add(txtFristName);
		txtFristName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLastName.setText("Last name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(789, 250, 158, 26);
		frame.getContentPane().add(txtLastName);
		
		txtEmailId = new JTextField();
		txtEmailId.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailId.setText("Email id /  Mobile no");
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(608, 287, 339, 35);
		frame.getContentPane().add(txtEmailId);
		
		txtNewPassord = new JTextField();
		txtNewPassord.setText("Set your New Passord");
		txtNewPassord.setHorizontalAlignment(SwingConstants.CENTER);
		txtNewPassord.setColumns(10);
		txtNewPassord.setBounds(608, 333, 339, 35);
		frame.getContentPane().add(txtNewPassord);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(618, 406, 55, 26);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(683, 406, 55, 26);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(748, 406, 92, 26);
		frame.getContentPane().add(spinner_2);
		
		JLabel lblNewLabel_3 = new JLabel("Birthday date");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(618, 379, 141, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(592, 449, 104, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(695, 452, 55, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(756, 452, 69, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("other");
		rdbtnOther.setBounds(846, 452, 55, 23);
		frame.getContentPane().add(rdbtnOther);
		
		JLabel lblNewLabel_5 = new JLabel("By clicking Sign Up, you agree to our Terms , Data policy and ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(588, 477, 356, 26);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Cookie Police you many recieve SMS notification from us and ");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(588, 502, 356, 26);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Cookie Police you many recieve SMS notification from us and ");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5_1_1.setBounds(588, 524, 356, 26);
		frame.getContentPane().add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("can opt out at any time");
		lblNewLabel_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5_1_1_1.setBounds(672, 548, 141, 26);
		frame.getContentPane().add(lblNewLabel_5_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(663, 156, 150, 35);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setBounds(559, 157, 92, 35);
		frame.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Sitka Text", Font.BOLD, 18));
		
		JLabel lblNewLabel_2 = new JLabel("user name/id");
		lblNewLabel_2.setBounds(292, 159, 129, 35);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setBounds(418, 158, 131, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			//@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				String password=passwordField.getText();
				
				if(password.contains("Abhi@1234")&& username.contains("Abhi_0723"))
				{
					textField.setText(null);
					passwordField.setText(null);
					p12.main(null);
				}else {
					JOptionPane.showMessageDialog(null,"Invalid password","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
					
				}
				
					
			}
			
		});
		btnNewButton.setBounds(830, 162, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBounds(271, 148, 688, 53);
		frame.getContentPane().add(panel_1);
		
		JButton Button_1 = new JButton("Sign up");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==Button_1)
				{
					 p12.main(null);
				}
					
				}
			
		});
		Button_1.setBounds(819, 591, 119, 38);
		frame.getContentPane().add(Button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(271, 148, 688, 490);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\ouytrew.jpg"));
		lblNewLabel_6.setBounds(0, 0, 1184, 749);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		
		
	}
	}

