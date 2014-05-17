package org.safari.struct.interpreter;


/**
 * @class UnaryOperator
 *
 * @brief Defines a node in the parse tree for unary operator
 *        non-terminal expressions.
 */
public abstract class UnaryOperator extends Symbol {

	public UnaryOperator(Symbol right, Precedence precedence) {
		super(null, right, precedence);
	}
}
