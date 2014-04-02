import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class main {

	private static JFrame frame;
	//panel에 이미지 넣기 시도..
	//ImageIcon main_icon;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				main window;
				try {
					window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//frame 보여주기 
	public static void show(){
			frame.setVisible(true);
	}
	//frame 숨기기
	public static void hidden(){
			frame.setVisible(false);
	}
	//프로그램 끝내기
	public static void exit(){
		System.exit(0);
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("♥");
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//logo label
		JLabel logolabel = new JLabel("\uC774\uC0C1\uD615\uC6D4\uB4DC\uCEF5");
		logolabel.setFont(new Font("휴먼편지체", Font.PLAIN, 50));
		logolabel.setBounds(239, 59, 254, 72);
		frame.getContentPane().add(logolabel);
		
		//start btn
		JButton start_btn = new JButton("start");
		start_btn.setBackground(Color.WHITE);
		start_btn.setBounds(138, 447, 97, 23);
		//이벤트 처리
		start_btn.addActionListener(new ActionHandler());
		frame.getContentPane().add(start_btn);
		
		
		//copyright label
		JLabel copyright_label = new JLabel("\u24D2copyright 2014 good jobE ver1.0");
		copyright_label.setBounds(532, 487, 190, 15);
		frame.getContentPane().add(copyright_label);
		
		//exit_btn
		JButton exit_btn = new JButton("exit");
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		exit_btn.setBackground(Color.WHITE);
		exit_btn.setBounds(504, 447, 97, 23);
		exit_btn.addActionListener(new ActionHandler());
		frame.getContentPane().add(exit_btn);
		
	}
}

class ActionHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			String event=e.getActionCommand();
		
		if(event.equals("start")){
			main.hidden(); menu.show();
		} else if(event.equals("exit")) {
			main.exit();
		} else if(event.equals("Back")){
			menu.hidden(); main.show();
		}
		   
	}
}


/*
 *	(일단 따로 빼둠)
 * 
 
else if(event.equals("restart")) {
	girl_result.hidden(); main.show();
	man_result.hidden();
} else if(event.equals("initial")) {
	girl_result.hidden(); menu.show();
	man_result.hidden();	
} 
*/