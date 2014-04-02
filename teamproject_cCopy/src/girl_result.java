import java.awt.*;

import javax.swing.*;


public class girl_result {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					girl_result window = new girl_result();
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
	public girl_result() {
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
		
		JLabel copyright_label = new JLabel("\u24D2copyright 2014 good jobE ver1.0");
		copyright_label.setBounds(532, 487, 190, 15);
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
		
		JLabel label = new JLabel("<woman>");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		label.setBounds(12, 10, 139, 35);
		frame.getContentPane().add(label);
	}
		
}

