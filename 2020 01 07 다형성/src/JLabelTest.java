import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class JLabelTest extends JFrame{

	private JLabel jl1, jl2;
	private int count;
	
	public JLabelTest() {
		count = 1;
		ImageIcon a = new ImageIcon("c:\\Users\\sist\\Pictures\\project\\bar1.png");
		ImageIcon b = new ImageIcon("c:\\Users\\sist\\Pictures\\project\\bar2_1.png");
		jl1 = new JLabel(a);
		jl2 = new JLabel(b);
		JPanel p = new JPanel();
		add(p);
		p.setLayout(null);
		//setLayout(null);
		p.add(jl1); p.add(jl2);
		p.setBackground(Color.GREEN);
		jl1.setBounds(200,10,500,100);
		jl2.setBounds(200, 110, 500, 100);
		
		setTitle("hello");
		setSize(1000,500);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Scanner scn = new Scanner(System.in);
		
		jl2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				jl2.setBounds(200, 110, (int)(500 - 500 * (count / 100.0)), 50);
				count++;
				System.out.println("clicked");
			}
		});
		//int x = jl2.getSize().width;
		/*
		for(int i = 0; i < 100; i++) {
			
			jl2.setBounds(0, 0, (int)(x -  x * (i/100.0)), jl2.getSize().height);
			String s = scn.next();
			System.out.println(x - x * (i/100.0));
		}
		*/
	}
	public static void main(String[] args) {
		new JLabelTest();
		
	}

}
