package exercicioContatos;

import java.util.ArrayList;

public class Contato {
	
	private String nome;
	Endereco endereco;
	Telefone[] telefone; 
	ArrayList<Telefone> telefone2; // opção com o array list

	

	public Contato(String nome, Endereco endereco,  Telefone[] telefone){
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		//this.telefone2 = new ArrayList<Telefone>();
	}
		
		
		
	public Contato(String nome, Endereco endereco, ArrayList<Telefone> telefone2) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone2 = telefone2;
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

	public void setTelefone(Telefone telefone) {
		
		this.telefone2.add(telefone);
		
		
	}
	
	
	public String mostrarTelefone() {
		String mensagem = ".";
		for (int i = 0; i < telefone.length; i++) {
	
			mensagem += "\nTelefone " + (i+1) + ":"+ telefone[i].getNumero();		
			
		}
		return mensagem;
	}
	
	
		public String mostrarTelefone2() { // método para mostar telefone usando o laço for convencional
			String mensagem = "";
			for (int i = 0; i < telefone2.size(); i++) {
		
				mensagem += "\nTelefone " + (i+1) + ":"+ telefone2.get(i).getNumero();		
				
			}
			return mensagem;
		
	}
		
		public String mostrarTelefone3() { // método para mostar telefone usando o for each
			String mensagem ="";
			int contador = 0;
			for (Telefone t: telefone2) {
				mensagem += "\nTelefone " + (++contador) + ":"+ t.getNumero();
			}
			return mensagem;
		}
	
	@Override
	public String toString() {
		String mensagem = "Nome: "+  this.nome + endereco.toString() + mostrarTelefone3();
		return mensagem;
	}

}
