package org.safari.struct.interpreter;

import org.safari.struct.ComponentNode;
import org.safari.struct.CompositeAddNode;

public class Add extends Operator {

	public Add(){
		super(null,null,Precedence.ADDSUB);
	}
	
	@Override
	public int addPrecedence(int accumulatedPrecedence) {
		precedence.setPrecedence(precedence.getPrecedence()+ accumulatedPrecedence);
		return precedence.getPrecedence();
	}

	@Override
	public ComponentNode build() {
		return new CompositeAddNode(left.build(), right.build());
	}

}
