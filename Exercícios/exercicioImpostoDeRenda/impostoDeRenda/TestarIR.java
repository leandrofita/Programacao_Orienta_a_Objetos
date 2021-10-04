package impostoDeRenda;

public class TestarIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pessoaFisica p1 = new pessoaFisica("Tom Sawyer", 5000.0, "333.333-33", "33.33333-3");
		
		pessoaJuridica pj1 = new pessoaJuridica("Buba Gump", 100000.0, "6666-666-6", "8888888-88");
		
		System.out.println("Nome: "+ p1.nome + "\nRendimentos: " + p1.rendimentos + "\nCPF: " + p1.getCpf() + "\nRG: " + p1.getRg());
		p1.caculoIR();
		
		
		System.out.println("\n\n\nNome: "+ pj1.nome + "\nRendimentos: " + pj1.rendimentos + "\nCNPJ: " + pj1.getCnpj() + "\nI. Estadual: " + pj1.getInscEstadual());
		pj1.caculoIR();
		

	}

}
