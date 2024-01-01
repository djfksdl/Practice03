package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		//팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력받아 팩토리얼 값을 출력하세요. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int factorial = 1;
		
		for(int i = 1; i<=num; i++ ) {
			factorial = factorial*i;
			
		}System.out.println("결과값:" + factorial);
		
		sc.close();
		
		
	}
}
