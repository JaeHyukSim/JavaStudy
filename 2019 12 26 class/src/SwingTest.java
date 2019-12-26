import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingTest extends JFrame {
	Container contentPane;
	SwingTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("첫번째 프레임");
		
		contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setBounds(300, 300, 900, 900);
		//setSize(300,300);
		setVisible(true);
		
		
	}
	void swingDisable(){
		setSize(600,300);
		setTitle("두번째 프레임");
		contentPane.setVisible(false);
	}
	public static void main(String [] args) {
		SwingTest mf=new SwingTest();
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		mf.swingDisable();
	}
}