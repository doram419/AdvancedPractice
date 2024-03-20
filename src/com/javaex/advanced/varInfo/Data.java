package com.javaex.advanced.varInfo;

public class Data {
	// 변수 정보
	// 자료형 / 키워드 / 크기 / 표현 범위 / 예제
	private String mType;
	private String mKeyword;
	private String mByte;
	private String mRange; 
	private String mExample;
	
	// 생성자를 만들면 조립이 어렵지만 강제성을 띄게 하자.
	public void init(String pType, String pKeyword, String pByte, 
			String pRange, String pExample) {
		setType(pType);
		setKeyword(pKeyword);
		setByte(pByte);
		setRange(pRange);
		setExample(pExample);
	}
	
	public void printInfo()
	{
		System.out.println("자료형 : " + getType() + "\n키워드 : " +
				getKeyword() + "\n크기 : " + getByte() + "\n표현 범위 : " +
				getRange() + "\n사용 예 : " + getExample());
	}
	
	private String getType()
	{
		return mType;
	}
	
	private void setType(String pType)
	{
		mType = pType;
	}
	
	private String getKeyword()
	{
		return mKeyword;
	}
	
	private void setKeyword(String pKeyword)
	{
		mKeyword = pKeyword;
	}

	private String getByte()
	{
		return mByte;
	}
	
	private void setByte(String pByte)
	{
		mByte = pByte;
	}
	
	private String getRange()
	{
		return mRange;
	}
	
	private void setRange(String pRange)
	{
		mRange = pRange;
	}
	
	private String getExample()
	{
		return mExample;
	}
	
	private void setExample(String pExample) {
		mExample = pExample;
	}

}
