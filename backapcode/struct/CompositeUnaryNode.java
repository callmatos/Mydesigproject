package org.safari.struct;

import org.safari.struct.visitor.Visitor;

public abstract class CompositeUnaryNode extends ComponentNode {

	/** Reference to the right child*/
	private ComponentNode right;
	
	/** Constructor*/
	public CompositeUnaryNode(ComponentNode right){
		this.right = right;
	}
	
	@Override
	public ComponentNode right() {
		return this.right;
	}
	
	@Override
	public int item(){
		throw new UnsupportedOperationException("ComponentNode::item() called improperly");
	}
	
	@Override
	void accept(Visitor visitor){
		throw new UnsupportedOperationException("ComponentNode::accept() called improperly");
	}
	
	
	
}
