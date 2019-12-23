package hello;

import java.awt.FlowLayout;

import javax.swing.*;
//JFrame : window   ------> 전부 String으로 데이터를 교환한다
// web and window ----->>> string
public class 메소드활용 extends JFrame{

	JLabel la = new JLabel("나이");
	JTextField tf = new JTextField(10);
	메소드활용(){
		setLayout(new FlowLayout());
		add(la);
		add(tf);
		tf.setText((String.valueOf(100)));
		setSize(350,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 메소드활용();
	}

}
