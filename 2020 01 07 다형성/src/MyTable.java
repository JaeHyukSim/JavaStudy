import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class MyTable extends JFrame implements ActionListener, MouseListener{

	JTable table;
	DefaultTableModel model;
	JLabel l1, l2, l3;
	JTextField tf1, tf2, tf3;
	JButton b;
	JPanel p;
	
	public MyTable() {
		l1 = new JLabel("이름");
		l2 = new JLabel("주소");
		l3 = new JLabel("전화");
		
		tf1 = new JTextField(7);
		tf2 = new JTextField(7);
		tf3 = new JTextField(7);

		b = new JButton("등록");
		
		p = new JPanel();
		p.add(l1);	p.add(tf1);
		p.add(l2);	p.add(tf2);
		p.add(l3);	p.add(tf3);
		p.add(b);
		
		String[] col = {"이름", "주소", "전화"};
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row,col);
		table = new JTable(model);
		
		JScrollPane js = new JScrollPane(table);
		
		add("Center", js);
		
		b.addActionListener(this);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(38);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		js.getViewport().setBackground(Color.white);
		add("Center",js);
		add("North", p);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		table.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTable();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			String name = tf1.getText();
			if(name.length() < 1) {
				JOptionPane.showMessageDialog(this,	 "이름을 입력하세요");
				return;
			}
			String addr = tf2.getText();
			String tel = tf3.getText();
			
			String[] data = {name, addr, tel};
			model.addRow(data);
			//tf1.setText(""); 
			tf2.setText(""); tf3.setText("");
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == table) {
			if(e.getClickCount() == 2) {
				int row = table.getSelectedRow();
				String name = (String)model.getValueAt(row, 0);
				String addr = (String)model.getValueAt(row, 1);
				String tel = (String)model.getValueAt(row, 2);
				
				String data = "이름 : " + name + "\n"
						+ "주소: " + addr + "\n"
						+ "전화: " + tel;
				JOptionPane.showMessageDialog(this, data);
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
