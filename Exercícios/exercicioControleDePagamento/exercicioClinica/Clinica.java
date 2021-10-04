package exercicioClinica;

public class Clinica extends Plano {
	
	private String nome;
	private String cgc;

	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
		
	}
	public String toString() {
		String mensagem = super.toString() + "Nome da Clínica: " + nome + " CGC: " + cgc + ". ";
		return mensagem;
		
	}
	public String getNome() {
		return nome;
	}
	public String getCgc() {
		return cgc;
	}

}
