package estudo.paralelo.interpret;

public class Context {

	// Informacao a ser tratada.
	private String str;
	
	// Construtor sem paramentro
	public Context(){}
	
	// Construtor com paramentro
	public Context(String str){
		this.str = str;
	}
		
	// Retorno a String informada
	public String getStr(){
		return str;
	}
}
