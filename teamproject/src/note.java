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
 *   2. �����͸� �Է��� �޽��ϴ�.
 *     
 *     ����)
 *     �Է�: 1 2 3 4 5
 *     ��� ��ٷ��ּ��� ********** (���� 0.5�ʰ� 10�������� �Ͻÿ�)
 *     ���: 15 
 *
 * 

 public class ThreadTest4 extends Thread{
 String name;
 ThreadTest4(String n) {
  name=n;
 } 
 
 public void run() {
  int cnt=0;
  System.out.print("��ø� ��ٷ��ּ���[");
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
  System.out.print("�ټ����� ���ڸ� �Է����ּ���:");
  for(int i=0;i<arr.length;i++){
   arr[i]=scan.nextInt();
  }
  t1.start();
  int sum=0;
  for(int i=0;i<arr.length;i++){
   sum+=arr[i];
  }
  t1.join();
  System.out.println("\n���:"+sum);
 }
}
 */
