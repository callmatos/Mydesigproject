package org.safari.struct.interpreter;

public enum Precedence {

	ACCUMULATED(0),
	ADDSUB(1),
	MULDIV(2),
	NEGATE(3),
	NUMBER(4),
	PAREN(5);

	private int key;
	
	private Precedence(int key){
		this.key = key;
	}
	
	public int getPrecedence(){
		return key;
	}
	
	public void setPrecedence(int value){
		this.key = value;
	}
}
