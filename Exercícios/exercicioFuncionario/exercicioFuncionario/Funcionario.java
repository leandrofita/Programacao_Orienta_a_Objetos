package exercicioFuncionario;

public class Funcionario {
	
	protected String nome, cpf;
	protected double salario;
	protected String turno;
	
	Funcionario (String nome, double salario){
		
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override 
	public String toString() {
		return "[Nome: " + nome + "Salário: R$" + salario +"]\n";
	}
	
	public void calculaParticipacao() {
		 double participacao = salario *1.01;
		 System.out.println("O valor do seu salário com a participação é de: R$" + participacao);
	}

}
