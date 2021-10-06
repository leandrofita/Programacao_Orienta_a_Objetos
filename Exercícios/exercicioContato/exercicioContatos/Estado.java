package exercicioContatos;

public class Estado {
	
	private String nomeEstado;
	private String sigla;
	
	Estado (String nomeEstado, String sigla){
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}
	
	@Override
	public String toString() {
		String mensagem = "\nEstado: " + nomeEstado + ", Sigla UF: " + sigla;
		return mensagem;
	}

}
