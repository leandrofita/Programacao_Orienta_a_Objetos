package exercicioContatos;

public class Contato_main {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco ("Rua John Strider", "2ª Capitania", "00001-00");
		Telefone tele1 = new Telefone("2222-2222");
		Telefone tele2 = new Telefone("3333-3333");
		Estado estado1 = new Estado("Mata dos Trolls", "MT");
		Cidade cidade1 = new Cidade ("Trollburgo", estado1);
		Telefone[] telefone = new Telefone[2];
		telefone[0] = tele1;
		telefone[1] = tele2;
		
		Contato contato1 = new Contato("Hilda", endereco1, cidade1, estado1, telefone);
		
		
		System.out.println(contato1.toString()); 
		
		System.out.println("Telefones: ");
		contato1.mostrarTelefone();
		
		//contato1.mostrarTelefone();

	}

}
