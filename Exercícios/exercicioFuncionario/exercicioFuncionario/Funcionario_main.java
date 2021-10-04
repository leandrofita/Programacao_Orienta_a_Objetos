package exercicioFuncionario;

public class Funcionario_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario("João", 1200);
		
		Gerente g1 = new Gerente("Paulo", 50000);
		
		Assistente a1 = new Assistente("Faz Tudo", 1000, 500);
		
		System.out.println(f1.toString());
		f1.calculaParticipacao();
		System.out.println(g1.toString());
		g1.calculaParticipacao();
		System.out.println(a1.toString());
		a1.mostarSalario();

	}

}
