package com.javaex.advanced.varInfo;

import java.util.Scanner;

//import com.javaex.advanced.varInfo.DataManager;

public class VarInfoEx {
	// 변수형을 선택하면 크기와 최댓값을 알려주는 프로그램
	// ver 0.2
	
	public static void main(String[] args) {
		DataManager dMgr = new DataManager();
		
		boolean isContinue = true;
		int userInput = -1;
		
		dMgr.init();
		
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);	
		
		while (isContinue) {
			//메뉴 출력
			menu();
			
			// 유저입력 받기
			System.out.print("입력 > ");
			userInput = sc.nextInt();
			
			// 유저가 0 선택시 종료 메서드 호출
			if(userInput == 0)
			{
				isContinue = end();
			}
			// 유저가 1~8 선택시 정보 출력 메서드 호출
			// 유저 입력에 맞춘 정보 출력
			else if(userInput >= 1 && userInput <= 8)
			{
				dMgr.printData(userInput);
			}
			// 유저가 오입력시 에러 메서드 호출
			else
			{
				error();
			}
			
			System.out.print("아무 키 누르면 진행 > ");
			userNext = sc.next();
			System.out.flush();
		}
		
		// 스캐너 닫기
		sc.close();
	}
	
	// 메뉴 메서드
	private static void menu() {
		System.out.println("========================================");
		System.out.println("  변수 타입을 선택하면 정보를 알려주는 프로그램");
		System.out.println("========================================");
		System.out.println("논리형 : 1. boolean\n"
				+ "문자형 : 2. char\n"
				+ "정수형 : 3. byte\t4. short\t5. int\t6. long\n"
				+ "실수형 : 7. float\t8. double\t"
				+ "[ 종료 : (0) ]");
	}
	
	// 프로그램 종료 메서드
	private static boolean end() {
		System.out.println("프로그램을 종료합니다.");
		return false;
	}

	// 오입력시 처리 메서드
	private static void error() {
		System.out.println("ERORR : 잘못된 번호입니다!\n다시 입력해주세요");
	}
}
