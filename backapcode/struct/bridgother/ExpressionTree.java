package org.safari.struct.bridgother;

import java.util.Iterator;

import org.safari.struct.ComponentNode;
import org.safari.struct.visitor.Visitor;

/**
 * @class ExpressionTree
 *
 * @brief Interface for the Composite pattern that is used to contain
 *        all the operator and operand nodes in the expression tree.
 *        Plays the role of the "Abstraction" in the Bridge pattern
 *        and delegates to the appropriate "Implementor" that performs
 *        the expression tree operations.
 */
public class ExpressionTree {

	private ComponentNode root = null;
	
	/**
     * Ctor that takes a @a Node * that contains all the nodes in the
     * expression tree.
     */
	public ExpressionTree(ComponentNode root){
		this.root = root;
	}
	
	/** Return whether a the tree is null*/
	public boolean isNull(){
		return root == null;
	}
	
	/** Returns root*/
	public ComponentNode getRoot(){
		return root;
	}
	
	public int item() throws Exception
	{
		return root.item();
	}
	
	/** Return the tree's left node*/
	public ExpressionTree left(){
		return new ExpressionTree(this.root.left());
	}
	
	/** Return the tree's right node.*/
	public ExpressionTree right(){
		return new ExpressionTree(this.root.right());
	}
	
	/** Accepts a @a visitor.*/
	public void accept(Visitor visitor){
		this.accept(visitor);
	}
	
	 /** 
     * Returns an @a Iterator that supports the requested
     * traveralOrder.
     */
	public Iterator<ExpressionTree> makeIterator(String traversalOrderRequest){
		return null;
	}
	
}
