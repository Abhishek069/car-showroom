package advjavap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class Frame2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Congrts It's Done");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 37));
		lblNewLabel.setBounds(84, 152, 379, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setStringPainted(true);
		progressBar.setValue(100);
		progressBar.setBounds(77, 226, 386, 25);
		frame.getContentPane().add(progressBar);
	}
}
