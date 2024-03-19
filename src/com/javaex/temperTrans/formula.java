package com.javaex.temperTrans;

public class formula {
	private enum eCalType {
		eFeToCel, eCelToFel, eDefault;
	}
	
	int mValue;
	int mResult;
	eCalType eCal;
	//매니저 할 때 다시 하자
	formula frontFormula;
	formula rearFormula;
	
	public void init() {
		mValue = 0;
		mResult = 0;
		eCal = eCalType.eDefault;
		frontFormula = null;
		rearFormula = null;
	}
	
	public int getValue()
	{
		return mValue;
	}
	
	public void setValue(int pValue)
	{
		mValue = pValue;
	}
	
	public int getResult()
	{
		return mResult;
	}
	
	public void setResult(int pValue)
	{
		mResult = pValue;
	}
	
	//getset 만들던 중
}
