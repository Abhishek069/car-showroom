package advjavap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.DropMode;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class p16 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtNp;
	private JTextField textField_2;
	private JTextField txtEngineNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p16 window = new p16();
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
	public p16() {
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
		
		JLabel l1 = new JLabel("Cars World Insurance  policy");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 38));
		panel.add(l1);
		
		JLabel lblPersonalInformastion = new JLabel("Personal Informastion");
		lblPersonalInformastion.setForeground(Color.RED);
		lblPersonalInformastion.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblPersonalInformastion.setBounds(77, 65, 385, 42);
		frame.getContentPane().add(lblPersonalInformastion);
		
		JLabel l2 = new JLabel("prposed insurnce name");
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Sitka Text", Font.BOLD, 18));
		l2.setBounds(137, 107, 217, 33);
		frame.getContentPane().add(l2);
		
		JTextPane t = new JTextPane();
		t.setToolTipText("Frist name");
		t.setText("frist name");
		t.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t.setBackground(Color.WHITE);
		t.setBounds(30, 141, 143, 25);
		frame.getContentPane().add(t);
		
		JTextPane t_1 = new JTextPane();
		t_1.setToolTipText("Frist name");
		t_1.setText("midle name");
		t_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_1.setBackground(Color.WHITE);
		t_1.setBounds(183, 141, 157, 25);
		frame.getContentPane().add(t_1);
		
		JTextPane t_2 = new JTextPane();
		t_2.setToolTipText("Frist name");
		t_2.setText("Last name");
		t_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_2.setBackground(Color.WHITE);
		t_2.setBounds(350, 141, 146, 25);
		frame.getContentPane().add(t_2);
		
		JTextPane t_2_1 = new JTextPane();
		t_2_1.setToolTipText("Frist name");
		t_2_1.setText("Type here your adress");
		t_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_2_1.setBackground(Color.WHITE);
		t_2_1.setBounds(205, 198, 291, 75);
		frame.getContentPane().add(t_2_1);
		
		JLabel l3 = new JLabel("Address proposel");
		l3.setForeground(Color.ORANGE);
		l3.setFont(new Font("Sitka Small", Font.BOLD, 18));
		l3.setBounds(30, 224, 178, 33);
		frame.getContentPane().add(l3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(506, 59, 10, 679);
		frame.getContentPane().add(panel_1);
		
		JLabel lblMobileNo = new JLabel("Mobile no ");
		lblMobileNo.setForeground(Color.ORANGE);
		lblMobileNo.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblMobileNo.setBounds(30, 284, 94, 33);
		frame.getContentPane().add(lblMobileNo);
		
		JTextPane t6 = new JTextPane();
		t6.setToolTipText("Frist name");
		t6.setText("Frist no ");
		t6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6.setBackground(Color.WHITE);
		t6.setBounds(130, 284, 178, 25);
		frame.getContentPane().add(t6);
		
		JTextPane t_3_1 = new JTextPane();
		t_3_1.setToolTipText("Frist name");
		t_3_1.setText("Alternative");
		t_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_3_1.setBackground(Color.WHITE);
		t_3_1.setBounds(318, 284, 178, 25);
		frame.getContentPane().add(t_3_1);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(Color.ORANGE);
		lblDate.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblDate.setBounds(121, 326, 52, 33);
		frame.getContentPane().add(lblDate);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 14));
		spinner.setBounds(159, 329, 52, 20);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		spinner_1.setBounds(221, 329, 52, 20);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		spinner_2.setBounds(287, 329, 83, 20);
		frame.getContentPane().add(spinner_2);
		
		JLabel l6 = new JLabel("Adhar no");
		l6.setForeground(Color.ORANGE);
		l6.setFont(new Font("Times New Roman", Font.BOLD, 24));
		l6.setBounds(35, 381, 115, 25);
		frame.getContentPane().add(l6);
		
		JTextPane t6_1 = new JTextPane();
		t6_1.setToolTipText("Frist name");
		t6_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6_1.setBackground(Color.WHITE);
		t6_1.setBounds(163, 381, 94, 25);
		frame.getContentPane().add(t6_1);
		
		JTextPane t6_1_1 = new JTextPane();
		t6_1_1.setToolTipText("Frist name");
		t6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6_1_1.setBackground(Color.WHITE);
		t6_1_1.setBounds(270, 381, 94, 25);
		frame.getContentPane().add(t6_1_1);
		
		JTextPane t6_1_2 = new JTextPane();
		t6_1_2.setToolTipText("Frist name");
		t6_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6_1_2.setBackground(Color.WHITE);
		t6_1_2.setBounds(378, 381, 94, 25);
		frame.getContentPane().add(t6_1_2);
		
		
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setForeground(Color.ORANGE);
		lblEmailId.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmailId.setBounds(30, 444, 115, 25);
		frame.getContentPane().add(lblEmailId);
		
		textField = new JTextField();
		textField.setBounds(136, 436, 329, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Business  ", "Farmar ", "Employee ", "Gov Employee ", "other"}));
		comboBox.setBounds(159, 481, 128, 35);
		frame.getContentPane().add(comboBox);
		
		JLabel lblOcupation_1 = new JLabel("Ocupation");
		lblOcupation_1.setForeground(Color.ORANGE);
		lblOcupation_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblOcupation_1.setBounds(30, 480, 120, 42);
		frame.getContentPane().add(lblOcupation_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\All Java p\\toto.png"));
		lblNewLabel.setBounds(10, 533, 491, 205);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCarDeatils = new JLabel("Car Deatils");
		lblCarDeatils.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblCarDeatils.setBounds(629, 65, 241, 42);
		frame.getContentPane().add(lblCarDeatils);
		
		JLabel lblNewLabel_1 = new JLabel("Moudle of car");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(534, 125, 146, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Audi cars Model", "Audi Q2 ", "Audi e-tron\\t", "Audi Q8 ", "Audi e-tron GT"}));
		comboBox_1.setBounds(705, 125, 229, 38);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Issue of date");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(534, 197, 120, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSpinner spinner_3_1_1 = new JSpinner();
		spinner_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		spinner_3_1_1.setModel(new SpinnerDateModel(new Date(1648319400000L), null, null, Calendar.DAY_OF_YEAR));
		spinner_3_1_1.setBounds(664, 198, 168, 32);
		frame.getContentPane().add(spinner_3_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("No Of Car");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(525, 251, 94, 33);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("=");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(629, 251, 15, 33);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"MH-01\tMumbai (Central Location)", "MH-02\tMumbai (West Location)", "MH-03\tMumbai (East Location)", "MH-04\tThane District", "MH-05\tKalyan", "MH-06\tPen Raigad District", "MH-07\tSindhudurg", "MH-08\tRatnagiri", "MH-09\tKolhapur", "MH-10\tSangli District", "MH-11\tSatara", "MH-12\tPune City", "MH-13\tSolapur", "MH-14\tPimpri Chinchwad", "MH-15\tNashik", "MH-16\tAhmednagar", "MH-17\tShrirampur", "MH-18\tDhule", "MH-19\tJalgaon", "MH-20\tAurangabad", "MH-21\tJalna", "MH-22\tParbhani", "MH-23\tBeed", "MH-24\tLatur", "MH-25\tOsmanabad", "MH-26\tNanded", "MH-27\tAmravati", "MH-28\tBuldhana", "MH-29\tYavatmal", "MH-30\tAkola", "MH-31\tNagpur", "MH-32\tWardha", "MH-33\tGadchiroli", "MH-34\tChandrapur", "MH-35\tGondia", "MH-36\tBhandara", "MH-37\tWashim", "MH-38\tHingoli", "MH-39\tNandurbar", "MH-40\tNagpur Gramin", "MH-41\tMalegaon", "MH-42\tBaramati", "MH-43\tVashi (Navi Mumbai)", "MH-44\tAmbajogai", "MH-45\tAkluj", "MH-46\tPanvel", "MH-47\tBorivali (Western Suburb of Mumbai)", "MH-48\tVirar (Extreme North End on Western Route of Mumbai, District Thane)", "MH-49\tNagpur", "MH-50\tKharad (Satara Rural)", "MH-51\tNashik Rural"}));
		comboBox_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		comboBox_1_1.setBounds(654, 244, 309, 38);
		frame.getContentPane().add(comboBox_1_1);
		
		txtNp = new JTextField();
		txtNp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtNp.setText("NP");
		txtNp.setBounds(664, 290, 54, 39);
		frame.getContentPane().add(txtNp);
		txtNp.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("2555");
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(789, 289, 78, 39);
		frame.getContentPane().add(textField_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(1001, 59, 10, 679);
		frame.getContentPane().add(panel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(526, 367, 465, -10);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Serial No");
		lblNewLabel_2_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1_2.setBounds(564, 290, 94, 33);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("No");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1_2_1.setBounds(749, 292, 33, 33);
		frame.getContentPane().add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Put your 17 Digit engine no");
		lblNewLabel_2_1_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1_2_2.setBounds(526, 333, 252, 33);
		frame.getContentPane().add(lblNewLabel_2_1_2_2);
		
		txtEngineNo = new JTextField();
		txtEngineNo.setText("Engine no ");
		txtEngineNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtEngineNo.setColumns(10);
		txtEngineNo.setBounds(789, 331, 210, 39);
		frame.getContentPane().add(txtEngineNo);
		
		JLabel lblNewLabel_3 = new JLabel("car detils plz");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setIcon(new ImageIcon("D:\\sales gril.png"));
		lblNewLabel_3.setBounds(516, 381, 487, 364);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblPoliesThaHave = new JLabel("Polies tha have to accepts");
		lblPoliesThaHave.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblPoliesThaHave.setBounds(1037, 65, 323, 42);
		frame.getContentPane().add(lblPoliesThaHave);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Comprehensive Policy:");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(1015, 121, 304, 46);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxCopassengerProtectionCoverage = new JCheckBox("Co-passenger Protection Coverage: ");
		chckbxCopassengerProtectionCoverage.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxCopassengerProtectionCoverage.setBounds(1015, 177, 340, 46);
		frame.getContentPane().add(chckbxCopassengerProtectionCoverage);
		
		JCheckBox chckbxThirdPartyLiability = new JCheckBox("Third Party Liability Insurance:");
		chckbxThirdPartyLiability.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxThirdPartyLiability.setBounds(1015, 234, 340, 46);
		frame.getContentPane().add(chckbxThirdPartyLiability);
		
		JCheckBox chckbxThirdPartyLiability_1 = new JCheckBox("Personal Risk Coverage:");
		chckbxThirdPartyLiability_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxThirdPartyLiability_1.setBounds(1015, 300, 340, 46);
		frame.getContentPane().add(chckbxThirdPartyLiability_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(1021, 334, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\car1.png"));
		lblNewLabel_4.setBounds(1021, 343, 349, 245);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			if(e.getSource()==btnNewButton) {
					
						//System.exit(0);
				p17.main(null);
						
					
			}
					
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(1021, 582, 339, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					
					if(e.getSource()==btnNewButton_1) {
					
						
						p16.main(null);
					
						
					
			}
					
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBounds(1021, 647, 339, 54);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setLabelFor(frame);
		lblNewLabel_5.setBackground(new Color(34, 139, 34));
		lblNewLabel_5.setIcon(new ImageIcon("D:\\All Java p\\car insurans.jpg"));
		lblNewLabel_5.setBounds(0, 59, 1370, 679);
		frame.getContentPane().add(lblNewLabel_5);
		
	
		

	}
}
