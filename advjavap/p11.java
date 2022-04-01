package advjavap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JEditorPane;

public class p11 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_13;
	private JButton btnConfrom;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p11 window = new p11();
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
	public p11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 839, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(1, 7, 114, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(107, 83, 224, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Adhar NO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(15, 83, 92, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(15, 1, 31, 1));
		spinner.setBounds(465, 84, 45, 33);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(6, 1, 12, 1));
		spinner_1.setBounds(512, 83, 46, 34);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(2022, 1900, 2225, 1));
		spinner_2.setBounds(559, 83, 93, 30);
		frame.getContentPane().add(spinner_2);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_2.setBounds(407, 89, 55, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Loan Amount");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 137, 149, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setBounds(169, 133, 154, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("pay per Month");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(333, 137, 149, 27);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setBounds(495, 137, 157, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_2 = new JLabel("A/C No");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(15, 183, 100, 27);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 187, 25, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(134, 187, 25, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(185, 187, 25, 26);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(160, 187, 25, 26);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(236, 187, 25, 26);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(210, 187, 25, 26);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(285, 187, 25, 26);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(261, 187, 25, 26);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(337, 187, 25, 26);
		frame.getContentPane().add(textField_11);
		
		
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(311, 187, 25, 26);
		frame.getContentPane().add(textField_12);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(661, 132, 157, 232);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Photo B.");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(711, 5, 99, 111);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_13 = new JTextField();
		textField_13.setBounds(711, 8, 107, 109);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton)
				{
					 p12.main(null);
				}
				
			
			}
		});
		btnNewButton.setBounds(26, 367, 108, 34);
		frame.getContentPane().add(btnNewButton);
		
		btnConfrom = new JButton("confrom");
		btnConfrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource()==btnConfrom)
				{
					 p16.main(null);
				}
				
			}
		});
		btnConfrom.setBounds(702, 367, 108, 34);
		frame.getContentPane().add(btnConfrom);
		
		JLabel lblNewLabel_6 = new JLabel("Bank Name");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_6.setBounds(15, 228, 114, 34);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBounds(131, 234, 179, 31);
		frame.getContentPane().add(textField_14);
		
		JLabel lblNewLabel_7 = new JLabel("period of loan");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(389, 175, 149, 28);
		frame.getContentPane().add(lblNewLabel_7);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(678, 119, 140, 245);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\All Java p\\iuyt.png"));
		lblNewLabel_8.setBounds(0, 5, 140, 240);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Mo. No.");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(347, 224, 69, 34);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_15 = new JTextField();
		textField_15.setBounds(429, 228, 179, 25);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_9_1 = new JLabel("Pan No");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9_1.setBounds(15, 276, 69, 34);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		textField_16 = new JTextField();
		textField_16.setBounds(88, 276, 243, 30);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Addres ");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setBounds(15, 321, 170, 35);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("occupation");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(344, 276, 118, 27);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_17 = new JTextField();
		textField_17.setBounds(465, 269, 180, 32);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(97, 324, 533, 28);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(99, 13, 577, 32);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("D:\\por.jpg"));
		lblNewLabel_12.setBounds(1, 0, 822, 405);
		frame.getContentPane().add(lblNewLabel_12);
		
		
			
	}
}
