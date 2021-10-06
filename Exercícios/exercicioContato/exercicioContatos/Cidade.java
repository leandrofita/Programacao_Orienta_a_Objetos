package exercicioContatos;

public class Cidade {
	
	private String nomeCidade;
	private Estado estado;
	
	Cidade (String nomeCidade, Estado estado){
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}
	
	@Override
	public String toString() {
		String mensagem = "\nCidade: " + nomeCidade+estado.toString();
		return mensagem;
	}

}
