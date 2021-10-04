package exercicioClinica;

public class controleDePagamento {
	
	private double totalPago;

	public double getTotalPago() {
		return totalPago;
	}


	public double calcularTotalPago(Plano plano) {
		
		return totalPago += plano.getValorPago();
	}
	
	

}
