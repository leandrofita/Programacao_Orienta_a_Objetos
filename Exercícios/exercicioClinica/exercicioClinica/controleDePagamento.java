package exercicioClinica;

public class controleDePagamento {
	
	private double totalPago;

	public double getTotalPago() {
		return totalPago;
	}


	public void calcularTotalPago(Plano plano) {
		
		this.totalPago += plano.getValorPago();
	}
	
	

}
