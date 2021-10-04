package exercicioClinica;

public class TestaPlano {

	public static void main(String[] args) {
		
		Plano p = new Plano("UNILIXO");
		Clinica c = new Clinica ("UNILIXO", "Clínica do Quase Bem", "IDK");
		Medico m = new Medico("ABC", "John of God", 171);
		Anestesista a = new Anestesista("JÃJÃO CURATICOS", "Julio Mão de Chumbo", 1717, "Anestesia Quântica");
		controleDePagamento cp = new controleDePagamento();
		
		
		System.out.println(m.toString());
		System.out.printf(String.format("Valor a receber pelo procedimento: %.2f\n\n", m.calcularPagamento()));
		cp.calcularTotalPago(m);
		
		System.out.println(a.toString());
		System.out.printf(String.format("Valor a receber pelo procedimento: %.2f\n\n", a.calcularPagamento()));
		cp.calcularTotalPago(a);
		
		System.out.printf(String.format(c.toString()));
		System.out.printf(String.format("Valor a receber pelo procedimento: %.2f\n\n", c.calcularPagamento()));
		cp.calcularTotalPago(c);
		
		System.out.println("\nTotal pago pelo plano: R$" + String.format("%.2f", cp.getTotalPago()));
		
		
		
		

	}

}
