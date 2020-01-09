package com.sist.exception1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClass2 extends JFrame{

	JTextArea ta;
	JTextField tf;
	JButton b1, b2;
	int[] com = new int[3];
	int[] user = new int[3];
	
	int s, b;
	
	public MainClass2() {
		ta = new JTextArea();
		ta.setEditable(false);
		//ta.setEnabled(false);
		ta.setText("asdaeohfgoidhohsdgosd goihd goishdogi hsdoighs");
		JScrollPane js = new JScrollPane(ta);
		tf = new JTextField(13);
		tf.setEnabled(false);
		
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getRand();
				JOptionPane.showMessageDialog(MainClass2.this, "게임을 시작합니다");
				tf.setEnabled(true);
				b1.setEnabled(false);
				tf.requestFocus();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length() < 1) {
					JOptionPane.showMessageDialog(MainClass2.this, "세자리 정수를 입력하세요");
					tf.requestFocus();
					return;
				}
				
				int no = 0;
				try {
					no = Integer.parseInt(tf.getText());
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(MainClass2.this, "정수만 입력이 가능하다");
					tf.setText("");
					tf.requestFocus();
					return;
				}
				
				//잘못된 입력
				if(no < 100 || no > 999) {
					JOptionPane.showMessageDialog(MainClass2.this, "세자리 정수만 입력해라 쫌!");
					tf.setText("");
					tf.requestFocus();
					return;
				}
				//user[]에 저장
				user[0] = no / 100;
				user[1] = (no / 10)% 10;
				user[2] = no % 10;
				if(user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
					JOptionPane.showMessageDialog(MainClass2.this, "중복된 숫자는 사용 불가다 이 쉐키야");
					tf.setText("");
					tf.requestFocus();
					return;
				}
				
				s = 0;
				b = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(com[i] == user[j]) {
							if(i == j) {
								s++;
							}else {
								b++;
							}
						}
					}
				}
				
				
				ta.setText(ta.getText() + "\n" + tf.getText());
				tf.setText("");
				
				ta.setText(ta.getText() + "\n" + "ball : " + b + ", strike : " + s);
				if(s == 3) {
					ta.setText(ta.getText() + "\n" + "정답을 맞췄다. 더할끄냐?(yes/no)");
					int res = JOptionPane.showConfirmDialog(MainClass2.this, "종료", "종료할까요?",
							JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(res == JOptionPane.YES_OPTION) {
					dispose();
					System.exit(0);
				}else {
					ta.setText("");
					tf.setText("");
					tf.setEnabled(false);
					b1.setEnabled(true);
				}
				}
			}
		});
		JPanel p = new JPanel();
		p.add(tf); p.add(b1); p.add(b2);
		
		//배치
		add("Center",js);
		add("South",p);
		
		setSize(450, 500);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}
	
	//난수 발생하는 메소드
	public void getRand() {
		int su = 0; // 난수
		boolean bCheck = false; // 중복 체크
		
		for(int i = 0; i < 3; i++) {
			bCheck = true;
			while(bCheck) {
				bCheck = false;
				//난수 발생
				su = (int)(Math.random()*9)+1;
				for(int j = 0; j < i; j++) {
					if(com[j] == su) {
						bCheck = true; break;
					}
				}
				
			}
			com[i] = su;
		}
	}
}
