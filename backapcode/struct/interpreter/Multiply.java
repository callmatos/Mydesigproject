package org.safari.struct.interpreter;

import org.safari.struct.ComponentNode;
import org.safari.struct.CompositeMultiplayNode;

/**
 * @class Multiply
 *
 * @brief Defines a node in the parse tree for the binary multiply
 *        operator non-terminal expression.
 */
public class Multiply extends Operator {

	Multiply() {
		super(null, null, Precedence.MULDIV);
	}

	@Override
	public int addPrecedence(int accumulatedPrecedence) {
		precedence.setPrecedence(precedence.getPrecedence() + accumulatedPrecedence);
		return precedence.getPrecedence();
	}

	@Override
	public ComponentNode build() {
		
		return new CompositeMultiplayNode(right.build(), left.build());
	}

}
