package woman;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Woman extends JFrame{
	ImageIcon[] woman = new ImageIcon[3];
	ImageIcon yj, gi, ar, mj, hj, hs;
	JLabel label;
	int []arr;
	Woman(){
		woman[0] = new ImageIcon(getClass().getResource("/image/NS윤지.jpg"));
		woman[1] = new ImageIcon(getClass().getResource("/image/가인.jpg"));
		woman[2] = new ImageIcon(getClass().getResource("/image/고아라.jpg"));
		//woman[3] = new ImageIcon(getClass().getResource(""));
		//woman[4] = new ImageIcon(getClass().getResource(""));
		//woman[5] = new ImageIcon(getClass().getResource(""));
		arr=new int[woman.length];			//3
		Random random = new Random();
		for(int i=0;i<woman.length;i++){	//i
			arr[i] = (int)(Math.random()*i);//
			if(arr[i]==i){
				i--;
			}
			//label=new JLabel(woman[arr[i]]);
			//System.out.println("i값:"+i);
		}
		add(label);	
	 	label.setSize(100,200);
	setLayout(new GridLayout());
	setVisible(true);
	setSize(300,500);
	}	
	public static void main(String[] args) {
		Woman w=new Woman();
		
	}

}
