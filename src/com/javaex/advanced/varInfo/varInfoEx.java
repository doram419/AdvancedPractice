package com.javaex.advanced.varInfo;

import java.util.Scanner;

import com.javaex.advanced.varInfo.Data;

public class varInfoEx {
	// 변수형을 선택하면 크기와 최댓값을 알려주는 프로그램
	// ver 0.1
	
	public static void main(String[] args) {
		Data cData1 = new Data("논리형", "boolean",
				"1byte", "true OR false(0과 1이 아니다)", 
				"boolean isFun = true;");
		Data cData2 = new Data("문자형", "char",
				"2byte", "모든 유니코드 문자\n(\\u0000~\\uFFFF, 0~65535)", 
				"char c = 'f';");
		Data cData3 = new Data("정수형", "byte",
				"1byte", "-128 ~ 127", 
				"byte b = 89;");
		Data cData4 = new Data("정수형", "short",
				"2byte", "-32,768 ~ 32,767 ", 
				"short s = 32760;");
		Data cData5 = new Data("정수형", "int",
				"4byte", "-2,147,483,648 ~ 2,147,483,647", 
				"int x = 59;");
		Data cData6 = new Data("정수형", "long",
				"8byte", "-9,223,372,036,854,775,808 ~ "
						+ "9,223,372,036,854,775,807", 
				"long big = 345678912345L");
		Data cData7 = new Data("실수형", "float",
				"4byte", "-3.4E38 ~ 3.4E38 ", 
				"float f = 32.5F;");
		Data cData8 = new Data("실수형", "double",
				"8byte", "-1.7E308 ~ 1.7E308", 
				"double d = 2.3e10;");	
		
		boolean isContinue = true;
		int userInput = -1;
		
		init();
		
		// 프로그램 소개(Intro)
		intro();
		
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
				switch (userInput) {
				case 1 -> {
					cData1.printInfo();
				}
				case 2 -> {
					cData2.printInfo();
				}
				case 3 -> {
					cData3.printInfo();
				}
				case 4 -> {
					cData4.printInfo();
				}
				case 5 -> {
					cData5.printInfo();
				}
				case 6 -> {
					cData6.printInfo();
				}
				case 7 -> {
					cData7.printInfo();
				}
				case 8 -> {
					cData8.printInfo();
				}
				default ->
					throw new IllegalArgumentException("Unexpected value: " + userInput);
				}
			}
			// 유저가 오입력시 에러 메서드 호출
			else
			{
				error();
			}
		}
		
		// 스캐너 닫기
		sc.close();
	}
	
	// 초기화
	private static void init() {
		// 깔끔하게 init로 빼고 싶지만
		// 데이터 매니저 만들고 파일 입출력까지 생각해버리니까 머리가 복잡하다
		// 일단 대충하자.
		System.out.println("초기화 중");
	}
	
	// 프로그램을 구동하면 나오는 설명
	// 변수 학습 프로그램
	private static void intro() {
		System.out.println("========================================");
		System.out.println("  변수 타입을 선택하면 정보를 알려주는 프로그램");
		System.out.println("========================================");
	}
	
	// 메뉴 메서드
	private static void menu() {
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
