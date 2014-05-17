package org.safari.struct.interpreter;

import org.safari.struct.ComponentNode;
import org.safari.struct.CompositeDivideNode;

public class Divide extends Operator {

	Divide() {
		super(null, null, Precedence.MULDIV);
	}

	@Override
	public int addPrecedence(int accumulatedPrecedence) {
		precedence.setPrecedence(precedence.getPrecedence()+ accumulatedPrecedence);
		return precedence.getPrecedence();
	}

	@Override
	public ComponentNode build() {
		return new CompositeDivideNode(right.build(), left.build());
	}

}
