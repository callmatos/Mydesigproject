package org.safari.struct.bridgother;

import java.util.Iterator;

import org.safari.struct.ComponentNode;
import org.safari.struct.visitor.Visitor;

/**
 * @class InstrumentedExpressionTree
 * 
 * @brief Interface for the Composite pattern that is used to contain all the
 *        operator and operand nodes in the expression tree. Plays the role of
 *        the "Abstraction" in the Bridge pattern and delegates to the
 *        appropriate "Implementor" that performs the expression tree
 *        operations, after first logging the start and finish of each call.
 */
public class InstrumentedExpressionTree extends ExpressionTree {

	public InstrumentedExpressionTree(ComponentNode root) {
		super(root);
	}

	/** Returns whether a the tree is null. */
	@Override
	public boolean isNull() {
		System.out.println("Starting isNull() call");
		boolean temp = super.isNull();
		System.out.println("finished isNull() call");
		return temp;
	}

	@Override
	public ComponentNode getRoot() {
		System.out.println("starting getRoot() call");
		ComponentNode temp = super.getRoot();
		System.out.println("finishd getRoot() call");
		return temp;
	}

	@Override
	public int item() throws Exception {
		System.out.println("starting item() call");
		int temp = super.item();
		System.out.println("finished item() call");
		return temp;
	}

	@Override
	public ExpressionTree left() {
		System.out.println("string left() call");
		ExpressionTree temp = super.left();
		System.out.println("finished right() called");
		return temp;
	}
	
	@Override
	public ExpressionTree right() {
		System.out.println("starting right() call");
		ExpressionTree temp = super.right();
		System.out.println("finished right() called");
		return temp;
	}
	
	@Override
	public void accept(Visitor visitor) {
		System.out.println("starting accept() call");
		super.accept(visitor);
		System.out.println("finished accept() call");
	}
	
	/** 
     * Returns the designated iterator after requesting it from
     * factory method. 
     */
	@Override
    public Iterator<ExpressionTree> makeIterator(String traversalOrder)
    {
//        System.out.println("starting makeIterator() call");
//        Iterator<ExpressionTree> temp = treeIteratorFactory.makeIterator(this,
//                                                                         traversalOrder);
//        System.out.println("finished makeIterator() call");
//        return temp;
		return null;
    }
	

}
