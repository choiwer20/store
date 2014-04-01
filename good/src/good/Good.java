package good;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Good {

	private JFrame frame;
	public static JLabel ELabel;
	public JButton btn1;
	public JButton btn;
	public E e1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Good window = new Good();
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
	public Good() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		e1=new E();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ELabel = new JLabel(" ");
		frame.getContentPane().add(ELabel, BorderLayout.CENTER);
		
		e1.start();
		JButton btn = new JButton();
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("1");
				e1.Threadstop();
				e1.Threadstart();
			}
		});
		frame.getContentPane().add(btn, BorderLayout.EAST);
		
		btn1 = new JButton();
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("2");
				e1.Threadstop();
				e1.Threadstart();
			}
		});
		frame.getContentPane().add(btn1, BorderLayout.NORTH);
	
		
	}
}
class E extends Thread{
	boolean flag=false;
	int count=0;
		public void Threadstop(){
			flag=true;
		}
	
		public void Threadstart(){
			flag=false;
			count=0;
		}
		
	public void run() {
		
		for(int j=0;j<16;j++) {
					while(!flag) {
						for(int i=1;i<=5;i++,++count) {
						Good.ELabel.setText("번호는"+count);
						if(count==5)
						{count=0;}
						try {
						//System.out.println("Thread is alive...");
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}	
}
}


/*

import java.util.Scanner;

//[homework]
 *   2. 데이터를 입력을 받습니다.
 *     
 *     예시)
 *     입력: 1 2 3 4 5
 *     잠시 기다려주세요 ********** (별이 0.5초간 10개찍히게 하시요)
 *     결과: 15 
 *
 * 

 public class ThreadTest4 extends Thread{
 String name;
 ThreadTest4(String n) {
  name=n;
 } 
 
 public void run() {
  int cnt=0;
  System.out.print("잠시만 기다려주세요[");
  do{
   try {
   Thread.sleep(500);
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
   System.out.print("*");
   cnt++;

 }while(cnt<10);
  System.out.println("]");
}
 
 public static void main(String[] args) throws InterruptedException {
  ThreadTest4 t1=new ThreadTest4("first");
  //int [] arr= new int[5];
  //Scanner scan=new Scanner(System.in);
  System.out.print("다섯개의 숫자를 입력해주세요:");
  for(int i=0;i<arr.length;i++){
   arr[i]=scan.nextInt();
  }
  t1.start();
  int sum=0;
  for(int i=0;i<arr.length;i++){
   sum+=arr[i];
  }
  t1.join();
  System.out.println("\n결과:"+sum);
 }
}
*/