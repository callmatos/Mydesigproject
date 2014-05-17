package estudo.paralelo.interpret;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String context = "Daniel Charles";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(new Context(context)));
		
	}

	static Expression buildInterpreterTree() {
		
		Expression terminal1 = new TerminalExpression(new Context("Charles"));
		Expression terminal2 = new TerminalExpression(new Context("Patricia"));
		Expression terminal3 = new TerminalExpression(new Context(
				"Davi Emanuel"));
		Expression terminal4 = new TerminalExpression(new Context("Daniel"));

		
		boolean result1 = terminal1.interpret(new Context("Renato"));
		
		// Charles or Patricia
		Expression alter1 = new OrExpression(terminal1, terminal2);

		// Davi Emanuel or (Chales or Patricia)
		Expression alter2 = new OrExpression(terminal3, alter1);

		// Daniel and (Davi Emanuel or (Chales or Patricia)
		return new AndExpression(terminal4, alter2);
		
		

	}

}
