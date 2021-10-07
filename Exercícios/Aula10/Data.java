package Aula10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {

	public static void main(String[] args) {
		
		LocalDateTime DiaHoje = LocalDateTime.now();
		LocalDateTime DataNasc = LocalDateTime.of(1993, 6, 18, 6, 28);
		DateTimeFormatter FormatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Duration intervalo = Duration.between(DataNasc, DiaHoje);
		boolean AnoBissexto = DataNasc.toLocalDate().isLeapYear();
		
		System.out.println("Hoje: " + DiaHoje.format(FormatoBr));
		System.out.println("Data de Nascimento: " + DataNasc.format(FormatoBr));
		int idadeReal = DataNasc.getYear() / 4;
		
		if (AnoBissexto) {
			
			
			System.out.println("Sim, voc� nasceu em um ano bissexto, sua verdadeira idade �: " + idadeReal);
			
		} else {
			
			System.out.println("Voc� n�o nasceu em um ano bissexto, sim, voc� � t�o velho quanto imagina.");

		}
		
		System.out.println("Segundos decorridos do nasicmento at� o dia de hoje: " + intervalo.getSeconds() + " segundos.");
		
		
		

	}

}
