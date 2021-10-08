package ExercicioAluno_Aula9;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	public Aluno(String nome, double nota1, double nota2) {

		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double CalcularMedia() throws AlunoException { 
		
	if (((this.nota1 >= 0 && this.nota1 <= 10) && (this.nota2 >= 0 && this.nota2 <= 10))) {
		double media = (this.nota1 + this.nota2) / 2;
		 return media;
	
	 } else {
		
		throw new AlunoException("Insercção de nota inválida");
	 
	 }		
		
			 
	}
	public String exibirAluno(List<Aluno> listaAluno) {
		String msg = "";
		for (Aluno c : listaAluno ) {
			msg += "\nNome: " + this.nome + "\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2 + "\n------------------------------------";
			
		}
		return msg;
	}
	
	public String exibirNotas(){
	String mensagem = "";
		mensagem = "\nNota 1: "+ getNota1() + "\nNota 2: " + getNota2();
				return mensagem;
	}
	
	
	
	@Override
	public String toString() {
		String mensagem = "";
		try {
			mensagem = "\nNome: " + getNome() + exibirNotas() + "\nMédia: " + CalcularMedia() + "\n--------------------------\n";
		} catch (AlunoException e) {
			System.out.println("Nota com valor inválido\n---------------------------");
		}
		return mensagem;
	}

}
