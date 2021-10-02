package exercicioOficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;
	

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super(modelo, dataConserto, proprietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double lavarVeiculo() {
		valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public Double trocarOleo() {
		valorCobrado = TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public Double revisao() {
		valorCobrado = TipoServico.REVISAO.getValorPorServico();
		return valorCobrado;
	}
	
		

}
