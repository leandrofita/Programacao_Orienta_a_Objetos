package exercicioMercadinho;

public abstract class Produto implements Venda {
	
	private String nome;
	private double valor;
	private double total;
	
	public Produto(String nome, double valor) {
		
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public double getTotal() {
		return total;
	}

	@Override
	public Double Vender(int quantidadeDeItens) {
		double venda = quantidadeDeItens * this.valor;
		total += venda;
		System.out.println("Quantidade: " + quantidadeDeItens);
		return total;
	}
	@Override
	public String toString() {
		String mensagem = "Produto: " + this.nome + "\nValor do produto: R$" + this.valor;
		return mensagem;
	}

}
