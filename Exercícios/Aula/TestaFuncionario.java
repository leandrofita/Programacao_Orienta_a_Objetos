package Aula;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario1[] = new Funcionario[2];
		funcionario1[0] = new Funcionario();
		funcionario1[0].setCargo("Gerente de Sistemas");
		funcionario1[0].setNome("Jorel");
		funcionario1[0].setSalario(5220.0);
		funcionario1[0].abonoSalario(1000);
		
		funcionario1[1] = new Funcionario();
		funcionario1[1].setCargo("Assistente");
		funcionario1[1].setNome("Irmão do Jorel");
		funcionario1[1].setSalario(200.0);
		funcionario1[0].abonoSalario(50.0);
		
		//for (int i =0; i < funcionario1.length; i++) {
			System.out.println(funcionario1[1].getNome() + "\n" + funcionario1[1].getCargo() + "\nSalário com abono: R$"
		    +funcionario1[1].getSalario());
		
			System.out.println("-------------------------------------------");
			//for (int j =0; j < funcionario1.length; j++) {
			System.out.println(funcionario1[0].getNome() + "\n" + funcionario1[0].getCargo() + "\nSalário com abono: R$"
					+funcionario1[0].getSalario());
			
		}

	

}
