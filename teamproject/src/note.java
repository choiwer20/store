import java.awt.EventQueue;

import javax.swing.JFrame;


public class note {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for(int i=0;i<5;i++){
						System.out.println("dd");
					}
					note window = new note();
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
	public note() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
  int [] arr= new int[5];
  Scanner scan=new Scanner(System.in);
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
