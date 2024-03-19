package com.javaex.temperTrans;

import java.util.Scanner;

public class temperTrans {
	
	// 화씨 <-> 섭씨 변환기
	public static void main(String[] args) {
		//
		formula form = new formula();
		
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		boolean isContinue = true;
		
		while(isContinue)
		{
			// 메뉴 메소드 호출
			menu();
			
			// 유저 입력 받기
			System.out.print("선택>>");
			int userInput = sc.nextInt();
			int value;

			switch (userInput) {
				// (0) 종료하기
				case 0 ->{
					isContinue = exit();
				}
				// (1) 섭씨 -> 화씨
				case 1, 2->{
					if(userInput == 1)
					{
						System.out.println("섭씨 -> 화씨 \n");
					}
					else 
					{
						System.out.println("섭씨 -> 화씨 \n");
					}
					System.out.print("변환 할 값 입력 : ");
					value = sc.nextInt();
					calc(userInput, value);
					
				}
				// (3) 로그 띄우기
				case 3 ->{
					
				}
				default ->
					System.out.println("(0) ~ (3)의 번호 중에서 선택해주세요.");
			}
			
			// 유저 입력 받기
			System.out.println("==================================================");
			System.out.print("계속 진행하기 >>");
			userInput = sc.nextInt();
			System.out.println("==================================================");
		}
		
		// 스캐너 닫기
		sc.close();
	}
	
	private static void menu() {
		System.out.println("==================================================");
		System.out.println("\t섭씨 <-> 화씨 변환기");
		System.out.println("==================================================");
		System.out.println("(1) : 섭씨 -> 화씨 변환");
		System.out.println("(2) : 화씨 -> 섭씨 변환");
		System.out.println("(3) : 최근 10번의 변환 로그 보기");
		System.out.println("(0) : 종료");
	}
	
	private static boolean exit() {
		System.out.println("프로그램을 종료합니다.");
		
		return false;
	}
	
	private static void calc(int pType, int pValue) {
		
	}
}
