package estudo.paralelo.interpret;

public class AndExpression extends Expression {

	private Expression ex1;
	private Expression ex2;
	
	public AndExpression(Expression ex1, Expression ex2){
		this.ex1 = ex1;
		this.ex2 = ex2;
	}
	
	@Override
	public boolean interpret(Context ct) {
		return ex1.interpret(ct) && ex2.interpret(ct);
	}

}
