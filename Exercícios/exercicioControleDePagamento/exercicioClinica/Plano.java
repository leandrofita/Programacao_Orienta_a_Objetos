package exercicioClinica;

public class Plano {
	
	protected String empresa;
	protected double valorPago = 80.0;
	protected double valorIss = 5.0;
	
public Plano (String empresa) {
	super();
	this.empresa = empresa;
}
@Override
public String toString() {
	String mensagem = "Plano: " + empresa + "\nValor a ser Pago (sem os desconots) : R$" + String.format("%.2f", valorPago) + "\n";
	return mensagem;
	
	
}
 public Double calcularPagamento() {
	return valorPago = valorPago - valorPago * valorIss/100;
	 
 }
public double getValorPago() {
	return valorPago;
}
 
	
	

}
