package com.sist.board;

public class Board {
	int no;
	String name;
	String regdate;
	
	public Board(int no, String name, String regdate){
		this.no = no;	this.name = name;	this.regdate = regdate;
	}
	void boardList() {
		System.out.println("��ȣ : " + no);
		System.out.println("�̸� : " + name);
		System.out.println("����� : " + regdate);
	}
}
