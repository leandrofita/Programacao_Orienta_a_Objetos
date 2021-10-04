package exercicioFuncionario;

public class Assistente extends Funcionario{
	
	private double adicional;
	
	Assistente (String nome, double salario, double adicional){
	super (nome, salario);
	this.adicional = adicional;
	
	}

	public double getAdicional() {
		return adicional;
	}
	
	
	public void mostarSalario() {
		double novoSalario = salario + getAdicional();
		System.out.println("O valor do seu salário com o adiconal é de: R$" + novoSalario);
		}
}
