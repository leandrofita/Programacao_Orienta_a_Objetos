package Aula10;

import java.util.HashMap;
import java.util.Map;

public class Mapa_main {

	public static void main(String[] args) {
		
		Map<String, String> Carro = new HashMap<String, String>();
		
		Carro.put("Volks", "Gol");
		Carro.put("Ford", "Fiesta");
		Carro.put("Audi", "A4");
		
		for (String s : Carro.keySet()) { // Pego somente a "chave"
			System.out.println("Marca: " + s);
		}
		for (String t : Carro.values()) {
			System.out.println("Modelo: " + t);// Pego somente o "valor"
		}
		
		for (Map.Entry<String, String> entry : Carro.entrySet()) { // Pego ambos os dados
			System.out.println("MOdelo: " + entry);
		}

	}

}
