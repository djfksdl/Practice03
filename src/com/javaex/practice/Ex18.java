package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		//?? 숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int j =1;
		
		for(int i=1; i<= 2*num-1; i++) { // 세로줄 : 입력받은 수*2 -1만큼 생김
			if( j <= num) {
				for( j = num; j>=i; j--) { //가로별 : 입력받은수에서 하나씩 줄어들기, 최솟값=1개
					System.out.print("*");
				}
				System.out.println(" ");
				
			}else {
				for(j = 0; j<=i; j++) {
					System.out.println("*");
				}System.out.println(" ");
			}
			
		}
	}
}
