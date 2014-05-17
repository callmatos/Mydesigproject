package org.safari.struct;

import org.safari.struct.visitor.Visitor;

/**
 * @class CompositeNegateNode
 * 
 * @brief A node containing only a right child. The meaning of this node is
 *        -right (e.g., -5, -7, etc). It plays the role of a "Composite" in the
 *        Composite pattern.
 */
public class CompositeNegativeNode extends CompositeUnaryNode {

	public CompositeNegativeNode(ComponentNode right) {
		super(right);
	}

	/** Return the printable character stored in the node. */
	@Override
	public int item() {
		return '-';
	}

	@Override
	void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public ComponentNode left() {
		throw new UnsupportedOperationException(
				"CompositeNegativeNode::left() cannot called");
	}
}
