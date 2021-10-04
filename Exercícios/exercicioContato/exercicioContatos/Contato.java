package exercicioContatos;

public class Contato {
	
	private String nome;
	Endereco endereco;
	Telefone[] telefone;
	Cidade cidade;
	Estado estado;
	

	Contato(String nome, Endereco endereco, Cidade cidade, Estado estado, Telefone[] telefone){
		this.endereco = endereco;
		this.nome = nome;
		this.cidade= cidade;
		this.estado = estado;
		this.telefone = telefone;
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}
	
	/*public void cadastraTelefone(Telefone Telefone) {
		for (int i = 0; i > this.telefone.length; i++) {
			if (this.telefone[i] == null) {
				this.telefone[i] = Telefone);
				return;
			}
		}
	}*/
	public void mostrarTelefone() {
		
		for (int i = 0, j= 1; i < telefone.length; i++, j++) {
	
			System.out.println("Telefone " + j + " :"+ telefone[i].getNumero());		
			
		}
		
		
	}
	
	@Override
	public String toString() {
		String mensagem = "Nome: "+ this.nome + "\nEndereço: "+ endereco.getRua()+", "+ endereco.getBairro()+" CEP: "+ endereco.getCep()
		+ "\nCidade: " + cidade.getNomeCidade() + ", " + "\nEstado: " + estado.getNomeEstado() + " ("+ estado.getSigla() +") .";
		return mensagem;
	}

}
