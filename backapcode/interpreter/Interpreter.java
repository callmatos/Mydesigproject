package org.safari.struct.interpreter;


/**
 * @class Interpreter
 *
 * @brief Parses incoming expression strings into a parse tree and
 *        builds an expression tree from the parse tree.  This class
 *        plays the role of the "Interpreter" in the Intepreter
 *        pattern, tweaked to use the precedence of operators/operands
 *        to guide the creation of the parse tree.  It also uses the
 *        Builder pattern to build the component nodes in the
 *        Composite-based expression tree.
 */
public class Interpreter {

	/** Stores the previous symbol*/
	private int multiDigitNumbers;
	
	/** Track the precedence of the expression.*/
	private int accumulatedPrecedence;
	
	/** Factory that makes an expression tree.*/
//	private ExpressionTreeFactory expressionTreeFactory;
	
	/**
	 * Stores variables and their values for use by the Interpreter.
	 * 
	 */
	private SymbolTable symbolTable = new SymbolTable();
	

	public SymbolTable getSymbolTable(){
		return symbolTable;
	}
	
	public Interpreter(){
//		this.expressionTreeFactory = new ExpressionTreeFactory();
	}
	
//	public Interpreter(ExpressionTreeFactory expressionTreeFactory){
//		this.expressionTreeFactory = expressionTreeFactory;
//	}
	
	
}
