package com.javaex.advanced.temper;

import java.util.Scanner;

public class TemperTransEx {
	public static void main(String[] args) {
		LogMgr.getInstance().init();
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		boolean isContinue = true;
	
		while(isContinue)
		{
			printInterface(LogMgr.getInstance().getLogAmountMax());
			System.out.print("입력 >> ");
			userInput = sc.nextInt();
			
			switch (userInput) {
				case 1, 2->{
					Type inputType = Type.Error;
					
					if (userInput == 1) {
						inputType = Type.CelToFe;
						System.out.println("[ 섭씨 -> 화씨 변환하기 ]");
					}
					else
					{
						inputType = Type.FeToCel;
						System.out.println("[ 화씨 -> 섭씨 변환하기 ]");
					}
					
					System.out.print("변환 값 입력 >> ");
					userInput = sc.nextInt();
					LogMgr.getInstance().createLog(inputType, userInput);
					System.out.println("< 변환 완료 >");
					LogMgr.getInstance().printLog();
				}
				case 3->{
					LogMgr.getInstance().printLogAll();
				}
				case 4->{
					System.out.println("종료합니다.");
					isContinue = false;
				}

				default ->
					throw new IllegalArgumentException("1~4 사이의 값을 입력해주세요. 현재 값 : " + userInput);
			}		
		}
		
		sc.close();
	}
	
	private static void printInterface(int logMax)
	{
		System.out.println("==================================");
		System.out.println("\t섭씨 <-> 화씨 변환기");
		System.out.println("==================================");
		System.out.println("1 | 섭씨 -> 화씨 (°C->℉)");
		System.out.println("2 | 화씨 -> 섭씨 (℉->°C)");
		System.out.printf("3 | 로그 (최신 %d개까지만 저장)%n", logMax);
		System.out.println("4 | 종료");
	}
}
