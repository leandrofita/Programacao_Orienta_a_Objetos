package exercicioContatos;

import java.util.ArrayList;

public class Contato_main {

	public static void main(String[] args) {
		
		
		
		Estado estado1 = new Estado("Mata dos Trolls", "MT");
		Cidade cidade1 = new Cidade ("Trollburgo", estado1);
		Endereco endereco1 = new Endereco ("Rua John Strider", "2ª Capitania", "00001-00", cidade1);
		ArrayList<Telefone> telefone = new ArrayList<Telefone>();
		//Telefone[] telefone = new Telefone[1] ;
		Telefone tele1 = new Telefone("2222-2222");
		Telefone tele2 = new Telefone("3333-3333");
		//telefone[0] = tele1;
		//telefone[1] = tele2;
		
		Contato contato1 = new Contato("Hilda", endereco1, telefone);
		contato1.setTelefone(tele1);
		contato1.setTelefone(tele2);
		
/////////////////////////////////////		
		
		
		Cidade cidade2 = new Cidade ("Wolftown", estado1);
		Endereco endereco2 = new Endereco ("Night Pass Av.", "Long Nives Alley", "00334-00", cidade2);
		ArrayList<Telefone> telefone2 = new ArrayList<Telefone>();
		//Telefone[] telefone1 = new Telefone[1];
		Telefone tele3 = new Telefone("4444-4444");
		Telefone tele4 = new Telefone("5555-4444");
		Telefone tele5 = new Telefone("6666-4444");
		Contato contato2 = new Contato("Timoty Hunter", endereco2, telefone2);
		contato2.setTelefone(tele3);
		contato2.setTelefone(tele4);
		contato2.setTelefone(tele5);		
		//telefone1[0] = tele3;
		//telefone1[1] = tele4;
		//telefone1[2] = tele5;
		
		
		
		
		
		
		
		System.out.println(contato1.toString()); 
		System.out.println("\n-------------------------------------------\n"); 
		System.out.println(contato2.toString()); 
		
	}

}
