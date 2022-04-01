package advjavap;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class p17 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p17 window = new p17();
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
	public p17() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1432, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 1370, 54);
		frame.getContentPane().add(panel);
		
		JLabel l1 = new JLabel("Cars World Courier Policy");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 38));
		panel.add(l1);
		
		JLabel lblNewLabel_1 = new JLabel("Address ");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_1.setBounds(1136, 59, 190, 69);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(1006, 187, 364, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Area   =");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(1114, 129, 133, 54);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("City   =");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1_1.setBounds(1136, 220, 94, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1006, 275, 364, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(1180, 334, 190, 35);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Pin Code  =");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1_1_1.setBounds(1049, 321, 145, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("House No");
		lblNewLabel_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1_1_2.setBounds(1051, 393, 114, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(1162, 398, 190, 44);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnNewButton) {
					
					System.exit(0);
			
				
		}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(1206, 477, 133, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\All Java p\\home.jpg"));
		lblNewLabel.setBounds(0, 55, 1370, 694);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Change Addres");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p17.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(1180, 523, 172, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame2.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(1206, 569, 133, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
		

		
	}
}
