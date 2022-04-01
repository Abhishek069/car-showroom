package advjavap;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollBar;
//import javax.swing.JSlider;
import javax.swing.JTextField;
//import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
//import javax.swing.JCheckBox;
import java.awt.Font;
//import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;

import java.awt.*;
import java.awt.event.*;


public class p12 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
//	private final Action action = new SwingAction();
	//private final Action action_1 = new SwingAction_1();
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p12 window = new p12();
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
	public p12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, 10, 801,491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(262, 26, 364, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(textField);
		
		JLabel l1 = new JLabel("Customer Name ");
		l1.setBackground(Color.WHITE);
		l1.setForeground(Color.BLACK);
		l1.setBounds(97, 22, 159, 28);
		l1.setFont(new Font("Tahoma", Font.BOLD, 19));
		frame.getContentPane().add(l1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 72, 227, 34);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel l2 = new JLabel("Buyer City");
		l2.setForeground(Color.BLACK);
		l2.setBounds(10, 61, 145, 42);
		l2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Coteshan");
		l3.setBackground(Color.BLACK);
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("Tahoma", Font.BOLD, 22));
		l3.setBounds(411, 71, 116, 35);
		frame.getContentPane().add(l3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(117, 133, 176, 28);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel l4 = new JLabel("payment");
		l4.setForeground(Color.BLACK);
		l4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		l4.setBounds(10, 130, 99, 32);
		frame.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("Date");
		l5.setForeground(Color.BLACK);
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setFont(new Font("Tahoma", Font.BOLD, 21));
		l5.setBounds(292, 132, 63, 28);
		frame.getContentPane().add(l5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(10, 1, 31, 1));
		spinner.setBounds(367, 134, 50, 24);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1.setBounds(427, 134, 45, 24);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(2020, 1500, 2022, 1));
		spinner_2.setBounds(489, 134, 77, 24);
		frame.getContentPane().add(spinner_2);
		
		JLabel l6 = new JLabel("CC Engin");
		l6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l6.setForeground(Color.WHITE);
		l6.setBounds(595, 132, 92, 28);
		frame.getContentPane().add(l6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(689, 129, 86, 34);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnCancel)
				{
					 Frame2.main(null);
				}
			}
		});
		btnCancel.setBounds(479, 407, 118, 34);
		frame.getContentPane().add(btnCancel);
		
		JLabel l7 = new JLabel("Registration D.");
		l7.setForeground(Color.BLACK);
		l7.setFont(new Font("Tahoma", Font.BOLD, 22));
		l7.setBounds(10, 186, 168, 34);
		frame.getContentPane().add(l7);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(10, 1, 31, 1));
		spinner_3.setBounds(174, 190, 50, 24);
		frame.getContentPane().add(spinner_3);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1_1.setBounds(234, 190, 45, 24);
		frame.getContentPane().add(spinner_1_1);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setModel(new SpinnerNumberModel(2022, 2022, 2122, 1));
		spinner_2_1.setBounds(296, 190, 77, 24);
		frame.getContentPane().add(spinner_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setAlignmentX(Component.RIGHT_ALIGNMENT);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Audi cars Model", "Audi Q2", "Audi e-tron\t", "Audi Q8", "Audi e-tron GT"}));
		comboBox.setBounds(403, 194, 174, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\cong.jpg"));
		lblNewLabel_8.setBounds(607, 186, 168, 255);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel l11 = new JLabel("Aadhar No");
		l11.setForeground(Color.BLACK);
		l11.setFont(new Font("Tahoma", Font.BOLD, 20));
		l11.setBounds(8, 233, 108, 32);
		frame.getContentPane().add(l11);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(126, 231, 227, 34);
		frame.getContentPane().add(textField_4);
		
		JLabel lblMoNo = new JLabel("Mo No");
		lblMoNo.setForeground(Color.BLACK);
		lblMoNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMoNo.setBounds(364, 233, 63, 32);
		frame.getContentPane().add(lblMoNo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(429, 231, 176, 34);
		frame.getContentPane().add(textField_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2500000", "", "5000000", "", "100000000", "", "150000000", "", "200000000", ""}));
		comboBox_1.setBounds(531, 64, 183, 40);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					if(e.getSource()==btnNewButton) {
					
						
						p16.main(null);
					
						
					
			}
					
			}
		});
	
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 407, 128, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Address");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 295, 116, 28);
		frame.getContentPane().add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(108, 295, 489, 34);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Loan");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1) {
					
					 p11.main(null);
			}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(252, 408, 121, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		JLabel l10 = new JLabel("hihi");
		l10.setHorizontalAlignment(SwingConstants.CENTER);
		l10.setIcon(new ImageIcon("D:\\yrte.jpg"));
		l10.setBounds(0, 0, 799, 455);
		frame.getContentPane().add(l10);
		
		
		
		
	}
	}
/*	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}*/
	

