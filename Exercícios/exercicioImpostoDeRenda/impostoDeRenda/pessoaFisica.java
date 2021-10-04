package impostoDeRenda;

public class pessoaFisica extends impostoDeRenda{
	
	private String cpf, rg;
	
	pessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
		
	}

	public String getCpf() {
		return cpf;
	}


	public String getRg() {
		return rg;
	}
	
	public void caculoIR() {
		
		double desconto = getRendimentos() * 0.12;
		System.out.println("Você deve pagar R$"+desconto);
	}

}
