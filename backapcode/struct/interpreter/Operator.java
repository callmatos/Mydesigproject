package org.safari.struct.interpreter;


/**
 * @class Operator
 *
 * @brief Defines a base class in the parse tree for operator
 *        non-terminal expressions.
 */
public abstract class Operator extends Symbol {

	Operator(Symbol left, Symbol right, Precedence precedence) {
		super(left, right, precedence);
	}
}
