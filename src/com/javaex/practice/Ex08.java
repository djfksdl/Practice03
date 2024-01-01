package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 아래와 같이 구구단을 출력하세요
		
		for(int back = 1; back <10; back++) {
			for(int front= 2; front<10; front++) {
				System.out.print(front + "*" + back + "=" + front*back + "\t");
			}
			System.out.println("");
		}
		
	}

}
