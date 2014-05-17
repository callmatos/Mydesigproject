package estudo.paralelo.interpret;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {

	private Context ctt;
	
	public TerminalExpression(Context ctt){
		this.ctt = ctt;
	}
	
	@Override
	public boolean interpret(Context ct) {
		
		StringTokenizer st = new StringTokenizer(ct.getStr());
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()){
			String test = st.nextToken();
			if(test.equals(ctt.getStr())){
				return true;
			}
		}
		return false;
	}
	
	public Context getContext(){
		return ctt;
	}

}
