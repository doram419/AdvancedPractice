package com.javaex.advanced.temper;

// 나중에 싱글턴 구성
public class LogMgr {
	private final int logAmountMax = 3;
	private int logAmount; 
	private TransLog last;
	private TransLog first;
	
	public void init()
	{
		logAmount = 0;
		last = null;
		first = null;
	}
	
	public void createLog(Type type, double value) {
		TransLog Log = new TransLog();
		TransLog frontLog = new TransLog();
		
		if(logAmount == 0)
		{
			frontLog = null;
			first = Log;
		}
		else if(logAmount > logAmountMax)
		{
			deleteLog();
			frontLog = last;
			last.setRear(Log);
		}
		else
		{
			frontLog = last;
			last.setRear(Log);
		}
		
		Log.setFront(frontLog);
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
			if(temp.getTransType() == Type.CelToFe)
			{
				inputChar = "°C";
				resultChar = "℉";
			}
			else if(temp.getTransType() == Type.FeToCel)
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
		

		if(temp.getTransType() == Type.CelToFe)
		{
			inputChar = "°C";
			resultChar = "℉";
		}
		else if(temp.getTransType() == Type.FeToCel)
		{
			inputChar = "℉";
			resultChar = "°C";
		}
			
		System.out.printf("%.1f%s -> %.1f%s%n", last.getValue(), inputChar,
				last.getResult(), resultChar);
	}
}
