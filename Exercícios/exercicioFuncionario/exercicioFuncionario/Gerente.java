package exercicioFuncionario;

public class Gerente extends Funcionario {
	
	private String nivel;
	
	
	Gerente (String nome, double salario){
		super(nome, salario);
		
	}
	
	@Override
	public void calculaParticipacao() {
		 double participacao = (salario *1.01) + 200;
		 System.out.println("O valor do seu salário com a participação é de: R$" + participacao);
	}

	

}
