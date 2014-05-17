package org.safari.struct.interpreter;

import org.safari.struct.ComponentNode;
import org.safari.struct.CompositeSubtractNode;

/**
 * @class Subtract
 *
 * @brief Defines a node in the parse tree for the binary subtract
 *        operator non-terminal expression.
 */
public class Subtract extends Operator {

	Subtract() {
		super(null, null, Precedence.ADDSUB);
	}

	@Override
	public int addPrecedence(int accumulatedPrecedence) {
		
		precedence.setPrecedence(precedence.getPrecedence() + accumulatedPrecedence);
		
		return precedence.getPrecedence();
	}

	@Override
	public ComponentNode build() {
		
		return new CompositeSubtractNode(left.build(), right.build());
	}

}
