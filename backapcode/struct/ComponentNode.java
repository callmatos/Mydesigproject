package org.safari.struct;

import org.safari.struct.visitor.Visitor;

public abstract class ComponentNode {

	// this method is a no-op in this abstract base class.
	public abstract int item();
	
	/** Return the right child (return 0 if called directly */
	public abstract ComponentNode right();
	
	/** Return the left child return 0 if called direclty */
	public abstract ComponentNode left();

	 /**
     * Accept a visitor to perform some action on the node's item
     * completely arbitrary visitor template (throws an exception if
     * called directly).
     */
	abstract void accept(Visitor visitor);
	
}
