package advjavap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.DropMode;
import javax.swing.DefaultComboBoxModel;

public class p13 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p13 window = new p13();
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
	public p13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 951, 611);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\All Java p\\car insurans.jpg"));
		lblNewLabel.setBounds(0, 0, 935, 572);
		frame.getContentPane().add(lblNewLabel);*/
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.PINK);
		panel.setBounds(10, 0, 915, 53);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("Cars World Insurance  policy");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 38));
		l1.setBounds(254, 5, 504, 42);
		panel.add(l1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(486, 57, 3, 515);
		frame.getContentPane().add(panel_1);
		
		JLabel l2 = new JLabel("prposed insurnce name");
		l2.setFont(new Font("Sitka Text", Font.BOLD, 18));
		l2.setBounds(112, 136, 217, 33);
		frame.getContentPane().add(l2);
		
		JTextPane t = new JTextPane();
		t.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t.setText("frist name");
		t.setBackground(Color.WHITE);
		t.setToolTipText("Frist name");
		t.setBounds(10, 169, 143, 25);
		frame.getContentPane().add(t);
		
		JLabel l3 = new JLabel("Address proposel");
		l3.setFont(new Font("Sitka Small", Font.BOLD, 18));
		l3.setBounds(10, 231, 178, 33);
		frame.getContentPane().add(l3);
		
		JTextPane t_1 = new JTextPane();
		t_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_1.setToolTipText("Frist name");
		t_1.setText("frist name");
		t_1.setBackground(Color.WHITE);
		t_1.setBounds(163, 169, 157, 25);
		frame.getContentPane().add(t_1);
		
		JTextPane t_2 = new JTextPane();
		t_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_2.setToolTipText("Frist name");
		t_2.setText("frist name");
		t_2.setBackground(Color.WHITE);
		t_2.setBounds(330, 169, 146, 25);
		frame.getContentPane().add(t_2);
		
		JTextPane t_2_1 = new JTextPane();
		t_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_2_1.setToolTipText("Frist name");
		t_2_1.setText("Type here your adress");
		t_2_1.setBackground(Color.WHITE);
		t_2_1.setBounds(185, 205, 291, 75);
		frame.getContentPane().add(t_2_1);
		
		JLabel lblMobileNo = new JLabel("Mobile no ");
		lblMobileNo.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblMobileNo.setBounds(13, 302, 94, 33);
		frame.getContentPane().add(lblMobileNo);
		
		JTextPane t6 = new JTextPane();
		t6.setToolTipText("Frist name");
		t6.setText("Frist no ");
		t6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6.setBackground(Color.WHITE);
		t6.setBounds(110, 302, 178, 25);
		frame.getContentPane().add(t6);
		
		JTextPane t_3_1 = new JTextPane();
		t_3_1.setToolTipText("Frist name");
		t_3_1.setText("Alternative");
		t_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t_3_1.setBackground(Color.WHITE);
		t_3_1.setBounds(298, 302, 178, 25);
		frame.getContentPane().add(t_3_1);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblDate.setBounds(10, 332, 52, 33);
		frame.getContentPane().add(lblDate);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(15, 1, 31, 1));
		spinner.setFont(new Font("Tahoma", Font.BOLD, 14));
		spinner.setBounds(52, 337, 52, 20);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(4, 1, 12, 1));
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		spinner_1.setBounds(114, 337, 52, 20);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(2022, 1990, 2100, 1));
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		spinner_2.setBounds(180, 337, 83, 20);
		frame.getContentPane().add(spinner_2);
		
		JLabel l6 = new JLabel("Adhar no");
		l6.setFont(new Font("Times New Roman", Font.BOLD, 24));
		l6.setBounds(10, 376, 115, 25);
		frame.getContentPane().add(l6);
		
		JTextPane t6_1 = new JTextPane();
		t6_1.setToolTipText("Frist name");
		t6_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6_1.setBackground(Color.WHITE);
		t6_1.setBounds(138, 376, 94, 25);
		frame.getContentPane().add(t6_1);
		
		JTextPane t6_1_1 = new JTextPane();
		t6_1_1.setToolTipText("Frist name");
		t6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6_1_1.setBackground(Color.WHITE);
		t6_1_1.setBounds(245, 376, 94, 25);
		frame.getContentPane().add(t6_1_1);
		
		JTextPane t6_1_2 = new JTextPane();
		t6_1_2.setToolTipText("Frist name");
		t6_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6_1_2.setBackground(Color.WHITE);
		t6_1_2.setBounds(353, 376, 94, 25);
		frame.getContentPane().add(t6_1_2);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblEmailId.setBounds(10, 420, 115, 25);
		frame.getContentPane().add(lblEmailId);
		
		JTextPane t6_1_3 = new JTextPane();
		t6_1_3.setDropMode(DropMode.ON);
		t6_1_3.setText("Ex TomarYodve@gmail.com");
		t6_1_3.setToolTipText("Frist name");
		t6_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		t6_1_3.setBackground(Color.WHITE);
		t6_1_3.setBounds(112, 412, 359, 33);
		frame.getContentPane().add(t6_1_3);
		
		JLabel lblCarModel = new JLabel("Car Model");
		lblCarModel.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblCarModel.setBounds(521, 136, 94, 25);
		frame.getContentPane().add(lblCarModel);
		
		/*JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Audi cars Model", "Audi Q2", "Audi e-tron\t", "Audi Q8", "Audi e-tron GT"}));
		c1.setSelectedIndex(1);
		c1.setBounds(623, 136, 120, 22);
		frame.getContentPane().add(c1);*/
		
		JLabel lblPersonalInformastion = new JLabel("Personal Informastion");
		lblPersonalInformastion.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblPersonalInformastion.setBounds(62, 65, 385, 42);
		frame.getContentPane().add(lblPersonalInformastion);
		
		JLabel lblOcupation = new JLabel("ocupation");
		lblOcupation.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblOcupation.setBounds(10, 460, 106, 42);
		frame.getContentPane().add(lblOcupation);
		
		/*JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Business ", "Farmar", "Employee", "Gov Employee", "other"}));
		c2.setSelectedIndex(1);
		c2.setBounds(124, 470, 139, 22);
		frame.getContentPane().add(c2);*/
	}
}
