package org.safari.struct.bridgother;

import java.util.Iterator;

import org.safari.struct.ComponentNode;
import org.safari.struct.visitor.Visitor;

/**
 * @class SynchronizedExpressionTree
 * 
 * @brief Interface for the Composite pattern that is used to contain all the
 *        operator and operand nodes in the expression tree. Plays the role of
 *        the "Abstraction" in the Bridge pattern and delegates to the
 *        appropriate "Implementor" that performs the expression tree
 *        operations, after first synchronizing each call.
 */
public class SynchronizedExpression extends ExpressionTree {

	public SynchronizedExpression(ComponentNode root) {
		super(root);
	}

	@Override
	public boolean isNull() {
		synchronized (this) {
			return super.isNull();
		}
	}

	@Override
	public ComponentNode getRoot() {
		synchronized (this) {
			return super.getRoot();
		}
	}

	@Override
	public int item() throws Exception {
		synchronized (this) {
			return super.item();
		}
	}

	@Override
	public ExpressionTree left() {
		synchronized (this) {
			return super.left();
		}
	}

	@Override
	public ExpressionTree right() {
		synchronized (this) {
			return super.right();
		}
	}

	@Override
	public void accept(Visitor visitor) {
		synchronized (this) {
			super.accept(visitor);
		}
	}

	@Override
	public Iterator<ExpressionTree> makeIterator(String traversalOrderRequest) {
		synchronized (this) {

			return super.makeIterator(traversalOrderRequest);
		}

	}

}
