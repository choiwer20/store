import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gameresult {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gameresult window = new gameresult();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void hidden() {
		frame.dispose();
	}
	
	/**
	 * Create the application.
	 */
	public gameresult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("¢¾");;
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel result_label = new JLabel("result");
		result_label.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		result_label.setBounds(304, 44, 136, 73);
		frame.getContentPane().add(result_label);
		
		JLabel copyright_label = new JLabel("\u24D2copyright 2014 good job ver1.0");
		copyright_label.setBounds(536, 487, 186, 15);
		frame.getContentPane().add(copyright_label);
		
		JButton restart_btn = new JButton("restart");
		restart_btn.setForeground(Color.BLACK);
		restart_btn.setBackground(Color.WHITE);
		restart_btn.setBounds(184, 424, 97, 23);
		restart_btn.addActionListener(new ActionHandler());
		frame.getContentPane().add(restart_btn);
		
		JButton init_btn = new JButton("initial");
		init_btn.setForeground(Color.BLACK);
		init_btn.setBackground(Color.WHITE);
		init_btn.setBounds(474, 424, 97, 23);
		init_btn.addActionListener(new ActionHandler());
		frame.getContentPane().add(init_btn);
	}
		
}

