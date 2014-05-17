package org.safari.struct;

import org.safari.struct.visitor.Visitor;

/**
 * @class CompositeDivideNode
 * 
 * @brief A node containing left and right children.  The meaning of
 *        this node is left / right.  It plays the role of a
 *        "Composite" in the Composite pattern.
 */
public class CompositeDivideNode extends CompositeBinaryNode {

	public CompositeDivideNode(ComponentNode right, ComponentNode left) {
		super(right, left);
	}
	
	@Override
	public int item() {
		return '/';
	}
	
	/** 
     * Define the @a accept() operation used for the Visitor pattern
     * to accept the @a visitor. 
     */
	@Override
	void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
