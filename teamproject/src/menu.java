import java.awt.*;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JPanel;


public class menu {
		
			public static JFrame frame;
			
			//checkbox 생성(메뉴에서 선택하고 game start가 됨)
			Checkbox man,girl,update;
			CheckboxGroup group;
			
			//뒤로가기 버튼
			private JButton back_btn;
			
			//man,girl,work image
			ImageIcon man_icon,girl_icon,working_icon;
			//man label
			JLabel man_image_label;
			//girl label
			JLabel girl_image_label;
	/**
	 * Launch the application.
	 */
	public static void show() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void hidden(){
		frame.dispose();
	}
	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("♥");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		group=new CheckboxGroup();
		
		//man checkbox
		man = new Checkbox("ManS",group,false);
		man.setForeground(Color.BLACK);
		man.setBounds(174, 357, 50, 23);
		
		//girl checkbox
		girl = new Checkbox("GirlS",group,false);
		girl.setForeground(Color.BLACK);
		girl.setBounds(360, 357, 50, 23);
		
		//update checkbox
		update= new Checkbox("Update",group,false);
		update.setForeground(Color.BLACK);
		update.setBounds(521, 357, 59, 23);
		
		//frame checkbox 추가
		frame.getContentPane().add(man);
		frame.getContentPane().add(girl);
		frame.getContentPane().add(update);
		
		//menu_label
		JLabel menu_label = new JLabel("menu");
		menu_label.setFont(new Font("굴림", Font.PLAIN, 55));
		menu_label.setBounds(312, 59, 153, 58);
		frame.getContentPane().add(menu_label);
		
		//coupright_label
		JLabel copyright_label = new JLabel("\u24D2copyright 2014 good jobE ver1.0");
		copyright_label.setBounds(532, 487, 190, 15);
		frame.getContentPane().add(copyright_label);
		

		JButton game_startbtn = new JButton("game start");
		game_startbtn.setBackground(Color.WHITE);
		game_startbtn.setBounds(174, 438, 112, 31);
		game_startbtn.addActionListener(new ActionListener() {
			//start btn 눌렀을때 발생하는 이벤트 설정
			public void actionPerformed(ActionEvent e) {
				if(man.getState()){ 
					//game이 실행 되어야 할 부분
					menu.hidden(); man_gameplay16.show();System.out.println("남자선택되었음");}
				else if(girl.getState()){ 
					//game이 실행 되어야 할 부분
					//
					menu.hidden(); girl_gameplay16.show();System.out.println("여자선택되었음");}
				else if(update.getState()){
					
					//menu.hidden(); gameplay.show();
					System.out.println("update선택되었음"); 
					JOptionPane.showMessageDialog(frame, "while working...");
					
				}else {
					JOptionPane.showMessageDialog(frame, "한가지 메뉴를 선택해주세요.");
				}
			}
		});
		
		frame.getContentPane().add(game_startbtn);
		
		back_btn = new JButton("Back");
		back_btn.setBackground(Color.WHITE);
		back_btn.addActionListener(new ActionHandler());
		back_btn.setBounds(468, 438, 112, 31);
		frame.getContentPane().add(back_btn);
		
		JPanel panel = new JPanel();
		panel.setBounds(92, 138, 550, 213);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//man_label 생성
		man_icon=new ImageIcon(getClass().getResource("/image/manA.jpg"));
		man_image_label = new JLabel(man_icon);
		man_image_label.addMouseListener(new MouseAdapter (){
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						man_icon=new ImageIcon(getClass().getResource("/image/manB.jpg"));
						man_image_label.setIcon(man_icon);
					}
					@Override
					public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
						man_icon=new ImageIcon(getClass().getResource("/image/manA.jpg"));
						man_image_label.setIcon(man_icon);
					} 
					
		});
		man_image_label.setLocation(0, 0);
		man_image_label.setSize(199, 213);
		panel.add(man_image_label);
		
		//girl_label 생성
		girl_icon=new ImageIcon(getClass().getResource("/image/girlA.jpg"));
		girl_image_label = new JLabel(girl_icon);
		girl_image_label.addMouseListener(new MouseAdapter (){
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				girl_icon=new ImageIcon(getClass().getResource("/image/girlB.jpg"));
				girl_image_label.setIcon(girl_icon);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
				girl_icon=new ImageIcon(getClass().getResource("/image/girlA.jpg"));
				girl_image_label.setIcon(girl_icon);
			} 
			
		});
		girl_image_label.setLocation(199, 0);
		girl_image_label.setSize(199, 213);
		panel.add(girl_image_label);
		
		//work_label 생성
		working_icon=new ImageIcon(getClass().getResource("/image/workA.jpg"));
		JLabel work_image_label = new JLabel(working_icon);
		work_image_label.addMouseListener(new MouseAdapter (){
			
		});
		work_image_label.setLocation(391, 0);
		work_image_label.setSize(159, 213);
		panel.add(work_image_label);
		
	}
}
