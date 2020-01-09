package com.sist.exception;

/*
 * 예외처리 -> 소스상에서 수정이 가능한 에러
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		try {
			for(int i = 0; i <= 6; i++) {
				arr[i] = (int)(Math.random()*45) + 1;
			}
			
		}catch(Exception e1) {System.out.println("오류 발생");}
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
