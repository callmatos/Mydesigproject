package org.safari.struct.interpreter;

import org.safari.struct.ComponentNode;
import org.safari.struct.LeafNode;

public class Number extends Symbol {

	/** Value of Number. */
	private int item;

	public Number(String input) {
		super(null, null, Precedence.NUMBER);
		item = Integer.parseInt(input);
	}
	
	public Number(int input){
		this(String.valueOf(input));
	}
	
	/** 
     * Adds numberPrecedence to the current accumulatedPrecedence
     * value.
     */
	@Override
	public int addPrecedence(int accumulatedPrecedence) {

		precedence.setPrecedence(Precedence.NUMBER.getPrecedence() + accumulatedPrecedence);
		return precedence.getPrecedence();
	}

	/** Builds a @a LeadNode.*/
	@Override
	public ComponentNode build() {
		return new LeafNode(item);
	}

}
