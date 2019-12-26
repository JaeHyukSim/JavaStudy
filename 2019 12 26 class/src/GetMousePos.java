import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GetMousePos extends JFrame{
	//private Container contentPane;
	public JLabel label;
	
	public GetMousePos() {
		setTitle("get mouse position");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//contentPane = getContentPane();
		
		JPanel contentPane = new JPanel();
		label = new JLabel("æ»≥Á«œººø‰");
		
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MouseImplements(this));
		
		contentPane.setBackground(Color.YELLOW);
		
		label.setBounds(5,30,100,30);
		contentPane.add(label);
		setBounds(0,0,1080,1080);
		setVisible(true);
	}
	public static void main(String[] args) {
		GetMousePos gp = new GetMousePos();
	}

}
