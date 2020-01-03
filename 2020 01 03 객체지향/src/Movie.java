
import java.awt.*;
import javax.swing.*;

public class Movie {
	JPanel p;	JLabel la;
	JTextField f;
	private String poster;
	private String name;
	public Movie() {
		poster = "c:\\image\\poster.jpg";
		name = "Ãµ¹®: ÇÏ´Ã¿¡ ¹¯´Â´Ù(2018)";
		
		p = new JPanel();
		f = new JTextField();
		la = new JLabel(new ImageIcon(poster));
		f.setText(name);
		p.setLayout(new BorderLayout());
		p.add("Center", la);
		p.add("South",f);
	}
}
