package impostoDeRenda;

public class impostoDeRenda {
	
	protected String nome, telefone, email;
	public double rendimentos;
	
	impostoDeRenda (String nome, double rendimentos){
		
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
		
		
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	

}
