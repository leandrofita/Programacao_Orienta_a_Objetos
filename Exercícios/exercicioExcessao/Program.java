package exercicioExcessao;

public class Program {

	public static void main(String[] args) {
		
		int [] numerador = {1,2,3,4,5,6};
		int [] denominador = {3,0,2};
		int i = 0;
		for (i = 0; i < numerador.length; i++);{
			try {
			System.out.println("Divisão de:" + numerador[i] + "por: "+ denominador[i]+ "=" + (numerador[i]/denominador[i]));
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um erro no momento da divisão, verifique os valores.");
				
			}
		}

	}

}
