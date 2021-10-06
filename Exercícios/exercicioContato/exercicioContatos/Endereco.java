package exercicioContatos;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cep;
	Cidade cidade;
	
	
	Endereco(String rua, String bairro, String cep, Cidade cidade){
		 this.rua= rua;
		 this.bairro = bairro;
		 this.cep = cep;
		 this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		String mensagem = "\nEndereço: "+ rua +", "+ bairro +", CEP: "+ cep+cidade.toString();
		return mensagem;
	}
	
	
}
