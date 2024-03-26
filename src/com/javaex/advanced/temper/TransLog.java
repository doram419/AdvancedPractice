package com.javaex.advanced.temper;

public class TransLog {
	private Type transType;
	private double value;
	private double result;
	private TransLog front;
	private TransLog rear;
	
	public void init(Type type, double value) {
		setTransType(type);
		setValue(value);
		setResult(calc());
	}
	
	private double calc()
	{
		if(transType == Type.CelToFe)
		{
			result = (9.0 / 5.0) * value + 32;
		}
		else
		{
			result = (5.0 / 9.0) * (value - 32);
		}
		return result;
	}
	
	public Type getTransType() {
		return transType;
	}
	
	private void setTransType(Type transType) {
		this.transType = transType;
	}
	
	public double getValue() {
		return value;
	}
	
	private void setValue(double value) {
		this.value = value;
	}
	
	public double getResult() {
		return result;
	}
	
	private void setResult(double result) {
		this.result = result;
	}
	
	public TransLog getFront() {
		return front;
	}
	
	public void setFront(TransLog transLog) {
		front = transLog;
	}

	public TransLog getRear() {
		return rear;
	}

	public void setRear(TransLog Rear) {
		this.rear = Rear;
	}
}
