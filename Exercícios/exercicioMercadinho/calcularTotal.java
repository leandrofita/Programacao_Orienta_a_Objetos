package exercicioMercadinho;

public class calcularTotal{
	
	private double totalPago;
	
		
	public double getTotalPago() {
		return totalPago;
	}

	
public double calcularTotalP(Produto produto) {
	
	this.totalPago += produto.getTotal();	
	return totalPago;
  }
}
