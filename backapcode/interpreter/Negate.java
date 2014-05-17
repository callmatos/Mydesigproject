package org.safari.struct.interpreter;

import org.safari.struct.ComponentNode;
import org.safari.struct.CompositeNegativeNode;

/**
 * @class Negate
 * 
 * @brief Defines a node in the parse tree for unary minus operator non-terminal
 *        expression.
 */
public class Negate extends UnaryOperator {

	public Negate() {
		super(null, Precedence.NEGATE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addPrecedence(int accumulatedPrecedence) {
		precedence.setPrecedence(precedence.getPrecedence()
				+ accumulatedPrecedence);
		return precedence.getPrecedence();
	}

	/** Method for building a @a Negate node. */
	@Override
	public ComponentNode build() {
		return new CompositeNegativeNode(right.build());
	}

}
