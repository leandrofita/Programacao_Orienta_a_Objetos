package exercicioExcessao;

import java.util.Scanner;

public class ExercicioExcessaoInteiro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		try {
		int numero = ExercicioExcessaoInteiro.lerNumero();
		System.out.println("Parabéns! Você digitou o número: "+ numero);
		}catch (Exception e) { // o exception funciona pois é a raiz da classe de erros
			System.out.println("É possível que você não tenha digitado um número inteiro.");
		  }
		
	    		

	}
	        public static int lerNumero() throws Exception{ // A função com o "throws" obriga que vc insira um try e cath para tratar um erro ou um novo método com throws para uma outra função o trate no futuro.
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			in.close();
			return num;
			
		}

}
