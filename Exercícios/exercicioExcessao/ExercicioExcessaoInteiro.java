package exercicioExcessao;

import java.util.Scanner;

public class ExercicioExcessaoInteiro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro: ");
		try {
		int numero = ExercicioExcessaoInteiro.lerNumero();
		System.out.println("Parab�ns! Voc� digitou o n�mero: "+ numero);
		}catch (Exception e) { // o exception funciona pois � a raiz da classe de erros
			System.out.println("� poss�vel que voc� n�o tenha digitado um n�mero inteiro.");
		  }
		
	    		

	}
	        public static int lerNumero() throws Exception{ // A fun��o com o "throws" obriga que vc insira um try e cath para tratar um erro ou um novo m�todo com throws para uma outra fun��o o trate no futuro.
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			in.close();
			return num;
			
		}

}
