
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * interface ==> implements 인터페이스명
 */
public class MyTextField extends JFrame implements ActionListener{

	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	String data;
	
	public MyTextField() {
		
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		add("Center",js);
		add("South", tf);
		setSize(350,450);
		setVisible(true);
		
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				data = "";
				while(true) {
					if(tf.getText().length() - i >= 20) {
						data += tf.getText().substring(i,i+20) + "\n";
						i += 20;
					}else {
						data += tf.getText().substring(i);
						break;
					}
				}
				ta.setText(ta.getText() + data + "\n");
				tf.setText("");
			}
		});
	}
	
	public static void main(String[] args) {
		new MyTextField();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
