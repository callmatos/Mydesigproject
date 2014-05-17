package org.safari.struct;

/**
 * @class CompositeBinaryNode
 *
 * @brief Defines a left and right node (via inheritance).  It plays
 *        the role of a "Composite" in the Composite pattern.
 */
public class CompositeBinaryNode extends CompositeUnaryNode {


	/** Reference to the left child. */
	private ComponentNode left;
	
	/**
	 * Constructor default for all Binary node.
	 * @param right - The COmponenent node of right.
	 * @param left - The component node of left.
	 */
	public CompositeBinaryNode(ComponentNode right,ComponentNode left) {
		super(right);
		this.left = left;
	}	
	
	/** Return the left node of Binary node*/
	@Override
	public ComponentNode left() {
		return this.left;
	}

}
