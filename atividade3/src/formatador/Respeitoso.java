package formatador;

public class Respeitoso implements FormatadorNome {
	private String genero; // "masculino" ou "feminino"

	public Respeitoso(String genero) {
	    this.genero = genero;
	}
	
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
	    if ("masculino".equals(genero)) return "Sr. " + sobrenome; 
	     else return "Sra. " + sobrenome; 
	}
}
