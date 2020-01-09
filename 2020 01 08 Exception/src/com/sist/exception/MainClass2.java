package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			for(int i = 0; i <= 10; i++) {
				if(i == 5) {
					int a = 10 / 0;
				}
				System.out.println("i = " + i);
			}
		}catch(Exception e) {
			System.out.println("오류ㅂ 발생");
		}
		
		for(int i = 0; i <= 10; i++) {
			try {
				if(i == 5) {
					int a = 10 / 0;
				}
				System.out.println("i = " + i);
			}catch(Exception e) {
				System.out.println("오류 발생");
			}
		}
	}

}
