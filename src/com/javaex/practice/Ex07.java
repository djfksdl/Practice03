package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 숫자를 입력받아 아래와 같이 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int no = sc.nextInt();
		
		for(int y= 1; y<= no; y++) { // 입력한 숫자만큼의 세로줄이 나옴
			
			for(int x =1; x<= y; x++) { //세로줄에 따른 가로줄 숫자가 쓰여짐
				System.out.print(y);				
			}
			System.out.println(" ");
		}
		
		sc.close();

	}

}
