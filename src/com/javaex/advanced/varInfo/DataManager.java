package com.javaex.advanced.varInfo;

//import com.javaex.advanced.varInfo.Data;

public class DataManager {
	Data datas[] = new Data[8];
	
	public void init()
	{
		for (int i = 0; i < datas.length; i++) {
			datas[i] = new Data();
		}
		
		datas[0].init("논리형", "boolean",
				"1byte", "true OR false(0과 1이 아니다)", 
				"boolean isFun = true;");
		datas[1].init("문자형", "char",
				"2byte", "모든 유니코드 문자\n(\\u0000~\\uFFFF, 0~65535)", 
				"char c = 'f';");
		datas[2].init("정수형", "byte",
				"1byte", "-128 ~ 127", 
				"byte b = 89;");
		datas[3].init("정수형", "short",
				"2byte", "-32,768 ~ 32,767 ", 
				"short s = 32760;");
		datas[4].init("정수형", "int",
				"4byte", "-2,147,483,648 ~ 2,147,483,647", 
				"int x = 59;");
		datas[5].init("정수형", "long",
				"8byte", "-9,223,372,036,854,775,808 ~ "
						+ "9,223,372,036,854,775,807", 
				"long big = 345678912345L");
		datas[6].init("실수형", "float",
				"4byte", "-3.4E38 ~ 3.4E38 ", 
				"float f = 32.5F;");
		datas[7].init("실수형", "double",
				"8byte", "-1.7E308 ~ 1.7E308", 
				"double d = 2.3e10;");	
	}

	public void printData(int pIndex)
	{
		pIndex -= 1;
		
		if(pIndex >= 0 && pIndex <= 7)
		{
			System.out.println("========================================");
			datas[pIndex].printInfo();
			System.out.println("========================================");
		}
	}
}
