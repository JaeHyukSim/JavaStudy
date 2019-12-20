//String : 문자열을 제어
/*
 * java.lang => import를 생략할 수 있다.
 * 문자열을 저장하는 방법
 * 	1. String + name of variable + "=" + real string;
 * 	2. String + name of variable + "=" + new String("real string");
 * 										**new :: 새로운 메모리에 저장
 * 
 * 
 *******************************************************
 *	String에서 제공하는 기능
 *	equals				(true / false)
 *			-> ID, PWD등을 확인할 때 사용된다 : 대소문자 구분
 *				문자열은 ==쓰면 안된다
 *
 *				String s = "Hello"
 *				String s1 = "Hello"
 *				===================
 *				s1 == s ?????? -> String s = "Hello";
									String s1 = "Hello";
									String s2 = new String("Hello");
							 		System.out.println(s == s1);
									System.out.println(s == s2); -> "Hello"의 주소와 "Hello"의 주소는 같다.
 *	substring
 *	length
 *	trim
 *	startsWith, endsWith
 *	indexOf, lastIndexOf
 *	문자의 위치(indexOf : 앞에서, lastIndexOf : 뒤에서)
 *	String s = "Hello Java";
 *	s.lastIndexOf('a') //s.indexOf('a');
 *	경로명을 찾을 때 슬러시를 찾기 위해서 사용한다. or 시간을 가져올 때 '분'을 자르기 위해서 index를 찾을 필요가 있다
 *	split
 *	String s = "이병헌, 하정우, 마동석, 전혜진, 수지"
 *	->String[] names = s.split(","); << 이런식으로 사용
 *	toUpperCase, toLowerCase
 *	replace , replaceAll
 */

package StringPracticePackage;

import java.util.Scanner;

public class 문자열출력 {

	static String[] findData(String data) {
		String[] ss = {
				"자바와 JSP", "자바 프로그래밍", "스프링 5.0", "Ajax와 JSP", "리덕스와 리액트",
				"자바 오라클", "MVC 구조", "코틀린과 안드로이드", "코틀린 프로그램", "스프링 데이터",
				"혼자 배우는 자바","지능형 웹 프로그램","웹프로그래밍","자바 웹 프로그램",
				"오라클 자바"
				
		};
		
		String[] findData = new String[10];
		
		int j = 0;
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].contains(data)) {
				findData[j] = ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		
		/*
		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s == s1);
		System.out.println(s == s2);
		
		String ss = "hello my name is sim";
		String[] names = ss.split(" "); 
		for(String i : names) {
			System.out.println(i);
		}
		
		String s3 = "113분";
		s3 = s3.replaceAll("[^0-9]", "");
		System.out.println(s3);
		*/
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("검색어 입력");
		String data = scn.next();
		String[] ans = findData(data);
		for(String i : ans) {
			if(i != null)
				System.out.println(i);
		}
	}

}