package org.safari.struct.interpreter;

import org.safari.struct.ComponentNode;

/**
 * This class is the base class for design pattern Interpret.
 * 
 * @class Symbol
 * 
 * @brief Base class for the various parse tree subclasses.
 */
public abstract class Symbol {

	/**
	 * The following static consts set the precedence levels of the various
	 * operations and operands.
	 */

	/** Default precedence. */
	protected Precedence precedence;

	/** Left symbol. of the node */
	protected Symbol left;

	/** Right symbol of the node */
	protected Symbol right;

	/** Constructor*/
	public Symbol(Symbol left, Symbol right, Precedence precedence) {
		
		this.left = left;
		this.right = right;
		this.precedence = precedence;
	}
	
	 /** 
     * Method for returning precedence level (higher value means
     * higher precedence.
     */
	public Precedence precedence(){
		return this.precedence;
	}
	
	/** Abstract method for adding precedence.*/
	public abstract int addPrecedence(int accumulatedPrecedence);
	
	/** Abstract method for building a @a ComponentNOde.*/
	public abstract ComponentNode build();

}
