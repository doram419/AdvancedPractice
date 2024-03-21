package com.javaex.advanced.temper;

public class LogMgr {
	private int m_nLogAmountMax;
	private int m_nLogAmount; 
	private TransLog m_cLastLog;
	
	public void init()
	{
		m_nLogAmountMax = 3; 
		m_nLogAmount = 0;
		m_cLastLog = null;
	}
	
	public void createLog() {
		TransLog Log = new TransLog();
		
		if(m_nLogAmount == 0)
		{
			
		}
		else
		{
			
		}
		//init에서 노드만 분리?? 강제성이 잇나?
	}
}
