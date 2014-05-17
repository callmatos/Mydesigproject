package org.safari.struct;

import org.safari.struct.visitor.Visitor;

public class LeafNode extends ComponentNode {
	
	/** Integer value associated with the operand.*/
	private int item;
	
	/** Constructor with paramenter int*/
	public LeafNode(int item){
		this.item = item;
	}
	
	/** Constructor with paramenter String*/
	public LeafNode(String item){
		this.item = Integer.parseInt(item);
	}
	
	/** Return the item referent this LeafNode*/
	@Override
	public int item() {
		return this.item;
	}

	@Override
	void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	/** This method cannot called, because it's a LeafNode */
	@Override
	public ComponentNode right() {
		throw new UnsupportedOperationException("LeafNode::right() cannot called");
	}

	/** This method cannot called, because it's a LeafNode */
	@Override
	public ComponentNode left() {
		throw new UnsupportedOperationException("LeafNode::left() cannot called");
	}

}
