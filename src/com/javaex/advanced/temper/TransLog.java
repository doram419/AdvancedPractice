package com.javaex.advanced.temper;


public class TransLog {
	private Type m_eTransType;
	private double m_dValue;
	private double m_dResult;
	private TransLog m_pfront;
	
	public void init(Type pType, double pValue, TransLog pLog) {
		setTransType(pType);
		setValue(pValue);
		setFront(pLog);
		setResult(calc());
	}
	
	private double calc()
	{
		if(m_eTransType == Type.CelToFe)
		{
			m_dResult = (9 / 5) * m_dValue + 32;
		}
		else
		{
			m_dResult = (5 / 9) * (m_dValue - 32);
		}
		return m_dResult;
	}
	
	public Type getTransType() {
		return m_eTransType;
	}
	
	private void setTransType(Type pTransType) {
		m_eTransType = pTransType;
	}
	
	public double getValue() {
		return m_dValue;
	}
	
	private void setValue(double pValue) {
		m_dValue = pValue;
	}
	
	public double getResult() {
		return m_dResult;
	}
	
	private void setResult(double pResult) {
		m_dResult = pResult;
	}
	
	public TransLog getFront() {
		return m_pfront;
	}
	
	private void setFront(TransLog pTransLog) {
		m_pfront = pTransLog;
	}
}
