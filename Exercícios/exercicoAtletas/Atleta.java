package Atletas;

public class Atleta implements Olimpiadas {
	
	private String nome;
	private Double peso;
	private String modalidade;
	private int totalPartipantes;
	private Pais pais;
	
	Atleta (String nome, Double peso, String modalidade, int totalPartipantes, Pais pais){
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.totalPartipantes = totalPartipantes;
		this.pais = pais;
		
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getTotalPartipantes() {
		return totalPartipantes;
	}

	public void setTotalPartipantes(int totalPartipantes) {
		this.totalPartipantes = totalPartipantes;
	}

	public Pais getPais() {
		return pais;
	}
	 public String verificarSituacao() {
		 String mensagem = ".";
		 if (this.peso > 90) {
			 this.modalidade = "Peso Pesado";
			mensagem = "Participará ->" + this.modalidade;
			 
			
		} else if(peso >= 60 && peso <= 90) {
			 this.modalidade = "Peso médio";
				mensagem = "Participará ->" + this.modalidade;
			
		}
		else {
			mensagem = "Não participará";
		}
		 return mensagem;
	 }
	 @Override
	 public String toString() {
		 String mensagem = "Nome: " + this.nome + "\nPeso: Kg" + this.peso + "\nModalidade: " + this.modalidade + "\nPais: " + pais.getNome();
		 return mensagem;
	 }

}
