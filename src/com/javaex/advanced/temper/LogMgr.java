package com.javaex.advanced.temper;

public class LogMgr {
	private final int logAmountMax = 3;
	private int logAmount; 
	private TransLog last;
	private TransLog first;
	
	private static LogMgr instance = new LogMgr();
	
	//싱글턴 구성
	private LogMgr()
	{
		
	}
	
	public static LogMgr getInstance()
	{
		return instance;
	}
	
	public void init()
	{
		logAmount = 0;
		last = null;
		first = null;
	}
	
	public void createLog(Type type, double value) {
		TransLog Log = new TransLog();
		TransLog front;
		
		if(logAmount == 0)
		{
			front = null;
			first = Log;
		}
		else if(logAmount >= logAmountMax)
		{
			deleteLog();
			front = last;
			last.setRear(Log);
		}
		else
		{
			front = last;
			last.setRear(Log);
		}
		
		Log.setFront(front);
		Log.setRear(null);
		last = Log;
		
		Log.init(type, value);
		logAmount++;
	}

	private void deleteLog()
	{
		TransLog temp = first.getRear();
		
		first.getRear().setFront(null);
		first.setRear(null);
		first = temp;
		
		logAmount--;
	}

	public int getLogAmountMax() {
		return logAmountMax;
	}
	
	public void printLogAll()
	{
		TransLog temp = last;
		String inputChar = null;
		String resultChar = null;
		
		while(temp != null)
		{
			if(temp.getTransType() == Type.CEL_TO_FE)
			{
				inputChar = "°C";
				resultChar = "℉";
			}
			else if(temp.getTransType() == Type.FE_TO_CEL)
			{
				inputChar = "℉";
				resultChar = "°C";
			}
			
			System.out.printf("%.1f%s -> %.1f%s%n", temp.getValue(), inputChar,
					temp.getResult(), resultChar);
			
			temp = temp.getFront();
		}
	}
	
	public void printLog()
	{
		TransLog temp = last;
		String inputChar = null;
		String resultChar = null;
		

		if(temp.getTransType() == Type.CEL_TO_FE)
		{
			inputChar = "°C";
			resultChar = "℉";
		}
		else if(temp.getTransType() == Type.FE_TO_CEL)
		{
			inputChar = "℉";
			resultChar = "°C";
		}
			
		System.out.printf("%.1f%s -> %.1f%s%n", last.getValue(), inputChar,
				last.getResult(), resultChar);
	}
}
