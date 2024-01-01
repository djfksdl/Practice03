package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// 아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.
		
		int x,y;
		for(x=0; x<4; x++) { //세로 0 1 2 3 :4줄
			for(y=2; y>=0; y--) { // 가로 2 1 0 : ***
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
