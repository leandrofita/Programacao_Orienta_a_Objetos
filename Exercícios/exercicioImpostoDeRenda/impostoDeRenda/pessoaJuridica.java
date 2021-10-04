package impostoDeRenda;

public class pessoaJuridica extends impostoDeRenda {
	
	private  String cnpj, inscEstadual;
	
	pessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	
	public String getCnpj() {
		return cnpj;
	}


	public String getInscEstadual() {
		return inscEstadual;
	}

	

public void caculoIR() {
		
		double desconto = getRendimentos() * 0.15;
		System.out.println("Sua empresa deve pagar R$"+desconto);
	
 }
}
