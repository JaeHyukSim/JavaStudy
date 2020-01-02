package com.sist.board;

public class Board {
	int no;
	String name;
	String regdate;
	
	public Board(int no, String name, String regdate){
		this.no = no;	this.name = name;	this.regdate = regdate;
	}
	void boardList() {
		System.out.println("번호 : " + no);
		System.out.println("이름 : " + name);
		System.out.println("등록일 : " + regdate);
	}
}
