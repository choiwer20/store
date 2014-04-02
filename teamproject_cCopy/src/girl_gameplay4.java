//Thread로  시간 5초 설정해주고 16강 8강 4강 2강 결승 (총 5개)
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.*;


public class girl_gameplay4 {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					girl_gameplay4 window = new girl_gameplay4();
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
	public girl_gameplay4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =new JFrame("♥");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logo_label = new JLabel("\uC774\uC0C1\uD615\uC6D4\uB4DC\uCEF5");
		logo_label.setFont(new Font("휴먼편지체", Font.PLAIN, 50));
		logo_label.setBounds(252, 57, 254, 59);
		frame.getContentPane().add(logo_label);
		
		JLabel Vs_label = new JLabel("VS");
		Vs_label.setFont(new Font("굴림", Font.PLAIN, 50));
		Vs_label.setBounds(339, 218, 62, 58);
		frame.getContentPane().add(Vs_label);
		
		JLabel copyright_label = new JLabel("\u24D2copyright 2014 good jobE ver1.0");
		copyright_label.setBounds(532, 487, 190, 15);
		frame.getContentPane().add(copyright_label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 479, 97, 23);
		btnNewButton.addActionListener(new ActionHandler());
		frame.getContentPane().add(btnNewButton);
		
		JPanel left_panel = new JPanel();
		left_panel.setBounds(30, 126, 253, 268);
		frame.getContentPane().add(left_panel);
		
		JPanel right_panel = new JPanel();
		right_panel.setBounds(456, 126, 253, 268);
		frame.getContentPane().add(right_panel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(295, 315, 149, 14);
		progressBar.setMinimum(0);
		progressBar.setIndeterminate(true);
		progressBar.setMaximum(5);
		frame.getContentPane().add(progressBar);
		
		//선택할 버튼 생성
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(30, 126, 253, 268);
		frame.getContentPane().add(btnNewButton_1);
		
		//선택할 버튼 생성
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(456, 131, 253, 263);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel four_label = new JLabel("[4\uAC15]");
		four_label.setFont(new Font("굴림", Font.PLAIN, 25));
		four_label.setBounds(647, 12, 62, 35);
		frame.getContentPane().add(four_label);
		
		JLabel girl_division_Label = new JLabel("<woman>");
		girl_division_Label.setFont(new Font("굴림", Font.PLAIN, 30));
		girl_division_Label.setBounds(12, 12, 139, 35);
		frame.getContentPane().add(girl_division_Label);
	}
}
