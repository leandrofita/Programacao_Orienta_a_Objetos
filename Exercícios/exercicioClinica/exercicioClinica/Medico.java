package exercicioClinica;

public class Medico extends Plano {
	
	protected String nome;
	private int crm;
	
	Medico (String empresa, String nome, int crm){
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	@Override
	public String toString() {
		String mensagem = super.toString() + "Nome do médico: " + nome + ".";
		return mensagem;
		
	}
	public String getNome() {
		return nome;
	}
	public int getCrm() {
		return crm;
	}
	@Override
	public Double calcularPagamento() {
		return super.valorPago = super.calcularPagamento() * 1.1;
		
	}

}
