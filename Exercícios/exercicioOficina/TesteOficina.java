package exercicioOficina;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Proprietario J = new Proprietario("John Cena");
		
		Carro c = new Carro ("Sedan", LocalDate.of(2021, 8, 7),J, "Transformer");
		
		c.revisao();
		c.trocarOleo();
		
		
		
		System.out.println("Propriet�rio: "+ c.proprietario);
		System.out.println("Modelo: " + c.modelo);
		System.out.println("Data do Servi�o: " + c.dataConserto);
		System.out.println("Categoria" + c.getCategoria());
		System.out.println("Valor total: " + c.valorCobrado);

	}
	
}
